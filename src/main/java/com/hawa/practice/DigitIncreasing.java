/**
 * A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. For example 24 is digit-
 * increasing because it equals 2 + 22 (here n = 2)
 *
 * Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it returns 0.
 *
 * if n is     then function returns       reason
 * 7           1                           because 7 = 7 (here n is 7)
 * 36          1                           because 36 = 3 + 33
 * 984         1                           because 984 = 8 + 88 + 888
 * 7404        1                           because 7404 = 6 + 66 + 666 + 6666
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DigitIncreasing {

    public static void main(String[] args) {
        int number = 24;
//        int number = 36;
//        int number = 984;
//        int number = 7404;
        log.info("Checking if the number {} is digit-increasing.", number);
        log.info("Actual Result: {}", isDigitIncreasing(number));
    }

    static int isDigitIncreasing(int num) {
        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int n = i;
            for (int j = 1; j <= 9; j++) {
                sum = sum + n;
                if (sum == num) {
                    return 1;
                }
                if (sum >= num) {
                    break;
                }
                n = (n * 10) + i;
            }
        }

        return 0;
    }
}
