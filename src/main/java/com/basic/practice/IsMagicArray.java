/**
 *
 * * An array is defined to be a Magic array if the sum of the primes in the array is equal to the first
 * * element of the array.
 * *
 * * If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9, 11 4, 6} is a Magic array
 * * because 3, 7, 11 are the primes in the array and they sum to 21 which is the first element of the array.
 * *
 * * {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13 which is also the first element.
 * *
 * * Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}.
 * * {8, 5, -5, 5, 3} is not a Magic array because the sum of the primes is 5+5+3 = 13.
 * * Note that -5 is not a prime because prime numbers are positive.
 * *
 * * Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array.
 * * Otherwise it returns 0.
 * *
 * * If you are writing in Java, the function signature is
 * * int isMagicArray (int[ ] a)
 *
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsMagicArray {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {21, 3, 7, 9, 11, 4, 6};
//        int[] arrayOfNumbers = {13, 4, 4, 4, 4};
//        int[] arrayOfNumbers = {10, 5, 5};
//        int[] arrayOfNumbers = {0, 6, 8, 20};
//        int[] arrayOfNumbers = {3};
        int[] arrayOfNumbers = {8, 5, -5, 5, 3};
        log.info("Checking if the array {} is a magic array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isMagicArray(arrayOfNumbers));

    }

    static int isMagicArray(int[] a) {
        int len = a.length;
        int sumPrime = 0;
        int firstElem = a[0];

        for (int i = 0; i < len; i++) {
            if (isPrime(a[i])) {
                sumPrime += a[i];
            }
        }

        if (sumPrime == 0 && firstElem == 0)
            return 1;

        if (sumPrime == firstElem)
            return 1;

        return 0;
    }

    static boolean isPrime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        return count == 2;
    }
}
