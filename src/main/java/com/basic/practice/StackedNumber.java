package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StackedNumber {
    public static void main(String[] args) {
        int number = 7;
        log.info("Checking if given number {} is stacked or not. " +
                        "--> Result: 1 for yes and 0 for no.",
                number);
        log.info("Actual result: {}", isStacked(number));
    }

    static int isStacked(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) {
                log.info("Sum {} matched on {} iteration!", sum, i);
                return 1;
            }
            if (sum > n) break;

        }
        return 0;
    }
}
