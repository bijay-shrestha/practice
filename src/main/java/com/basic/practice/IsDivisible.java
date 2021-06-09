package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsDivisible {

    public static void main(String[] args) {

        int[] arrayOfNumbers = {};
        int divisor = 12;
        log.info("Checking if the array '{}' is divisible by the divisor '{}'. Result: {}", arrayOfNumbers,
                divisor, isDivisible(arrayOfNumbers, divisor));

    }

    static int isDivisible(int[] arrayOfNumbers, int divisor) {
        int count = 0;
        int arrLength = arrayOfNumbers.length;
        for (int i = 0; i < arrLength; i++) {
            if (arrayOfNumbers[i] % divisor == 0) {
                count++;
            }
        }
        if (count == arrLength) {
            return 1;
        }
        return 0;
    }

}
