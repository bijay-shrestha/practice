/**
 * * Write a function named minDistance that returns the smallest distance between two factors of a number.
 * *
 * * For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
 * * minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2).
 * *
 * * As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
 * * and the smallest distance between any two factors is 1 (2 – 1 = 1).
 * *
 * * The function signature is
 * * int minDistance(int n)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinDistance {
    public static void main(String[] args) {
//        int number = 13013;
        int number = 8;
        log.info("Finding the min-distance of the number: {}, we get: {}", number, minDistance(number));

    }

    static int minDistance(int n) {
        int[] a = getFactorsOfNumber(n);
        int len = a.length;
        int min = a[len - 1];
        int sub = 0;
        for (int i = len - 2; i > 0; i--) {
            sub = a[i] - a[i - 1];
            if (sub <= min) {
                min = sub;
            }
        }
        return min;
    }

    static int[] getFactorsOfNumber(int n) {
        int[] arr = new int[countNumberOfFactors(n)];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[idx] = i;
                idx++;
            }
        }
        return arr;
    }

    static int countNumberOfFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
;