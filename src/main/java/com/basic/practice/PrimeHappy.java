/**
 * A number n is called prime happy if there is at least one prime less than n and the sum of all primes
 * less than n is evenly divisible by n.
 *
 * Recall that a prime number is an integer > 1 which has only two integer factors, 1 and itself
 * The function prototype is int isPrimeHappy(int n);
 *
 * Examples:
 *
 * if n is      return        because
 * 5            1             because 2 and 3 are the primes less than 5, their sum is 5 and 5 evenly divides 5.
 * 25           1             because 2, 3, 5, 7, 11, 13, 17, 19, 23 are the primes less than 25, their sum is 100 and 25 evenly divides 100
 * 32           1             because 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 are the primes less than 32, their sum is 160 and 32 evenly divides 160
 * 8            0             because 2, 3, 5, 7 are the primes less than 8, their sum is 17 and 8 does not evenly divide 17.
 * 2            0             because there are no primes less than 2.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrimeHappy {
    public static void main(String[] args) {
        int number = 5;
//        int number = 2;
//        int number = 25;
//        int number = 32;
//        int number = 8;
        log.info("Checking if the number '{}' is happy prime. Return 1 for Yes and 0 for No.", number);
        log.info("Actual Result: {}", isPrimeHappy(number));
    }

    static int isPrimeHappy(int n) {

        int sum = 0;
        boolean isPrimeHappy = false;
        int[] primeNumberArrays = arrayOfPrimes(n);
        if (primeNumberArrays.length == 0) {
            return 0;
        }
        for (int pn : primeNumberArrays) {
            if (pn < n) {
                isPrimeHappy = true;
            }
            sum = sum + pn;
        }

        if (sum % n == 0 && isPrimeHappy) {
            return 1;
        }

        return 0;
    }

    static int[] arrayOfPrimes(int n) {
        int[] newArr = new int[countPrimeNumbersOf(n)];
        int start = 0;
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                log.info("{} is prime number.", i);
                newArr[start] = i;
                start++;
            }
        }
        return newArr;
    }

    static int countPrimeNumbersOf(int n) {
        int primeCount = 0;
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeCount++;
            }
        }
        return primeCount;
    }
}
