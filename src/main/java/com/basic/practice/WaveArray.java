/**
 * * A wave array is defined to an array which does not contain two even numbers or two odd
 * * numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
 * * arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
 * * other.
 * *
 * * Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it
 * * returns 0.
 * *
 * * If you are programming in Java, the function signature is
 * * int isWave (int [ ] a)
 */
package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaveArray {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {7, 2, 9, 10, 5};
//        int[] arrayOfNumbers = {4, 11, 12, 1, 6};
//        int[] arrayOfNumbers = {1, 0, 5};
//        int[] arrayOfNumbers = {2};
        int[] arrayOfNumbers = {2, 6, 3, 4};

        log.info("Checking if the array {} is a wave-array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isWave(arrayOfNumbers));
    }

    static int isWave(int[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            if ((a[i] % 2 == 0) == (a[i + 1] % 2 == 0)) {
                return 0;
            }
        }
        return 1;
    }
}
