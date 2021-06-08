/**
 * * Question: Sort Array Element such tha {5, 3, 4, 2, 1} becomes {1, 2, 3, 4, 5}
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortArray {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 4, 1, 9, 33, 4, 0};
        log.info("Sorting array {}, we get {}", arrayOfNumbers, sortArray(arrayOfNumbers));
    }

    static int[] sortArray(int[] a) {
        int len = a.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
