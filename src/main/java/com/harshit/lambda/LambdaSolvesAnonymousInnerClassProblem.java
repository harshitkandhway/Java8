package com.harshit.lambda;

public class LambdaSolvesAnonymousInnerClassProblem {
    public static void main(String[] args) {
        Thread t;
        t = new Thread(()-> System.out.println("Thread using lambda"));
        t = new Thread(()-> System.out.println("Thread using lambda"));
        t = new Thread(()-> System.out.println("Thread using lambda"));
        t = new Thread(()-> System.out.println("Thread using lambda"));
    t.start();
    }
    /*
    InvokeDynamic is used instead of anonymous inner class.As a result no such inner classes are
    made.
     */
}
