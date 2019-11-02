package com.harshit.lambda;

import java.util.function.Function;

public class UserDefinedFunctionalTnterfaceExample {
    public static void main(String[] args) {
        UserDefinedFunctionalInterface userFunction = System.out::println;
        userFunction.myFunction("Harshit");
    }
}
