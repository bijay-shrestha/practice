/**
 * * Write a function named countDigit that returns the number of times that a given digit appears in a
 * * positive number.
 * *
 * * For example countDigit(32121, 1) would return 2 because there are two 1s in 32121.Other examples:
 * * countDigit(33331, 3) returns 4
 * * countDigit(33331, 6) returns 0
 * * countDigit(3, 3) returns 1
 * *
 * * The function should return -1 if either argument is negative, so
 * * countDigit(-543, 3) returns -1.
 * *
 * * The function signature is
 * * int countDigit(int n, int digit)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountDigit {

    public static void main(String[] args) {
//        int number = 33313;
//        int digit = 3;

//        int number = 33331;
//        int digit = 6;

//        int number = 3;
//        int digit = 3;

        int number = -543;
        int digit = 3;

        log.info("Counting digit of number {} with digit = {}, we get: {}", number, digit, countDigit(number, digit));
    }

    static int countDigit(int n, int digit) {
        if (n < 0) {
            return -1;
        }

        int count = 0;
        int rem = 0;
        for (int i = 1; i <= n; i++) {
            rem = n % 10;
            n = n / 10;
            if (rem == digit) {
                count++;
            }
        }

        return count;
    }

}
