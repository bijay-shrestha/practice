/**
 *
 * * An array is defined to be complete if the conditions (a), (d) and (e) below hold.
 * *    a. The array contains even numbers
 * *    b. Let min be the smallest even number in the array.
 * *    c. Let max be the largest even number in the array.
 * *    d. min does not equal max
 * *    e. All numbers between min and max are in the array
 * *
 * * For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
 * *    a. The array contains even numbers
 * *    b. 2 is the smallest even number
 * *    c. 8 is the largest even number
 * *    d. 2 does not equal 8
 * *    e. the numbers 3, 4, 5, 6, 7 are in the array.
 * *
 * * Examples of arrays that are not complete are:
 * * {5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
 * * {2, 2} condition (d) does not hold
 * * {2, 6, 3, 4} condition (e) does not hold (5 is missing)
 * *
 * * Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise
 * * it returns 0.
 * *
 * * If you are writing in Java or C#, the function signature is
 * * int isComplete (int[ ] a)
 *
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsComplete {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
//        int[] arrayOfNumbers = {5, 7, 9, 13};
//        int[] arrayOfNumbers = {2, 2};
        int[] arrayOfNumbers = {2, 6, 3, 4};

        log.info("Checking if the array {} is complete. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual result: {}", isComplete(arrayOfNumbers));
    }

    static int isComplete(int[] a) {
        int len = a.length;

        int max = 0;
        int min = 0;
        int tempMax = 0;
        int tempMin = 0;

        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                continue;
            }
            if (max == 0 && tempMax == 0) {
                tempMax = a[i];
            }
            if (min == 0 && tempMin == 0) {
                tempMin = a[i];
            }
            // [START] - TO FIGURE OUT MAX EVEN NUMBER
            if (tempMax >= a[i]) {
                max = tempMax;
            } else {
                max = a[i];
            }

            if (tempMax >= max) {
                max = tempMax;
            } else {
                tempMax = max;
            }
            // [END] - TO FIGURE OUT MAX EVEN NUMBER


            // [START] - TO FIGURE OUT MIN EVEN NUMBER
            if (tempMin <= a[i]) {
                min = tempMin;
            } else {
                min = a[i];
            }

            if (tempMin <= min) {
                min = tempMin;
            } else {
                tempMin = min;
            }
            // [END] - TO FIGURE OUT MAX EVEN NUMBER

        }
        log.info("Max Even : {}", max);
        log.info("Min Even: {}", min);

        for (int i = min + 1; i < max; i++) {
            boolean found = false;
            for (int j = 0; j < len; j++) {
                if (a[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }

        if (min != max) {
            return 1;
        }

        return 0;
    }
}
