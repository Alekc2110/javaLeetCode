package com.java.task.practice.reactive;

import com.java.task.practice.reactive.pub.Publisher;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        List<String> collect = Publisher.just(1, 2, 3)
                .map(i -> i + "!")
                .peek(s -> System.out.println(s + "*"))
                .collect();
        System.out.println(collect);
        System.out.println();
//
//        List<String> collect1 = Publisher.defer(()-> Publisher.just(1, 2, 3))
//                .map(i -> i + "+")
//                .peek(s -> System.out.println(s + "***"))
//                .collect();
//        System.out.println(collect1);
//        System.out.println();
//
//        List<String> collect2 = Publisher.from(()-> 3)
//                .map(i -> i + "!!!")
//                .peek(s -> System.out.println(s + "!!!"))
//                .collect();
//        System.out.println(collect2);
//        System.out.println();
//


//        Publisher.just( 3, 7, 10)
//                .map(i -> i + 1)
//                .consume(System.out::println);
//        System.out.println();


//        Publisher.just( 10, 20, 30)
//                .parallel(3)
//                .map(i -> {
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    return i + 1;
//                })
//                .consume(System.out::println);
    }
}
