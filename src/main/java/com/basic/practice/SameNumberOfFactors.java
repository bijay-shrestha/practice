/**
 * * Write a function named sameNumberOfFactors that takes two integer arguments and returns 1 if they have
 * * the same number of factors. If either argument is negative, return -1. Otherwise return 0.
 * *
 * * int sameNumberOfFactors(int n1, int n2)
 * *
 * * Examples:
 * *
 * * if n1 is         and n2 is        return
 * * -6               21              -1 (because one of the arguments is negative)
 * * 6                21              1 (because 6 has four factors (1, 2, 3, 6) and so does 21 (1, 3, 7, 21)
 * * 8                12              0 (because 8 has four factors(1, 2, 4, 8) and 12 has six factors (1, 2, 3, 4, 6, 12)
 * * 23               97              1 (because 23 has two factors (1, 23) and so does 97 (1, 97))
 * * 0                1               0 (because 0 has no factors, but 1 has one (1))
 * * 0                0               1 (always true if n1 == n2)
 * *
 * *
 * */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SameNumberOfFactors {

    public static void main(String[] args) {
//        int firstNumber = 6;
//        int secondNumber = 21;

//        int firstNumber = 8;
//        int secondNumber = 12;

//        int firstNumber = 23;
//        int secondNumber = 97;

//        int firstNumber = 0;
//        int secondNumber = 1;

        int firstNumber = 0;
        int secondNumber = 0;

        log.info("Comparing if numbers {} and {} have same number of factors. Return 1 for Yes, 0 for No and " +
                "-1 if any of the numbers are negative.", firstNumber, secondNumber);

        log.info("Actual Result: {}", sameNumberOfFactors(firstNumber, secondNumber));
    }

    static int sameNumberOfFactors(int n1, int n2) {

        if (n1 < 0 || n2 < 0) {
            return -1;
        }

        int n1Factors = getNumberOfFactors(n1);
        int n2Factors = getNumberOfFactors(n2);

        log.info("Number of Factors of {} = {}", n1, n1Factors);
        log.info("Number of Factors of {} = {}", n2, n2Factors);

        if (n1Factors == n2Factors) {
            return 1;
        }

        return 0;
    }

    static int getNumberOfFactors(int n) {
        log.info("---------------------------------");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                log.info("Factors are: {}", i);
                count++;
            }
        }
        return count;
    }
}
