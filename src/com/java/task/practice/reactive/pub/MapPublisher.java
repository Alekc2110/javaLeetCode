package com.java.task.practice.reactive.pub;

import com.java.task.practice.reactive.Subscription;
import com.java.task.practice.reactive.sub.Subscriber;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class MapPublisher<T, R> implements Publisher<R> {
    private final Publisher<T> source;
    private final Function<T,R> mapper;
    @Override
    public void subscribe(Subscriber<? super R> subscriber) {
        source.subscribe(new MapSubscriber(subscriber));


    }

    @RequiredArgsConstructor
    private class MapSubscriber implements Subscriber<T> {

        private final Subscriber<? super R> subscriber;

        @Override
        public void onSubscribe(Subscription subscription) {
         subscriber.onSubscribe(subscription);
        }

        @Override
        public void onNext(T value) {
            subscriber.onNext(mapper.apply(value));

        }

        @Override
        public void onComplete() {
            subscriber.onComplete();

        }

        @Override
        public void OnError() {

        }
    }
}
