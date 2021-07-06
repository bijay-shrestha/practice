/**
 * * A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that
 * * first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is the
 * * sum of the previous two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2
 * * and so on.
 * *
 * * Write a function named isFibonacci that returns 1 if its integer argument is
 * * a Fibonacci number, otherwise it returns 0.
 * *
 * * The signature of the function is
 * * int isFibonacci (int n)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {
    public static void main(String[] args) {
//        int number = 5;
//        int number = 8;
//        int number = 13;
//        int number = 21;
//        int number = 34;
        int number = 20;
        log.info("Checking if the number {} is Fibonacci or not. Return 1 for Yes and 0 for No.", number);
        log.info("Actual Result: {}", isFibonacci(number));
    }

    static int isFibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        int x = 1;
        int y = 1;
        int z;
        for (int i = 1; i <= n; i++) {
            z = x + y;
            if (z == n) {
                return 1;
            }
            x = y;
            y = z;
        }
        return 0;
    }
}
