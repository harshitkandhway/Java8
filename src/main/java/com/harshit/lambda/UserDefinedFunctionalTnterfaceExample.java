package com.harshit.lambda;

import java.util.function.Function;

public class UserDefinedFunctionalTnterfaceExample {

    public void print(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        UserDefinedFunctionalInterface userFunction = System.out::println;
        userFunction.myFunction("Harshit");
    }
}
