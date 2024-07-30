package com.java.task.practice.reactive.pub;

import com.java.task.practice.reactive.sub.Subscriber;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
public class DeferredPublisher<T> implements Publisher<T> {

    private final Supplier<Publisher<T>> supplier;
    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        supplier.get().subscribe(subscriber);
    }
}
