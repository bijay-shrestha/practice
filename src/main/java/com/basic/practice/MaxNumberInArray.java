/**
 * * Get Maximum Element value from the given array.
 */
package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 10, 5, -8, 8, 11, 15, 3};
        log.info("Max value from an array {} is {}", arrayOfNumbers, getMaxNumberInArray(arrayOfNumbers));
    }

    static int getMaxNumberInArray(int[] a) {
        int len = a.length;
        int temp = a[0];
        int max = 0;

        for (int i = 0; i < len; i++) {
            if (temp >= a[i]) {
                max = temp;
            } else {
                max = a[i];
            }

            if (temp >= max) {
                max = temp;
            } else {
                temp = max;
            }
        }
        return max;

    }

}
