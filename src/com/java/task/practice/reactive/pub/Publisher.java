package com.java.task.practice.reactive.pub;

import com.java.task.practice.reactive.sub.ConsumingSubscriber;
import com.java.task.practice.reactive.sub.Subscriber;
import com.java.task.practice.reactive.sub.MySubscriber;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);

    default List<T> collect(){
        MySubscriber<T> subscriber = new MySubscriber<>();
        subscribe(subscriber);
        return subscriber.blockingGet();
    }

    default void consume(Consumer<T> consumer){
        ConsumingSubscriber<T> subscriber = new ConsumingSubscriber<>(consumer);
        subscribe(subscriber);
    }

    default <R> Publisher<R> map(Function<T,R> mapper){
        return new MapPublisher<>(this, mapper);

    }

    default Publisher<T> peek(Consumer<T> consumer){
        return new MapPublisher<>( this, value -> {
            consumer.accept(value);
            return value;
        });

    }
    default Publisher<T> parallel(int parallelism){
        return new ParallelPublisher<>(this, parallelism);
    }

    static<V> Publisher<V> defer(Supplier<Publisher<V>> supplier){
      return new DeferredPublisher<>(supplier);
    }

    static<V> Publisher<V> from(Supplier<V> supplier){
        return new DeferredPublisher<>(()-> Publisher.just(supplier.get()));
    }
    @SafeVarargs
    static <V> Publisher<V> just(V... values){
        return new MyPublisher<>(values);
    }
}
