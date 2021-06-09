//Todo: This is not completed

/**
 * An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.
 *
 * Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is zero-plentiful, otherwise it
 * returns 0.
 *
 * If you are programming in Java or C#, the function signature is
 * int isZeroPlentiful(int[ ] a)
 *
 * a is                                                    then function returns                   reason
 *{0, 0, 0, 0, 0}                                          1                                       because there is one sequence of 0s and its length >= 4.
 * {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}           2                                       because there are two sequences of 0s and both have lengths >= 4.
 * {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}     3                                       because three are three sequences of zeros and all have length >=4
 * {1, 2, 3, 4}                                            0                                       because there must be at least one 0.
 * {1, 0, 0, 0, 2, 0, 0, 0, 0}                             1                                       because there is a sequence of zeros whose length is less < 4.
 * {0}                                                     0                                       because there is a sequence of zeroes whose length is < 4.
 * {}                                                      0                                       because there must be at least one 0.
 *
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ZeroPlentiful {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {0, 0, 0, 0, 0};
//        int[] arrayOfNumbers = {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};
//        int[] arrayOfNumbers = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
//        int[] arrayOfNumbers = {1, 2, 3, 4};
//        int[] arrayOfNumbers = {1, 0, 0, 0, 2, 0, 0, 0, 0};
//        int[] arrayOfNumbers = {0};
        int[] arrayOfNumbers = {};
        log.info("Checking if the given array {} is Zero Plentiful:", arrayOfNumbers);
        log.info("Actual Result: {}", isZeroPlentiful(arrayOfNumbers));
    }

    static int isZeroPlentiful(int[] a) {

        int zeroCount = 0;
        if (a.length < 3) {
            return 0;
        }
        int len = a.length - 3;
        for (int i = 0; i < len; i++) {

            if (a[i] != 0) {
                continue;
            } else {
                boolean found = a[i + 1] == 0 && a[i + 2] == 0 && a[i + 3] == 0;
                if (found) {
                    zeroCount = zeroCount + 1;
                    i += 3;
                }
            }
        }
        return zeroCount;
    }
}
