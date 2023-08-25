package com.java.task.task01.task0101;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Part5 implements Runnable {
    private static final Object MONITOR = new Object();
    private static final int THREADS = 10;
    private static final int COLUMNS = 20;

    private RandomAccessFile raf;
    private int position;
    private String characters;

    public Part5(RandomAccessFile out, int position, String value, int stringLength) {
        this.raf = out;
        this.position = position;

        StringBuilder sb = new StringBuilder(stringLength);
        sb.append(String.valueOf(value).repeat(COLUMNS));
        sb.append(System.lineSeparator());
        characters = sb.toString();
    }
    @Override
    public void run() {
        RandomAccessFile raf = getRandomAccessFile();
        synchronized (MONITOR) {
            try {
                raf.seek(position);
                raf.write(characters.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private RandomAccessFile getRandomAccessFile() {
        return raf;
    }

    public static void main(String[] args) throws IOException, ExecutionException {
        String fileName = "part5.txt";
        Files.deleteIfExists(new File(fileName).toPath());
        File file = new File(fileName);

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            ExecutorService es = Executors.newFixedThreadPool(THREADS);
            ArrayList<Future<?>> futureTasks = new ArrayList<>();

            int position = 0;
            for (int currentNumber = 0; currentNumber < THREADS; currentNumber++) {
                String value = String.valueOf(currentNumber);
                int charsLength = COLUMNS * value.length();
                int stringLength = charsLength + System.lineSeparator().length();

                Future<?> task = es.submit(new Part5(raf, position, value, stringLength));
                futureTasks.add(task);
                position += stringLength;
            }

            for (Future<?> task : futureTasks) {
                task.get();
            }
            es.shutdown();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(new String(Files.readAllBytes(file.toPath())));
    }
}
