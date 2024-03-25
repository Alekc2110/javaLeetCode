package com.java.task.multithreadingPractice;

import java.util.concurrent.*;

public class CFExample {

    public static int runOuterFunc1()  {
        try {
            Thread.sleep(9000);
            System.out.println("inside runOuterFunc1: " + Thread.currentThread().getName());
            throw new RuntimeException();
//            return  2;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int runOuterFunc2(){
        try {
            Thread.sleep(9000);
            System.out.println("inside runOuterFunc2: " + Thread.currentThread().getName());
            return  3;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int runOuterFunc3(int value){
        try {
            Thread.sleep(9000);
            System.out.println("inside runOuterFunc3: " + Thread.currentThread().getName());
            return value * 3;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(CFExample::runOuterFunc2);
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(()-> runOuterFunc3(10));
//        CompletableFuture<Integer> future2 = new CompletableFuture<>();
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        ForkJoinPool joinPool2 = new ForkJoinPool(5);

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(CFExample::runOuterFunc1)
                .exceptionally(th -> {
                    System.out.println(th.getClass() + "***");
                    return -1;
                })
                .thenApplyAsync(r ->
                {
                    System.out.println("inside thenApply: " + Thread.currentThread().getName());
                    return r + 10;
                }, joinPool2);
//                .thenAcceptAsync(res -> {
//                    System.out.println(res);
//                    System.out.println("inside thenAccept: " + Thread.currentThread().getName());
//                }, joinPool);

        CompletableFuture<Integer> future3 = future2.thenApplyAsync(i -> i * 10);
        future3.completeOnTimeout(10, 5, TimeUnit.SECONDS);

        System.out.println(future3.thenCombine(future1, (r3, r1) ->{
            System.out.println("r1: " + r1 + " " + "r3: " + r3);
            return  r1 * r3;
        }).get());


        Thread.sleep(10000);
executor.shutdown();
        System.out.println(Thread.currentThread().getName());
        System.out.println("done!");
    }
}
