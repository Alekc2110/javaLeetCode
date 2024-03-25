package com.java.task.multithreadingPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    private AtomicInteger version = new AtomicInteger(0);
    private String data = "Initial Data";

    public void updateData(String newData) {
        // Получаем текущую версию данных
        int currentVersion = version.get();

        // Предполагаем, что данные не изменились
        // и выполняем операции без блокировки
        System.out.println("Thread " + Thread.currentThread().getId() + " is optimistic about data stability.");

        // Имитация длительной операции
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Проверяем, были ли изменения в данных другими потоками
        if (currentVersion == version.get()) {
            // Если нет, то применяем изменения
            data = newData;
            // Увеличиваем версию данных
            version.incrementAndGet();
            System.out.println("Thread " + Thread.currentThread().getId() + " successfully updated data.");
        } else {
            // Если были изменения, повторяем операцию
            System.out.println("Thread " + Thread.currentThread().getId() + " detected data changes, retrying.");
            updateData(newData);
        }
    }

    public String readData() {
        System.out.println("Thread " + Thread.currentThread().getId() + " reading data.");
        return data;
    }
}
