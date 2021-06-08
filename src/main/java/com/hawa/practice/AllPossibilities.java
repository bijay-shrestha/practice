/**
 * * A non-empty array a of length n is called an array of all possiblities if it contains all numbers between 0
 * * and a.length-1 inclusive.
 *
 * * Write a method named isAllPossibilities that accepts an integer array and returns 1 if
 * * the array is an array of all possiblities, otherwise it returns 0.
 * *
 * * If you are programming in Java or C#, the function signature is
 * * int isAllPossibilities(int[ ] a)
 * *
 * * If the input array is        return
 * *
 * * {1, 2, 0, 3}                 1
 * * {3, 2, 1, 0}                 1
 * * {1, 2, 4, 3}                 0 (because 0 not included and 4 is too big)
 * * {0, 2, 3}                    0 (because 1 is not included)
 * * {0}                          1
 * * {}                           0
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AllPossibilities {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, 0, 3};
//        int[] arrayOfNumbers = {3, 2, 1, 0};
//        int[] arrayOfNumbers = {1, 2, 4, 3};
//        int[] arrayOfNumbers = {0, 2, 3};
//        int[] arrayOfNumbers = {0};
        int[] arrayOfNumbers = {};
        log.info("Checking if the array {} is an array of all possibilities. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isAllPossibilities(arrayOfNumbers));
    }

    static int isAllPossibilities(int[] a) {
        boolean flag = false;
        if (a.length == 0) {
            return 0;
        }
        int[] arr = sortedArray(a);
        log.info("sorted array is {}", arr);
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            if (i == arr[i] && i <= arrLen - 1) {
                flag = true;
                continue;
            }
            flag = false;
            break;
        }
        return flag ? 1 : 0;
    }

    static int[] sortedArray(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
