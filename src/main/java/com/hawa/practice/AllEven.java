/**
 *
 * This exam tests very basic programming skills and hence will be graded strictly. However, simple syntax errors will be forgiven. The
 * following examples gives you an idea of how the exam will be graded.
 *
 * Sample problem: Write a method int allEven(int a[ ], int len) that returns 1 if all elements of the array a are even, otherwise it returns
 * 0.
 *
 * Assume that the array has at least one element.
 */


package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AllEven {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 4, 6, 8, 10};
        int[] arrayOfNumbers = {2, 3, 4, 6, 8, 10};
        log.info("Checking if the array {}'s elements are all even. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", allEven(arrayOfNumbers));
    }

    static int allEven(int[] a) {
        int len = a.length;

        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
