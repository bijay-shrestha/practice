/**
 * * Define an array to be n-primeable if for a given n, all elements of the array when incremented by n are prime. Recall that a prime
 * * number is a number that has no factors except 1 and itself.
 * *
 * * Write a method named isNPrimeable that has an array parameter and an
 * * integer parameter that defines n; the method returns 1 if its array parameter is n-primeable; otherwise it returns 0.
 * *
 * * If you are programming in Java or C#, the function signature is
 * * int isNPrimeable(int[ ] a, int n)
 * *
 * * Examples
 * * If a is		            and n is		then function returns			reason
 * * {5, 15, 27}                2               1                               5+2=7 is prime, and 15+2=17 is prime, and 27+2=29 is prime
 * * {5, 15, 27}                3               0                               5+3=8 is not prime
 * * {5, 15, 26}                2               0                               26+2=28 is not prime
 * * {1, 1, 1, 1, 1, 1, 1}      4               1                               1+4=5 is prime. This obviously holds for all elements in the array
 * * {}                         2               1                               Since there are no elements in the array, there cannot exist one that is
 * *                                                                            non-prime when 2 is added to it
 **/

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NPrimeable {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {5, 15, 27};
//        int num = 2;

//        int[] arrayOfNumbers = {5, 15, 27};
//        int num = 3;

//        int[] arrayOfNumbers = {5, 15, 26};
//        int num = 2;

//        int[] arrayOfNumbers = {1, 1, 1, 1, 1, 1, 1};
//        int num = 4;

        int[] arrayOfNumbers = {};
        int num = 2;


        log.info("Checking if array {} with n={} is NPrimeable or not. Return 1 for Yes and 0 for No.", arrayOfNumbers, num);
        log.info("Actual Result: {}", isNPrimeable(arrayOfNumbers, num));

    }

    static int isNPrimeable(int[] a, int n) {
        boolean flag = false;
        int len = a.length;

        if (len == 0) {
            return 1;
        }

        for (int i = 0; i < len; i++) {
            if (isPrime(a[i] + n)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            return 1;
        }

        return 0;
    }

    static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
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
