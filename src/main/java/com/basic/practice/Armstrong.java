/**
 * Armstrong number
 * A number is called an Armstrong number if it is equal to the cube of its every digit.
 * For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
 * You need to write a program to check if the given number is Armstrong number or not.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        log.info("Checking if the number is an Armstrong or not. Return 1 for Yes and 0 for No.");
        log.info("Actual Result: {}", isArmStrong(number));
    }

    static int isArmStrong(int n) {


        return 0;
    }

    int numberOfCubes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 3 == 0) {
                count++;
            }
        }
    }
}
