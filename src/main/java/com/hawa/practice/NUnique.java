package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NUnique {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 1, 3, 4};
        int nUniqueNumber = 5;
        log.info("Checking if the given array {} is {}-unique, Result: {}", arrayOfNumbers, nUniqueNumber,
                isNUnique(arrayOfNumbers, nUniqueNumber));
    }

    static int isNUnique(int[] a, int n) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= a.length - 1; j++) {
                sum += a[i] + a[j];
                if (sum == n) {
                    log.info("Caught! with {} and {}", a[i], a[j]);
                    count++;
                }
                sum = 0;
            }
        }
        if (count == 1) {
            return 1;
        }
        return 0;
    }
}
