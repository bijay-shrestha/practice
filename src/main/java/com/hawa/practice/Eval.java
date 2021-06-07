/**
 * * Write a function named eval that returns the value of the polynomial a n x n + a n-1 x n-1 + ... + a 1 x 1 + a 0 .
 * *
 * * If you are programming in Java or C#, the function signature is
 * * double eval(double x, int[ ] a)
 *
 * * Examples:
 * * if x is          if the input array is           this represents                 eval should return
 * * 1.0              {0, 1, 2, 3, 4}                 4x^4 + 3x^3 + 2x^2 + x + 0      10.0
 * * 3.0              {3, 2, 1}                       x^2 + 2x + 3                    18.0
 * * 2.0              {3, -2, -1}                     -x^2 - 2x + 3                   -5.0
 * * -3.0             {3, 2, 1}                       x^2 + 2x + 3                    6.0
 * * 2.0              {3, 2}                          2x + 3                          7.0
 * * 2.0              {4, 0, 9}                       9x^2 + 4                        40.0
 * * 2.0              {10}                            10                              10.0
 * * 10.0             {0, 1}                          x                               10.0
 *
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Eval {

    public static void main(String[] args) {
//        double x = 1.0;
//        int[] arrayOfNumbers = {0, 1, 2, 3, 4};

//        double x = 3.0;
//        int[] arrayOfNumbers = {3, 2, 1};

//        double x = 2.0;
//        int[] arrayOfNumbers = {3, -2, -1};

//        double x = -3.0;
//        int[] arrayOfNumbers = {3, 2, 1};

//        double x = 2.0;
//        int[] arrayOfNumbers = {3, 2};

//        double x = 2.0;
//        int[] arrayOfNumbers = {4, 0, 9};

//        double x = 2.0;
//        int[] arrayOfNumbers = {10};

        double x = 10.0;
        int[] arrayOfNumbers = {0, 1};

        log.info("The eval of array {} with x = {} is: {}", arrayOfNumbers, x, eval(x, arrayOfNumbers));
    }

    static double eval(double x, int[] a) {
        int sum = 0;
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            double mul = 1;
            for (int j = 0; j < i; j++) {
                mul *= x;
            }
            log.info("{}x^{}", a[i], i);
            sum += a[i] * mul;
        }
        return sum;
    }
}
