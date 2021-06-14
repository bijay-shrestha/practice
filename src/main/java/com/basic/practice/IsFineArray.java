/**
 * * A twin prime is a prime number that differs from another prime number by 2. A Fine array is
 * * defined to be an array in which every prime in the array has its twin in the array. So {4, 7, 9, 6, 5} is a
 * * Fine array because 7 and 5 occurs.
 * *
 * * Note that {4, 9, 6, 33} is a Fine array since there are no primes.
 * * On the other hand, {3, 8, 15} is not a Fine array since 3 appear in the array but its twin 5 is not in the array.
 * *
 * * Write a function named isFineArray that returns 1 if its array argument is a Fine array, otherwise it
 * * returns 0.
 * *
 * * If you are programming in Java, the function signature is
 * * int isFineArray (int [ ] a)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsFineArray {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {4, 7, 9, 6, 5};
//        int[] arrayOfNumbers = {4, 9, 6, 33};
        int[] arrayOfNumbers = {3, 8, 15};
        log.info("Checking if the array {} is a fine-array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isFineArray(arrayOfNumbers));
    }

    static int isFineArray(int[] a) {
        boolean hasFinePair = false;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            if (isPrime(a[i])) {
                for (int j = 0; j < len; j++) {
                    if (a[j] == a[i] - 2 || a[j] == a[i] + 2) {
                        if (isPrime(a[j])) {
                            hasFinePair = true;
                            break;
                        }
                    }
                }
                if (!hasFinePair) {
                    return 0;
                }
            }
        }
        return 1;
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
