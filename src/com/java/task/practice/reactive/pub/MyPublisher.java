package com.java.task.practice.reactive.pub;

import com.java.task.practice.reactive.Subscription;
import com.java.task.practice.reactive.sub.Subscriber;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class MyPublisher<T> implements Publisher<T> {
    private final T[] values;
    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
      Subscription subscription = new MySubscription(subscriber);
      subscriber.onSubscribe(subscription);
    }

    @RequiredArgsConstructor
    private final class MySubscription implements Subscription{

        private final Subscriber<? super T> subscriber;
        private int position = 0;

        @Override
        public void request(long n) {
            for (int i = 0; i < n; i++) {
                if(position == values.length){
                    subscriber.onComplete();
                    return;
                }
                subscriber.onNext(values[position++]);
            }

        }
    }
}
