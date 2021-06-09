/**
 * * An array is called zero-balanced if its elements sum to 0 and for each positive element n, there exists
 * * another element that is the negative of n. Write a function named isZeroBalanced that returns 1 if its argument
 * * is a zero-balanced array. Otherwise it returns 0.
 * *
 * * If you are writing in Java, the function signature is
 * * int isZeroBalanced(int[ ] a)
 * *
 * * Examples:
 * *
 * * if a is                  return
 * * {1, 2, -2, -1}           1 because elements sum to 0 and each positive element has a corresponding negative element.
 * * {-3, 1, 2, -2, -1, 3}    1 because elements sum to 0 and each positive element has a corresponding negative element.
 * * {3, 4, -2, -3, -2}       0 because even though this sums to 0, there is no element whose value is -4
 * * {0, 0, 0, 0, 0, 0}       1 this is true vacuously; 0 is not a positive number
 * * {3, -3, -3}              0 because it doesn't sum to 0. (Be sure your function handles this array correctly)
 * * {3}                      0 because this doesn't sum to 0
 * * {}                       0 because it doesn't sum to 0
 * *
 * *
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsZeroBalanced {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, -2, -1};
//        int[] arrayOfNumbers = {-3, 1, 2, -2, -1, 3};
//        int[] arrayOfNumbers = {3, 4, -2, -3, -2};
//        int[] arrayOfNumbers = {0, 0, 0, 0, 0, 0};
//        int[] arrayOfNumbers = {3, -3, -3};
//        int[] arrayOfNumbers = {3};
        int[] arrayOfNumbers = {};
        log.info("Checking if the array {} is Zero Balanced. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isZeroBalanced(arrayOfNumbers));
    }

    static int isZeroBalanced(int[] a) {
        int sum = 0;

        int len = a.length;
        if (len == 0) return 0;
        for (int i = 0; i < len; i++) {
            boolean found = false;
            for (int j = 0; j < len; j++) {
                if (-a[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) return 0;
            sum += a[i];
        }
        if (sum == 0) {
            return 1;
        }
        return 0;
    }

}
