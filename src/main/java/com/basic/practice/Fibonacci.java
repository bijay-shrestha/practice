package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {
    public static void main(String[] args) {
//        int number = 5;
//        int number = 8;
        int number = 13;
        log.info("Checking if the number {} is Fibonacci or not. Return 1 for Yes and 0 for No.", number);
        log.info("Actual Result: {}", isFibonacci(number));
    }

    static int isFibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        int fib = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                fib = i + 1;
            }
            fib = fib + i;
            if (fib == n) {
                return 1;
            }

        }
        return 0;
    }
}
