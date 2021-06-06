/**
 * * Write a function named hasNValues which takes an array and an integer n as arguments. It returns true if all
 * * the elements of the array are one of n different values.
 * *
 * * If you are writing in Java or C#, the function signature is
 * * int hasNValues(int[ ] a, int n)
 * *
 * * Note that an array argument is passed by reference so that any change you make to the array in your function
 * * will be visible when the function returns. Therefore, you must not modify the array in your function! In other
 * * words, your function should have no side effects.
 * *
 * * if a is                              if n is         return
 * *
 * * {1, 2, 2, 1}                         2               1 (because there are 2 different element values, 1 and 2)
 * * {1, 1, 1, 8, 1, 1, 1, 3, 3}          3               1 (because there are 3 different element values, 1, 3, 8)
 * * {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}      10              1 (because there are 10 different element values)
 * * {1, 2, 2, 1}                         3               0 (because there are 2 different element values, not 3 as required)
 * * {1, 1, 1, 8, 1, 1, 1, 3, 3}          2               0 (because there are 3 different element values, not 2 as required)
 * * {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}      20              0 (because there are 10 different element values, not 20 as required)
 * *
 * *
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HasNValues {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, 2, 1};
//        int num = 2;

//        int[] arrayOfNumbers = {1, 1, 1, 8, 1, 1, 1, 3, 3};
//        int num = 3;

//        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
//        int num = 10;

//        int[] arrayOfNumbers ={1, 2, 2, 1};
//        int num = 3;

//        int[] arrayOfNumbers ={1, 1, 1, 8, 1, 1, 1, 3, 3};
//        int num = 2;

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 20;

        log.info("Checking if array={} has NValues with n={}. Return 1 for Yes and 0 for No.", arrayOfNumbers, num);
        log.info("Actual result: {}", hasNValues(arrayOfNumbers, num));
    }

    static int hasNValues(int[] a, int n) {
        int len = a.length;
        int total = 0;
        if (n > len) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j])
                    break;
            }
            if (i == j) {
                total++;

            }
        }
        log.info("Total repeated Values = {}", total);
        return total == n ? 1 : 0;
    }

}
