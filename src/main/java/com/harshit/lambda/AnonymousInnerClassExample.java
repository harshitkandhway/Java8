package com.harshit.lambda;

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Thread th;

        th = new Thread(new Runnable() {
            public void run() {
                System.out.println("In another thread");
            }
        });

        th = new Thread(new Runnable() {
            public void run() {
                System.out.println("In another thread");
            }
        });

        th = new Thread(new Runnable() {
            public void run() {
                System.out.println("In another thread");
            }
        });

        th = new Thread(new Runnable() {
            public void run() {
                System.out.println("In another thread");
            }
        });

        th.start();
    }

    /*
    * Build the class having the inner anonymous classes like the new Runnable and start the threads
    * Go to the target folder and open in terminal
    * run command dir to find all the files present in the target directory at specific package.
    * You will observe the inner classes as shown below :
    *
    *  Directory of C:\dev\java8\target\classes\com\harshit\lambda

01-11-2019  12:17    <DIR>          .
01-11-2019  12:17    <DIR>          ..
01-11-2019  12:17               747 AnonymousInnerClassExample$1.class
01-11-2019  12:17               747 AnonymousInnerClassExample$2.class
01-11-2019  12:17               747 AnonymousInnerClassExample$3.class
01-11-2019  12:17               747 AnonymousInnerClassExample$4.class
01-11-2019  12:17               942 AnonymousInnerClassExample.class
               5 File(s)          3,930 bytes

    * */
}
