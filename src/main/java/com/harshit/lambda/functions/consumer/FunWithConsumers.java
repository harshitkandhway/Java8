package com.harshit.lambda.functions.consumer;

public class FunWithConsumers {
    public static void main(String[] args) {
        Consumer<String> myFunction = System.out::println;
        myFunction.accept("harshit");
    }
}
