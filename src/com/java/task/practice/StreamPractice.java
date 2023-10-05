package com.java.task.practice;


import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        Stack<String> stack = Stream.of("Hello", "Hey", "How", "Are", "You").collect(toStack());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }

    private static <T> Collector<T, ?, Stack<T>> toStack() {
        return Collector.of(
                Stack::new,
                Stack::push,
                (ts, ts2) -> {
                    ts.addAll(ts2);
                    return ts;
                },
                Collector.Characteristics.CONCURRENT
        );

    }
}
