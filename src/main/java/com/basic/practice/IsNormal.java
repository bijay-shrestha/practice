/**
 * * A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
 * * Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0.
 * *
 * * Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd
 * * factor. 10 is not a normal number since 5 is an odd factor.
 * *
 * * The function signature is
 * * int isNormal(int n)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsNormal {

    public static void main(String[] args) {
//        int number = 6;
//        int number = 9;
//        int number = 10;
//        int number = 5;
//        int number = 7;
//        int number = 8;
//        int number = 4;
//        int number = 3;
//        int number = 2;
        int number = 1;
        log.info("Checking if a number {} is a normal number. Return 1 for Yes and 0 for No.", number);
        log.info("Actual result: {}", isNormal(number));
    }

    static int isNormal(int n) {
        int isNormal = 0;

        if (n == 1) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && !isOddExceptOneAndItself(i, n)) {
                isNormal = 1;
                continue;
            } else if (n % i == 0 && isOddExceptOneAndItself(i, n)) {
                isNormal = 0;
                break;
            }
        }

        return isNormal;
    }

    static boolean isOddExceptOneAndItself(int i, int n) {
        if (i == n) {
            return false;
        }

        if (i == 1) {
            return false;
        }

        if (i % 2 == 1) {
            return true;
        }
        return false;
    }
}
