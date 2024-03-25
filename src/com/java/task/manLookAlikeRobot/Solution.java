package com.java.task.manLookAlikeRobot;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) throws InterruptedException {

//        Thread right = new Thread(new Foot("right"));
//        right.start();
//        Thread left = new Thread(new Foot("left"));
//        left.start();

        int legsNumber = 4;
        for (int i = 0; i < legsNumber; i++) {
            new Thread(new FootMultiple2("Leg: " + i, legsNumber)).start();
        }
    }
}

/**
 * make step by step for 2 legs
 */
class Foot implements Runnable{
    ReentrantLock lock = new ReentrantLock();
    private final String name;
    private static int currentLeg;

    Foot(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        while (true){
            step();
        }
    }

    @SneakyThrows
    private void step(){
        lock.lock();
        if((currentLeg == 0 && name.equals("left")) || (currentLeg == 1 && name.equals("right"))){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("step by " + name);
            currentLeg = (currentLeg + 1) %2;
        }
            lock.unlock();


    }
}


/**
 * make step by step for multi legs, impl. with ReentrantLock
 */
class FootMultiple implements Runnable {
    private static int NUM_LEGS; // Количество ног
    private static int currentLeg = 0; // Текущая нога
    private final ReentrantLock[] locks; // Массив блокировок
    private final String name; // Имя ноги

    public FootMultiple(String name, int numberLegs) {
        this.name = name;
        NUM_LEGS = numberLegs;
        this.locks = new ReentrantLock[NUM_LEGS];
        for (int i = 0; i < NUM_LEGS; i++) {
            locks[i] = new ReentrantLock();
        }
    }

    @Override
    public void run() {
        while (true) {
            step();
        }
    }

    private void step() {
        locks[currentLeg].lock(); // Захватываем блокировку для текущей ноги
        try {
            if (name.equals("Leg: " + currentLeg)) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Step by " + name);
                currentLeg = (currentLeg + 1) % NUM_LEGS; // Переходим к следующей ноге
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (locks[currentLeg].isHeldByCurrentThread()) {
                locks[currentLeg].unlock(); // Освобождаем блокировку для текущей ноги
            }
        }
    }
}


/**
 * make step by step for multi legs, impl. with synchronized block
 */
class FootMultiple2 implements Runnable {
    private static int numLegs; // Количество ног
    private static int currentLeg = 0; // Текущая нога
    private static Object[] locks; // Массив объектов для блокировки
    private final String name; // Имя ноги

    public FootMultiple2(String name, int legsNumber) {
        this.name = name;
        numLegs = legsNumber;
        locks = new Object[numLegs];
        // Инициализируем объекты блокировки
        for (int i = 0; i < numLegs; i++) {
            locks[i] = new Object();
        }
    }

    @Override
    public void run() {
        while (true) {
            step();
        }
    }

    private void step() {
        synchronized (locks[currentLeg]) { // Захватываем блокировку для текущей ноги
            try {
                if (name.equals("Leg: " + currentLeg)) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Step by " + name);
                    currentLeg = (currentLeg + 1) % numLegs; // Переходим к следующей ноге
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}