/**
 * * An array is called cube-perfect if all its elements are cubes of some integer.
 * * For example, {-1, 1, -8, -27, 8} is cube-perfect because
 * *
 * * -1 = -1 * -1 * -1
 * * 1 = 1 * 1 * 1
 * * -8 = -2 * -2 * -2
 * * -27 = -3 * -3 * -3
 * * 8 = 2 * 2 * 2
 * *
 * * But {27, 3} is not cube-perfect because 3 is not the cube of any integer.
 * * Write a function named isCubePerfect that returns 1 if its argument is cube-perfect, otherwise it returns 0.
 * *
 * * If you are programming in Java, the function signature is
 * * int isCubePerfect(int[ ] a)
 * *
 * * Examples
 * *
 * * if a is          return          because
 * *
 * * {1, 1, 1, 1}     1               all elements are cubes of 1
 * * {64}             1               64 = 4*4*4
 * * {63}             0               63 is not the cube of any integer
 * * {-1, 0, 1}       1               -1 = -1 * -1 * -1, 0 = 0 * 0 * 0, 1=1 * 1 * 1
 * * {}               1               no elements fail the cube test
 * * {3, 7, 21, 36}   0               3 is not the cube of any integer
 * *
 * *
 */
package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsCubePerfect {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 1, 1, 1};
//        int[] arrayOfNumbers = {64};
//        int[] arrayOfNumbers = {63};
//        int[] arrayOfNumbers = {-1, 0, 1};
        int[] arrayOfNumbers = {};
//        int[] arrayOfNumbers = {3, 7, 21, 36};
        log.info("Cehcing if the array {} is a cube perfect. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual result: {}", isCubePerfect(arrayOfNumbers));
    }

    static int isCubePerfect(int[] a) {
        int len = a.length;
        if (len == 0) {
            return 1;
        }

        for (int i = 0; i < len; i++) {
            int n = 0;
            int cube = 0;
            boolean isCube = false;
            boolean flag = true;
            while (flag) {
                if (a[i] > 0) {
                    cube = n * n * n;
                } else {
                    cube = (-1) * n * n * n;
                }

                if (a[i] < 0) {
                    if (a[i] == cube) {
                        isCube = true;
                        flag = false;
                        continue;
                    }
                } else {
                    if (a[i] == cube) {
                        isCube = true;
                        flag = false;
                        continue;
                    }
                }

                if (n >= a[i] && a[i] > 0) {
                    isCube = false;
                    flag = false;
                }
                n++;
            }
            if (!isCube) return 0;
        }
        return 1;
    }
}
