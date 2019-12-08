package com.harshit.lambda.functions.consumer;

@FunctionalInterface
public interface Consumer<T> {
    //int accept(T t);
    void accept(T t);
}
