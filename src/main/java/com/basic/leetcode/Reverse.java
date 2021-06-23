package com.basic.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Reverse {
    public static void main(String[] args) {
//        int number = 1243;
//        int number = 1534236469;
        int number = 678586789;
        log.info("Reversing the number {}, we get: {}", number, reverse(number));
    }

    static int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -1 * x;
        }
        int reverse = 0;
        int rem = 0;
        while (x > 0) {
            rem = x % 10;
            reverse = (reverse * 10) + rem;
            x = x / 10;
        }
        log.info("The reverse number is : {}", sign * reverse);
        return sign * reverse;
    }

}
