/**
 * * A twin prime is a prime number that differs from another prime number by 2.
 * *
 * * Write a function named isTwinPrime with an integer parameter that returns 1 if the parameter is a twin prime,
 * * otherwise it returns 0. Recall that a prime number is a number with no factors other than 1 and itself.
 * *
 * * the function signature is
 * * int isTwinPrime(int n)
 * *
 * * Examples:
 * *
 * * number           is twin prime?
 * *
 * * 5                yes, 5 is prime, 5+2 is prime
 * * 7                yes, 7 is prime, 7-2 is prime
 * * 53               no, 53 is prime, but neither 53-2 nor 53+2 is prime
 * * 9                no, 9 is not prime
 */
package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsTwinPrime {

    public static void main(String[] args) {
//        int number = 5;
//        int number = 7;
//        int number = 53;
        int number = 9;
        log.info("Checking if the number = {} is a Twin Prime. Return 1 for Yes and 0 for No.", number);
        log.info("Actual Result: {}", isTwinPrime(number));
    }

    static int isTwinPrime(int n) {
        if (n < 1) {
            return 0;
        }
        int plusTwoNumber = n + 2;
        int minusTwoNumber = n - 2;
        boolean isNPrime = isPrime(n);
        if (!isNPrime) return 0;

        boolean plusTwoIsPrime = isPrime(plusTwoNumber);
        log.info("{}: {}", plusTwoNumber, plusTwoIsPrime);

        boolean minusTwoIsPrime = isPrime(minusTwoNumber);
        log.info("{}: {}", minusTwoNumber, minusTwoIsPrime);

        if (plusTwoIsPrime || minusTwoIsPrime) {
            return 1;
        }
        return 0;
    }

    static boolean isPrime(int n) {
        int count = 0;
        int num = 1;
        int a = n;
        while (a > 0) {
            if (n % num == 0) {
                count++;
            }
            a--;
            num++;
        }
        return count == 2;
    }

    /**
     * This is another way to check prime.
     *
     * @param n
     * @return true for a prime number, false for not a prime number.
     */
    static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
