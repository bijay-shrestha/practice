package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HighestOccurringDigitInNumber {

    public static void main(String[] args) {
//        int number = 1223412;
        int number = 122341112;
        log.info("Finding highest occurring digit in a number {}.", number);
        log.info("Actual Result: {}", findHighestOccurringDigit(number));
    }

    static int findHighestOccurringDigit(int n) {
        int result = 0;
        int count = 0;
        int maxCount = 1;
        for (int i = 0; i <= 9; i++) {
            count = countOccurrence(n, i);
            if (count >= maxCount) {
                maxCount = count;
                result = i;
            }
        }
        return result;
    }

    static int countOccurrence(int n, int i) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == i) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
