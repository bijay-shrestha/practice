package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SequentiallyBounded {

    public static void main(String[] args) {

//        int[] arrayOfNumbers = {1, 2, 3, 3, 3, 99, 99, 99, 99};
//        int[] arrayOfNumbers = {1, 2, 3};
//        int[] arrayOfNumbers = {2, 3, 3, 3, 3};
//        int[] arrayOfNumbers = {12, 12, 9};
//        int[] arrayOfNumbers = {0, 1};
//        int[] arrayOfNumbers = {-1, 2};
//        int[] arrayOfNumbers = {};
//        int[] arrayOfNumbers = {5, 5, 5, 5};
        int[] arrayOfNumbers = {5, 5, 5, 2, 5};

        log.info("Checking if given array {} is sequentially bounded. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", isSequentiallyBounded(arrayOfNumbers));
    }

    static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int elementToCompare = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) return 0;
            if (elementToCompare > a[i]) {
                log.info("The array {} is not in ascending order!!", a);
                return 0;
            }
            elementToCompare = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            int allowedCount = a[i] - 1;
            int actualCount = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    actualCount++;
                }
            }
            if (actualCount > allowedCount) {
                log.info("Actual Count of {} exceeded!", a[i]);
                return 0;
            }
        }
        return 1;

    }

}
