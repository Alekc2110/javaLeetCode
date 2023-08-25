package com.java.task.task01.task0101;

public class MyRunnable implements Runnable {
    private  int count = 0;

    @Override
    public void run() {
//        synchronized (this) {
            for (int i = 0; i < 1_000_000; i++) {

                this.count++;

            }
//        }
        System.out.println(Thread.currentThread().getName()
        + " : " +  this.count);
    }

}
