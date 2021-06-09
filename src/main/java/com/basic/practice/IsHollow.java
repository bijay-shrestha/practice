/**
 * * An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by
 * * the same number of non-zero elements. Furthermore, all the zeroes in the array must be in the middle of the array.
 * *
 * * Write a function named isHollow that accepts an integer array and returns 1 if it is a hollow array,
 * * otherwise it returns 0.
 * *
 * * If you are programming in Java
 * * int isHollow(int[ ] a)
 * *
 * * Examples:
 * *
 * * if the input array is            is hollow?              reason
 * *
 * * {1,2,0,0,0,3,4}                  yes                     2 non-zeros precede and follow 3 zeros in the middle
 * * {1,1,1,1,0,0,0,0,0,2,1,2,18}     yes                     4 non-zeros precede and follow the 5 zeros in the middle
 * * {1, 2, 0, 0, 3, 4}               no                      There are only 2 zeroes in the middle; at least 3 are required
 * * {1,2,0,0,0,3,4,5}                no                      The number of preceding non-zeros(2) is not equal to the number of following non-zeros(3)
 * * {3,8,3,0,0,0,3,3}                no                      The number of preceding non-zeros(3) is not equal to the number of following non-zeros(2)
 * * {1,2,0,0,0,3,4,0}                no                      Not all zeros are in the middle
 * * {0,1,2,0,0,0,3,4}                no                      Not all zeros are in the middle
 * * {0,0,0}                          yes                     The number of preceding non-zeros is 0 which equals the number of following non-zeros.
 * *                                                          And there are three zeros "in the middle".
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsHollow {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, 0, 0, 0, 3, 4};
//        int[] arrayOfNumbers = {1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18};
//        int[] arrayOfNumbers = {1, 2, 0, 0, 3, 4};
//        int[] arrayOfNumbers = {1, 2, 0, 0, 0, 3, 4, 5};
//        int[] arrayOfNumbers = {3, 8, 3, 0, 0, 0, 3, 3};
//        int[] arrayOfNumbers = {3, 8, 3, 0, 0, 0, 3, 3};
//        int[] arrayOfNumbers = {1, 2, 0, 0, 0, 3, 4, 0};
//        int[] arrayOfNumbers = {0, 1, 2, 0, 0, 0, 3, 4};
        int[] arrayOfNumbers = {0, 0, 0};
        log.info("Checking if the array {} is hollow. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isHollow(arrayOfNumbers));
    }

    static int isHollow(int[] a) {
        int precededByCount = 0;
        int followedByCount = 0;
        int zeroCount = 0;
        boolean begin = true;
        boolean mid = false;
        boolean end = false;
        boolean other = false;

        if (a.length < 3) return 0;
        for (int i = 0; i < a.length; i++) {
            /**
             * This If condition is to check only for array form {0,0,0)
             */
            if (a[i] == 0 && a.length >= 3) {
                if (a[i + 1] == 0 && a[i + 2] == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

            /**
             * This If condition is to check for preceding elements of array before 0
             */
            if (a[i] != 0 && !mid && !end && !other) {
                precededByCount++;
                continue;
            }
            begin = false;

            /**
             * This If condition is to check for zero elements of array in the middle.
             */
            if (a[i] == 0 && !begin && !end && !other) {
                zeroCount++;
                mid = true;
                continue;
            }
            mid = false;

            /**
             * This If condition is to check for elements followed by 0
             */
            if (a[i] != 0 && !begin && !mid && !other) {
                followedByCount++;
                end = true;
                continue;
            }
            end = false;

            /**
             * This If condition is to check If there's any elements left after Nonzero elements.
             */
            if (!begin && !mid && !end) {
                other = true;
                break;
            }
        }

        log.info("Preceded Non-zero Count: {}", precededByCount);
        log.info("Middle zero Count: {}", zeroCount);
        log.info("Followed by Non-zero Count: {}", followedByCount);

        if (precededByCount == followedByCount && zeroCount >= 3 && !other) {
            return 1;
        }

        return 0;

    }
}
