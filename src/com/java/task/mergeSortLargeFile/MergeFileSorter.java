package com.java.task.mergeSortLargeFile;

import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class MergeFileSorter implements FileSorter {

    private static final int LINE_LENGTH = 30;

    private final int chunkCount = 0;

    @Override
    public void sort(String inputPath, String outputPath) {
        try {
            long fileSize = Files.size(Path.of(inputPath));
            int batchSize = (int) fileSize / (chunkCount * LINE_LENGTH);

            writeChunks(inputPath, batchSize);

            mergeAndSort(inputPath, outputPath, batchSize);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void mergeAndSort(String inputPath, String outputPath, int batchSize) throws IOException {
        Path chunkFolder = getChunkFolder(inputPath);

        List<Path> chunks = Files.walk(chunkFolder).filter(path -> !Files.isDirectory(path)).toList();

        Iterator<String> mergedIterator = new MergedIterator(chunks);
        Path path = Path.of(outputPath);

        Files.writeString(path, "");
        List<String> lines = new ArrayList<>(batchSize);
        while (mergedIterator.hasNext()) {
            String line = mergedIterator.next();

            lines.add(line);
            if (lines.size() >= batchSize) {
                Files.write(path, lines, StandardOpenOption.APPEND);
                lines.clear();
            }
        }
        if (!lines.isEmpty()) {
            Files.write(path, lines, StandardOpenOption.APPEND);
        }

    }

    private void writeChunks(String inputPath, int batchSize) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            String line = reader.readLine();

            List<String> lines = new ArrayList<>(batchSize);
            int index = 0;

            while (line != null) {
                lines.add(line);
                if (lines.size() >= batchSize) {
                    Collections.sort(lines);
                    Files.write(getChunkFileName(inputPath, index), lines);
                    lines.clear();
                    index++;
                }
                line = reader.readLine();
            }
            if (!lines.isEmpty()) {
                Collections.sort(lines);
                Files.write(getChunkFileName(inputPath, index), lines);
            }
        }
    }

    private Path getChunkFolder(String inputPath) {
        Path parent = Path.of(inputPath).getParent();

        return parent.resolve("chunks");
    }

    private Path getChunkFileName(String inputPath, int index) {
        return getChunkFolder(inputPath).resolve(index + ".txt");
    }

    class MergedIterator implements Iterator<String> {
        private final List<Iterator<String>> iterators;

        private final String[] currentData;

        public MergedIterator(List<Path> paths) {
            iterators = paths.stream().map(this::streamLines).map(Stream::iterator).toList();
            currentData = iterators.stream().map(Iterator::next).toArray(String[]::new);
        }

        private Stream<String> streamLines(Path path) {
            try {
                return Files.lines(path);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        @Override
        public boolean hasNext() {
            return iterators.stream().anyMatch(Iterator::hasNext);
        }

        @Override
        public String next() {
            String minLine = null;
            int minIndex = -1;
            for (int i = 0; i < currentData.length; i++) {
                if (currentData[i] != null && (minLine == null || currentData[i].compareTo(minLine) == -1)) {
                    minLine = currentData[i];
                    minIndex = i;
                }
            }
            Iterator<String> minIterator = iterators.get(minIndex);
            currentData[minIndex] = minIterator.hasNext() ? minIterator.next() : null;
            return minLine;
        }
    }
}