/**
 * * An array is defined to be odd-valent if it meets the following two conditions:
 * * a. It contains a value that occurs more than once
 * * b. It contains an odd number
 * *
 * * For example {9, 3, 4, 9, 1} is odd-valent because 9 appears more than once and 3 is odd. Other odd-valent
 * * arrays are {3, 3, 3, 3} and {8, 8, 8, 4, 4, 7, 2}
 * *
 * * The following arrays are not odd-valent:
 * * {1, 2, 3, 4, 5}  no value appears more than once.
 * * {2, 2, 2, 4, 4}  there are duplicate values but there is no odd value.
 * *
 * * Write a function name isOddValent that returns 1 if its array argument is odd-valent, otherwise it
 * * returns 0.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsOddValent {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {9, 3, 4, 9, 1};
//        int[] arrayOfNumbers = {3, 3, 3, 3};
//        int[] arrayOfNumbers = {8, 8, 8, 4, 4, 7, 2};
//        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
        int[] arrayOfNumbers = {2, 2, 2, 4, 4};
        log.info("Checking if the array {} is odd-valent. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual result: {}", isOddValent(arrayOfNumbers));
    }

    static int isOddValent(int[] a) {

        boolean hasOddNumber = false;
        boolean hasNumberRepeatedTwice = false;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i; j < len; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                hasNumberRepeatedTwice = true;
            }
            if (a[i] % 2 == 1) {
                hasOddNumber = true;
            }
        }
        if (hasOddNumber && hasNumberRepeatedTwice) {
            return 1;
        }
        return 0;

    }
}
