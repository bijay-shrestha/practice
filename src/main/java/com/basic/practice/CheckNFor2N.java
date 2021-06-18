package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckNFor2N {
    public static void main(String[] args) {
//        int[] arrayOfNumber = {1, 6, 4, 5, 3};
        int[] arrayOfNumber = {1, 9, 4, 5, 3};
        log.info("Checking if for any number N, the number 2N is not in an array. Return 1 for Yes and 0 for No.", arrayOfNumber);
        log.info("Actual Result: {}", checkNFor2N(arrayOfNumber));
    }

    static int checkNFor2N(int[] a) {
        boolean notFound;
        for (int i = 0; i < a.length; i++) {
            notFound = true;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2 * a[j]) {
                    notFound = false;
                    break;
                }
            }
            if (!notFound) {
                return 0;
            }
        }
        return 1;
    }
}
