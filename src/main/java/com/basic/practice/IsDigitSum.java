/**
 * * Write a function named isDigitSum that returns 1 if sum of all digits of the first argument is less
 * * than the second argument and 0 otherwise. For example isDigitSum(32121,10 ) would return 1
 * * because 3+2+1+2+1 = 9 < 10.
 * *
 * * More examples:
 * * isDigitSum(32121,9) returns 0, isDigitSum(13, 6) returns 1, isDigitSum(3, 3) returns 0
 * *
 * * The function should return -1 if either argument is negative, so isDigitSum(-543, 3) returns -1.
 * *
 * * The function signature is
 * * int isDigitSum(int n, int m)
 */


package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsDigitSum {
    public static void main(String[] args) {
//        int firstArg = 32121;
//        int secondArg = 10;

//        int firstArg = 13;
//        int secondArg = 6;

//        int firstArg = 3;
//        int secondArg = 3;

//        int firstArg = 32121;
//        int secondArg = 9;

        int firstArg = -543;
        int secondArg = 3;
        log.info("Checking if the given argument n={} and m={} is a digit-sum. Return 1 for Yes, 0 for No and -1 if either" +
                "of the arguments are negative.", firstArg, secondArg);
        log.info("Actual result: {}", isDigitSum(firstArg, secondArg));
    }

    static int isDigitSum(int n, int m) {
        int rem;
        int sum = 0;
        if (n < 0 || m < 0) {
            return -1;
        }

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        if (sum < m) {
            return 1;
        }

        return 0;

    }

}
