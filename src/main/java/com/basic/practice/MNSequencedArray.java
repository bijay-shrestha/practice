/**
 * Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers between m and n inclusive.
 *
 * Furthermore, the array must be in ascending order and contain only those integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced
 * array.
 *
 * The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced
 * array because the 0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.
 *
 * Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array, otherwise it returns 0.
 *
 * You may assume that m<=n
 *
 *
 * if a is                                      and m is     and n is      return  reason
 * {1, 2, 3, 4, 5}                                 1            5           1      because the array contains all the numbers between 1 and 5 inclusive in ascending order and no other numbers.
 * {1, 3, 4, 2, 5}                                 1            5           0      because the array is not in ascending order.
 * {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}       -5           -2           1      because the array contains all the numbers between -5 and -2 inclusive in ascending order and no other numbers. Note that duplicates are allowed.
 * {0, 1, 2, 3, 4, 5}                              1            5           0      because 0 is not in between 1 and 5 inclusive
 * {1, 2, 3, 4}                                    1            5           0      because there is no 5
 * {1, 2, 5}                                       1            5           0      because there is no 3 or 4
 * {5, 4, 3, 2, 1}                                 1            5           0      because the array does not start with a 1. Furthermore, it is not in ascending order.
 */



package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MNSequencedArray {

    public static void main(String[] args) {
//        int arrayOfNumbers[] = {1, 3, 4, 5, 8};
//        int m = 1;
//        int n = 5;
//
//        int arrayOfNumbers[] = {1, 3, 4, 2, 5};
//        int m = 1;
//        int n = 5;
//
//        int arrayOfNumbers[] = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
//        int m = -5;
//        int n = -2;
//
//        int arrayOfNumbers[] = {0, 1, 2, 3, 4, 5};
//        int m = 1;
//        int n = 5;
//
//        int arrayOfNumbers[] = {1, 2, 3, 4};
//        int m = 1;
//        int n = 5;
//
        int arrayOfNumbers[] = {1, 2, 5};
        int m = 1;
        int n = 5;
//
//        int arrayOfNumbers[] = {5, 4, 3, 2, 1};
//        int m = 1;
//        int n = 5;
        log.info("Checking if the array {} is sorted or not. Return true for Yes and false for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isSequencedArray(arrayOfNumbers, m, n));


    }

    static int isSequencedArray(int[] a, int m, int n) {
        boolean found = false;
        if (a.length == 0) {
            return 0;
        }
        if (!isArraySorted(a, a.length)) {
            return 0;
        }

        if (a[0] != m) {
            return 0;
        }

        if (a[a.length - 1] != n) {
            return 0;
        }

        for (int i = m; i <= n; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    found = true;
                    break;
                }
                if (j == a.length - 1) {
                    if (a[j] != i) {
                        return 0;
                    }
                }
            }
        }
        if (!found) {
            return 0;
        }
        return 1;
    }

    static boolean isArraySorted(int[] a, int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        return a[n - 1] >= a[n - 2] && isArraySorted(a, n - 1);
    }


}
