/**
 * * An array is defined to be odd-heavy if it contains at least one odd element and every odd
 * * element is greater than every even element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9)
 * * are greater than all the even elements.
 * *
 * * And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element
 * * 10 is greater than the odd element 9. Write a function called isOddHeavy that accepts an integer array and
 * * returns 1 if the array is odd-heavy; otherwise it returns 0.
 * *
 * * Some other examples: {1} is odd-heavy, {2} is not
 * * odd-heavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6, 8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not odd-heavy.
 * *
 * * If you are programming in Java or C#, the function signature is
 * * int isOddHeavy(int[ ] a)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OddHeavy {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {11, 4, 9, 2, 8};
//        int[] arrayOfNumbers = {11, 4, 9, 2, 3, 10};
//        int[] arrayOfNumbers = {1};
//        int[] arrayOfNumbers = {2};
//        int[] arrayOfNumbers = {1, 1, 1, 1};
//        int[] arrayOfNumbers = {2, 4, 6, 8, 11};
//        int[] arrayOfNumbers = {-2, -4, -6, -8, -11};
        log.info("Checking if the array {} is Odd-heavy. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isOddHeavy(arrayOfNumbers));
    }

    static int isOddHeavy(int[] a) {
        return 1;
    }
}
