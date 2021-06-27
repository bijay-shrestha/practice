/**
 * * A Nice array is defined to be an array where for every value n in the array, there is also an
 * * element n-1 or n+1 in the array.
 * *
 * * For example, {2, 10, 9, 3} is a Nice array because
 * * 2 = 3-1
 * * 10 = 9+1
 * * 3 = 2 + 1
 * * 9 = 10 -1
 * * Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
 * * The array {3, 4, 5, 7} is not a Nice array because of the value 7 which requires that the array contains
 * * either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
 * * Write a function named isNice that returns 1 if its array argument is a Nice array. Otherwise it returns a 0.
 * *
 * * If you are programming in Java, the function signature is
 * * int isNice(int[ ] a)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NiceArray {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 10, 9, 3};
//        int[] arrayOfNumbers = {2, 2, 3, 3, 3};
//        int[] arrayOfNumbers = {1, 1, 1, 2, 1, 1};
//        int[] arrayOfNumbers = {0, -1, 1};
        int[] arrayOfNumbers = {3, 4, 5, 7};
        log.info("Checking if the array {} is a nice-array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isNice(arrayOfNumbers));
    }

    static int isNice(int[] a) {
        int len = a.length;
        boolean isNiceArray;

        for (int i = 0; i < len; i++) {
            isNiceArray = false;
            int num = a[i];
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                if (num + 1 == a[j] || num - 1 == a[j]) {
                    isNiceArray = true;
                    break;
                }
            }
            if (!isNiceArray) {
                return 0;
            }
        }
        return 1;
    }
}
