package com.java.task.task01.task0101;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
    default Integer valueOf(String type){
       return Integer.valueOf(type);
    }

}