/**
 * * Given a signed 32-bit integer x, return x with its digits reversed.
 * * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * *
 * * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * *
 * * Example 1:
 * * Input: x = 123
 * * Output: 321
 * *
 * * Example 2:
 * * Input: x = -123
 * * Output: -321
 * *
 * * Example 3:
 * * Input: x = 120
 * * Output: 21
 * *
 * * Example 4:
 * * Input: x = 0
 * * Output: 0
 * *
 * * Constraints:
 * *
 * * -231 <= x <= 231 - 1
 */

package com.basic.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Reverse {
    public static void main(String[] args) {
//        int number = 1243;
        int number = 1534236469;
//        int number = 678586789;
        log.info("Reversing the number {}, we get: {}", number, reverse(number));
    }


    static int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -1 * x;
        }
        int result = 0;
        int rem = 0;
        while (x > 0) {
            rem = x % 10;
            int reverse = (result * 10) + rem;
            if ((reverse - rem) / 10 != result) {
                return 0;
            }
            result = reverse;

            x = x / 10;
        }
        return sign * result;
    }

    static int mySolutionForReverse(int x) {
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
