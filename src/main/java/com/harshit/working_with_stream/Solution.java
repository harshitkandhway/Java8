package com.harshit.working_with_stream;

import java.util.Arrays;

public class Solution {

    public static long countOccurances(int[] input, int value) {
        return Arrays.stream(input)
                .filter(number -> number == value)
                .count();
    }





    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3, 2, 3, 44, 2, 5, 6, 2};
        System.out.println(Solution.countOccurances(ar, 2));
    }

}
