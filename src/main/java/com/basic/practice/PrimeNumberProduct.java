/**
 * The fundamental theorem of arithmetic states that every natural number greater than 1 can be written as a unique product of prime
 * numbers. So, for instance, 6936=2*2*2*3*17*17. Write a method named encodeNumber what will encode a number n as an array that
 * contains the prime numbers that, when multipled together, will equal n. So encodeNumber(6936) would return the array {2, 2, 2, 3,
 * 17, 17}. If the number is <= 1 the function should return null;
 * <p>
 * Hint: proceed as follows:
 * 1. Compute the total number of prime factors including duplicates.
 * 2. Allocate an array to hold the prime factors. Do not hard-code the size of the returned array!!
 * 3. Populate the allocated array with the prime factors. The elements of the array when multiplied together should equal the number.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class PrimeNumberProduct {
    public static void main(String[] args) {
//        int number = 6936;
//        int number = 24;
//        int number = 6;
//        int number = 14;
//        int number = 1200;
//        int number = 1;
        int number = -18;
        log.info("Checking if the {}'s prime number product is equivalent or not. 1 for Yes, 0 for No.", number);
//        log.info("Actual result: {}", productOfPrimeFactorsOfANumber(number));
        log.info("Actual result: {}", checkIfPrimeNumberProductEqualsNumber(number));
    }

    static Integer checkIfPrimeNumberProductEqualsNumber(int n) {

        if (n <= 1) {
            return null;
        }

        if (productOfPrimeFactorsOfANumber(n) == n) {
            return 1;
        } else {
            return 0;
        }

    }

    static int productOfPrimeFactorsOfANumber(int n) {
        int prod = 1;
        int smallestPrimeNumber = 2;
        int nextPrimeNumber;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = smallestPrimeNumber; i <= n; i++) {
            if (n % smallestPrimeNumber == 0) {
                log.info(" Dividing {} by {}", n, smallestPrimeNumber);
                arr.add(smallestPrimeNumber);
            } else {
                nextPrimeNumber = smallestPrimeNumber + 1;
                if (isPrimeNumber(nextPrimeNumber)) {
                    smallestPrimeNumber = nextPrimeNumber;
                } else {
                    smallestPrimeNumber++;
                }
                continue;
            }
            n = n / smallestPrimeNumber;
            if (isPrimeNumber(n)) {
                arr.add(n);
            }
        }
        log.info("Resultant Prime Factors are: {}", arr.toString());
        for (Integer num : arr) {
            prod = prod * num;
        }
        return prod;
    }

    static boolean isPrimeNumber(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return true;
        }
        return false;
    }

}
