/**
 * * A Bean array is defined to be an array where for every value n in the array, there is
 * * also an element n-1 or n+1 in the array.
 * * For example, {2, 10, 9, 3} is a Bean array because
 * *   2 = 3-1
 * *   10 = 9+1
 * *   3 = 2 + 1
 * *   9 = 10 -1
 * * Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
 * *
 * * The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the
 * * array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
 * *
 * * Write a function named isBean that returns 1 if its array argument is a Bean array.
 * * Otherwise it returns a 0.
 * <p>
 * If you are programming in Java, the function signature is
 * int isBean(int[ ] a)
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeanArray {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 10, 9, 3};
//        int[] arrayOfNumbers = {2, 2, 3, 3, 3};
//        int[] arrayOfNumbers = {1, 1, 1, 2, 1, 1};
//        int[] arrayOfNumbers = {0, -1, 1};
        int[] arrayOfNumbers = {3, 4, 5, 7};
        log.info("Checking if the array {} is a bean-array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isBean(arrayOfNumbers));
    }

    static int isBean(int[] a) {
        int len = a.length;
        boolean isBeanArray;

        for (int i = 0; i < len; i++) {
            int num = a[i];
            isBeanArray = false;
            for (int j = 0; j < len; j++) {
                if (a[j] == num + 1 || a[j] == num - 1) {
                    isBeanArray = true;
                    break;
                }
            }
            if (!isBeanArray) {
                return 0;
            }

        }

        return 1;
    }
}
