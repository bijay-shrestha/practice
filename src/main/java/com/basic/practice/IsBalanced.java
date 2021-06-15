/**
 * * A balanced array is defined to be an array where for every value n in the array, -n also is in the
 * * array. For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because 5
 * * is not in the array.
 * *
 * * Write a function named isBalanced that returns 1 if its array argument is a balanced array. Otherwise
 * * it returns 0.
 * *
 * * If you are programming in Java or C#, the function signature is
 * * int isBalanced (int [ ] a);
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsBalanced {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {-2, 3, 2, -3};
//        int[] arrayOfNumbers = {-2, 2, 2, 2};
        int[] arrayOfNumbers = {-5, 2, -2};
        log.info("Checking if the array {} is a balanced-array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual result: {}", isBalanced(arrayOfNumbers));
    }

    static int isBalanced(int[] a) {
        int len = a.length;

        for (int i = 0; i < len; i++) {
            boolean found = false;
            for (int j = 0; j < len; j++) {
                if (a[i] < 0) {
                    if (-a[i] == a[j]) {
                        found = true;
                        break;
                    }
                } else {
                    if (a[i] == -a[j]) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                return 0;
            }
        }

        return 1;
    }

}
