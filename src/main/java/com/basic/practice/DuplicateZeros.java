package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 0, 2, 3, 0, 4, 5, 0};
        log.info("Duplicating zeros for the array {}, we get: {}", arrayOfNumbers, duplicateZeros(arrayOfNumbers));
    }

    static int[] duplicateZeros(int[] arr) {
        int idx;
        for (int i = 0; i < arr.length - 1; i++) {
            idx = i;
            if (arr[i] == 0) {
                for (int j = idx + 1; j < arr.length; j++) {
                    arr[i] = arr[j];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
        for (int n : arr) {
            log.info("{}", n);
        }
        return arr;
    }
}
