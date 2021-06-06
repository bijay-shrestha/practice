package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MadhavArray {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, 1, 1, 4, -1, -1};
//        int[] arrayOfNumbers = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
//        int[] arrayOfNumbers = {2, 1, 1};
//        int[] arrayOfNumbers = {18, 9, 10, 6, 6, 6};
//        int[] arrayOfNumbers = {-6, -3, -3, 8, -5, -4};
//        int[] arrayOfNumbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        int[] arrayOfNumbers = {3, 1, 2, 3, 0};

        log.info("Checking if given array {} is Madhav. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", isMadhavArray(arrayOfNumbers));
    }

    static int isMadhavArray(int[] a) {
        int toBeComparedValue = a[0];
        if (isCorrectArrayFormat(a) != 0) {
            int num = 2;
            for (int i = 1; i < a.length; ) {
                int sum = 0;
                for (int j = i; j < i + num; j++) {
                    sum += a[j];
                }
                if (sum != toBeComparedValue) {
                    return 0;
                }
                i += num++;
            }
            return 1;
        }
        return 0;
    }

    static int isCorrectArrayFormat(int[] a) {
        int n = 2;
        boolean isCorrectLength = false;
        while (n * (n + 1) <= 2 * a.length) {
            if (n * (n + 1) == 2 * a.length) {
                isCorrectLength = true;
                break;
            } else {
                n++;
            }
        }
        if (!isCorrectLength) {
            return 0;
        }
        return 1;
    }
}
