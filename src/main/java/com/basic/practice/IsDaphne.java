/**
 * * A Daphne array is an array that contains either all odd numbers or all even numbers. For example,
 * * {2, 4, 2} (only even numbers) and {1, 3, 17, 5} (only odd numbers) are Daphne arrays but {3, 2, 5} is
 * * not because it contains both odd and even numbers.
 * *
 * * Write a function named isDaphne that returns 1
 * * if its array argument is a Daphne array. Otherwise it returns 0.
 * *
 * * If you are programming in Java, the function prototype is
 * * int isDaphne (int[ ] a);
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsDaphne {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 4, 6};
//        int[] arrayOfNumbers = {1, 3, 17, 5};
        int[] arrayOfNumbers = {3, 2, 5};
        log.info("Checking if the array {} is Daphne or not. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isDaphne(arrayOfNumbers));
    }

    static int isDaphne(int[] a) {
        boolean oddArray = false;
        boolean evenArray = false;
        int len = a.length;

        if (len == 0) {
            return 0;
        }
        if (a[0] == 0) {
            return 0;
        }

        if (a[0] % 2 == 0) {
            evenArray = true;
        } else {
            oddArray = true;
        }

        if (oddArray) {
            for (int i = 0; i < len; i++) {
                if (a[i] % 2 == 0) {
                    return 0;
                }
            }
        }

        if (evenArray) {
            for (int i = 0; i < len; i++) {
                if (a[i] % 2 == 1) {
                    return 0;
                }
            }
        }
        return 1;
    }

}
