/**
 * * An array with an odd number of elements is said to be centered if all elements (except the middle one) 
 * * are strictly greater than the value of the middle element.
 * * 
 * * Note that only arrays with an odd number of elements have a middle element.
 * * 
 * * Write a function named isCentered that accepts an integer array and returns 1 if it is a centered array,
 * * otherwise it returns 0.
 * * 
 * * Examples:
 * * 
 * *    - {5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other elements),
 * *    - {3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements),
 * *    - {3, 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements),
 * *    - {3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even number of elements),
 * *    - {} is not centered (no middle element),
 * *    - {1} is centered (satisfies the condition vacuously).
 * * 
 * * If you are programming in Java or C#, the function signature is
 * * int isCentered(int[ ] a)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Centered {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {5, 3, 3, 4, 5};
//        int[] arrayOfNumbers = {3, 2, 1, 4, 5};
//        int[] arrayOfNumbers = {3, 2, 1, 4, 1};
//        int[] arrayOfNumbers = {3, 2, 1, 1, 4, 6};
//        int[] arrayOfNumbers = {};
        int[] arrayOfNumbers = {1};

        log.info("Checking if the array {} is centered. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isCentered(arrayOfNumbers));
    }

    static int isCentered(int[] a) {
        int len = a.length;
        if (len == 3) {
            return 0;
        }
        if (len % 2 == 0) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }
        int centeredElem = a[len / 2];
        for (int i = 0; i < len; i++) {
            if (i == len / 2) {
                continue;
            }
            if (a[i] <= centeredElem) {
                return 0;
            }
        }
        return 1;
    }
}
