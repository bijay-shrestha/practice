package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OddNumberFollowedBySquareOfIt {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 3, 4, 6, 5, 25};
        int[] arrayOfNumbers = {1, 3, 4, 6, 5, 0};
        log.info("Checking if at least 1 odd number in array {} is followed by it's square. Return 1 for Yes and 0 for No.",
                arrayOfNumbers);
        log.info("Actual Result: {}", checkIfAnOddNumberIsFollowedBySquare(arrayOfNumbers));
    }

    static int checkIfAnOddNumberIsFollowedBySquare(int[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            if (a[i] % 2 != 0) {
                if (a[i] * a[i] == a[i + 1]) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
