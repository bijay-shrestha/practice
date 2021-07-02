/**
 * * Write a function sumIsPower with signature  boolean sumIsPower(int[] arr)
 * * which outputs true if the sum of the elements in the input array arr is a power of 2, false otherwise.
 * *
 * * Recall that the powers of 2 are 1, 2, 4, 8, 16, and so on.
 * * In general a number is a power of 2 if and only if it is of the form 2^n for some non-negative integer n.
 * *
 * * You may assume (without verifying in your code) that all elements in the array
 * * are positive integers.
 * *
 * * If the input array arr is null, the return value should be false.
 * *
 * * Examples: sumIsPower({8,8,8,8}) is true since 8 + 8 + 8 + 8 = 32 = 2^5 .
 * * sumIsPower({8,8,8}) is false, since 8 + 8 +8 = 24, not a power of 2.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumIsPower {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {8, 8, 8, 8};
        log.info("Checking if the array {} has the property SumIsPower or not. Return true for Yes and false for No.", arrayOfNumbers);
        log.info("Actual Result: {}", sumIsPower(arrayOfNumbers));
    }

    static boolean sumIsPower(int[] a) {
        if (a == null) {
            return false;
        }
        boolean sumIsPower = false;
        int len = a.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += a[i];
        }
        int n = sum;
        log.info("Sum: {}", sum);
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }
}
