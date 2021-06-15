/**
 *
 * * An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
 * * but 3224 is not.
 * *
 * * Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it
 * * returns 0.
 * *
 * * The function signature is
 * * int isEvens (int n)
 *
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsEvens {

    public static void main(String[] args) {
//        int number = 2426;
        int number = 3224;
        log.info("Checking if the number {} is all evens. Return 1 for Yes and 0 for No.", number);
        log.info("Actual result: {}", isEvens(number));
    }


    static int isEvens(int n) {
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem % 2 != 0) {
                return 0;
            }
            n = n / 10;
        }
        return 1;
    }
}
