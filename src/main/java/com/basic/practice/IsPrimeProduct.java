/**
 * * A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
 * * example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
 * *
 * * Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
 * * primeproduct, otherwise it returns 0. Recall that a prime number is a positive integer with no factors
 * * other than 1 and itself.
 * *
 * * You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime
 * * number. You do not need to write isPrime. You are allowed to use this function.
 * *
 * * The function signature
 * * int isPrimeProduct(int n)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsPrimeProduct {

    public static void main(String[] args) {
        int number = 22;
        log.info("Checking if the number {} is a prime-product. Return 1 for Yes and 0 for No.", number);
        log.info("Actual result: {}", isPrimeProduct(number));

    }

    static int isPrimeProduct(int n) {
        int[] arr = new int[2];
        int currentIndex = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    arr[currentIndex] = i;
                    log.info("{} is prime.", i);
                    currentIndex++;
                }
            }
        }

        return arr[0] * arr[1] == n ? 1 : 0;
    }

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }


}
