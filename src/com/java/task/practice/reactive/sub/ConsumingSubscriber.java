package com.java.task.practice.reactive.sub;

import com.java.task.practice.reactive.Subscription;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ConsumingSubscriber<T> implements Subscriber<T> {

    private final Consumer<T> consumer;

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(T value) {
        consumer.accept(value);
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void OnError() {

    }
}
