package com.java.task.practice.reactive.sub;

import com.java.task.practice.reactive.Subscription;

public interface Subscriber<T>  {
    void onSubscribe(Subscription subscription);
    void onNext(T value);
    void onComplete();
    void OnError();

}
