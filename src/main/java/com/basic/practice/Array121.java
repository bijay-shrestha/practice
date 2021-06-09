/**
 * Define an array to be a 121 array if all its elements are either 1 or 2 and it begins with one or more 1s followed by a one or more 2s
 * and then ends with the same number of 1s that it begins with. Write a method named is121Array that returns 1 if its array argument is
 * a 121 array, otherwise, it returns 0.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Array121 {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, 1};
//        int[] arrayOfNumbers = {1, 1, 2, 2, 2, 1, 1};
//        int[] arrayOfNumbers = {1, 1, 2, 2, 2, 1, 1, 1};
//        int[] arrayOfNumbers = {1, 1, 2, 1, 2, 1, 1};
//        int[] arrayOfNumbers = {1, 1, 1, 2, 2, 2, 1, 1, 1, 3};
//        int[] arrayOfNumbers = {1, 1, 1, 1, 1, 1};
//        int[] arrayOfNumbers = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};
//        int[] arrayOfNumbers = {1, 1, 1, 2, 2, 2, 1, 1, 2, 2};
        int[] arrayOfNumbers = {2, 2, 2};

        log.info("Checking if given array {} is sequentially bounded. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", is121Array(arrayOfNumbers));
    }

    static int is121Array(int[] a) {

        int countBeginningOnes = 0;
        int countEndingOnes = 0;
        int countMiddleTwos = 0;
        boolean beginningOnes = false;
        boolean middleTwos = false;
        boolean endingOnes = false;

        if (a[0] != 1) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 && !middleTwos && !endingOnes) {
                beginningOnes = true;
                countBeginningOnes++;
                continue;
            }
            beginningOnes = false;
            if (a[i] == 2 && !beginningOnes && !endingOnes) {
                middleTwos = true;
                countMiddleTwos++;
                continue;
            }
            middleTwos = false;
            if (a[i] == 1 && !beginningOnes && !middleTwos) {
                countEndingOnes++;
                endingOnes = true;
                continue;
            }
        }

        log.info("Beginning 1: {}", countBeginningOnes);
        log.info("Middle 2: {}", countMiddleTwos);
        log.info("Ending 1: {}", countEndingOnes);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3 || a[i] == 4 || a[i] == 5 || a[i] == 6 || a[i] == 7 || a[i] == 8 || a[i] == 9 || a[i] == 0) {
                return 0;
            }
        }

        if (countBeginningOnes != countEndingOnes) {
            return 0;
        }
        if (countMiddleTwos == 0) {
            return 0;
        }

        return 1;
    }
}

