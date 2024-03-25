package com.java.task.multithreadingPractice;

public class OptimisticLockingExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Потоки пытаются обновить данные оптимистически
        new Thread(() -> sharedResource.updateData("Updated Data 1")).start();
        new Thread(() -> sharedResource.updateData("Updated Data 2")).start();

        // Поток, который читает данные
        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Read Data: " + sharedResource.readData());
        }).start();
    }
}
