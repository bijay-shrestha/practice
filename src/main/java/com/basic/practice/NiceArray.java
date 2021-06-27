package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NiceArray {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 10, 9, 3};
//        int[] arrayOfNumbers = {2, 2, 3, 3, 3};
//        int[] arrayOfNumbers = {1, 1, 1, 2, 1, 1};
//        int[] arrayOfNumbers = {0, -1, 1};
        int[] arrayOfNumbers = {3, 4, 5, 7};
        log.info("Checking if the array {} is a nice-array. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isNice(arrayOfNumbers));
    }

    static int isNice(int[] a) {
        int len = a.length;
        boolean isNiceArray;

        for (int i = 0; i < len; i++) {
            isNiceArray = false;
            int num = a[i];
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                if (num + 1 == a[j] || num - 1 == a[j]) {
                    isNiceArray = true;
                    break;
                }
            }
            if (!isNiceArray) {
                return 0;
            }
        }
        return 1;
    }
}
