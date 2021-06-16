/**
 * * An array is called balanced if its even numbered elements (a[0], a[2], etc.) are even and its odd
 * * numbered elements (a[1], a[3], etc.) are odd.
 * *
 * * Write a function named isBalanced that accepts an array of integers and returns 1 if the array is
 * * balanced, otherwise it returns 0.
 * *
 * * Examples: {2, 3, 6, 7} is balanced since a[0] and a[2] are even, a[1] and a[3] are odd. {6, 7, 2, 3, 12}
 * * is balanced since a[0], a[2] and a[4] are even, a[1] and a[3] are odd.
 * * {7, 15, 2, 3} is not balanced since a[0] is odd.
 * * {16, 6, 2, 3} is not balanced since a[1] is even.
 * *
 * * If you are programming in Java, the function signature is
 * * int isBalanced(int[ ] a)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Balanced {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 3, 6, 7};
//        int[] arrayOfNumbers = {6, 7, 2, 3, 12};
//        int[] arrayOfNumbers = {7, 15, 2, 3};
        int[] arrayOfNumbers = {16, 6, 2, 3};
        log.info("Checking if the array {} is balanced. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isBalanced(arrayOfNumbers));
    }

    static int isBalanced(int[] a) {
        boolean flag = true;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                if (a[i] % 2 != 0) {
                    flag = false;
                    break;
                }
            } else {
                if (a[i] % 2 == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag ? 1 : 0;
    }
}
