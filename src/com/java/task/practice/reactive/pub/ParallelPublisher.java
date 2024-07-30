package com.java.task.practice.reactive.pub;

import com.java.task.practice.reactive.Subscription;
import com.java.task.practice.reactive.sub.Subscriber;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.*;

public class ParallelPublisher<T> implements Publisher<T> {
    private final Publisher<T> upstream;
    private final ThreadPoolExecutor executor;

    public ParallelPublisher(Publisher<T> upstream, int parallelism) {
        this.upstream = upstream;
        executor = new ThreadPoolExecutor(parallelism, parallelism,
                0, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
    }

    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        upstream.subscribe(new ParallelSubscriber(subscriber));
    }

    @RequiredArgsConstructor
    private class ParallelSubscriber implements Subscriber<T> {

        private final Subscriber<? super T> subscriber;

        @Override
        public void onSubscribe(Subscription subscription) {
            subscriber.onSubscribe(subscription);
        }

        @Override
        public void onNext(T value) {
            executor.submit(() -> subscriber.onNext(value));

        }

        @Override
        public void onComplete() {
            subscriber.onComplete();
            executor.shutdown();
        }

        @Override
        public void OnError() {

        }
    }
}
