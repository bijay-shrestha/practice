/**
 * Write a function named largestAdjacentSum that iterates through an array computing the sum of adjacent
 * elements and returning the largest such sum. You may assume that the array has at least 2 elements.
 * <p>
 * If you are writing in Java, the function signature is
 * int largestAdjacentSum(int[ ] a)
 * <p>
 * Examples:
 * <p>
 * if a is                  return
 * <p>
 * {1, 2, 3, 4}             7 because 3+4 is larger than either 1+2 or 2+3
 * {18, -12, 9, -10}        6 because 18-12 is larger than -12+9 or 9-10
 * {1,1,1,1,1,1,1,1,1}      2 because all adjacent pairs sum to 2
 * {1,1,1,1,1,2,1,1,1}      3 because 1+2 or 2+1 is the max sum of adjacent pairs
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LargestAdjacentSum {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, 3, 4};
//        int[] arrayOfNumbers = {18, -12, 9, -10};
//        int[] arrayOfNumbers = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrayOfNumbers = {1, 1, 1, 1, 1, 2, 1, 1, 1};
        log.info("Finding the largest Adjacent Sum in an array {}. We get: {}",
                arrayOfNumbers, largestAdjacentSum(arrayOfNumbers));
    }

    static int largestAdjacentSum(int[] a) {
        int len = a.length;
        if (len < 2) {
            return a[0] + a[1];
        }
        int prevSum = a[0] + a[1];
        int largestSum = a[0];

        for (int i = 0; i < len - 1; i++) {
            if (i != 0)
                prevSum = largestSum;
            largestSum = a[i] + a[i + 1];
            if (prevSum >= largestSum) {
                largestSum = prevSum;
            }
        }
        return largestSum;
    }
}
