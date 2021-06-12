/**
 * * Write a function named countOnes that returns the number of ones in the binary representation of
 * * its argument. For example, countOnes(9) returns 2 because the binary representation of 9 is 1001.
 * *
 * * Some other examples:
 * * countOnes(5) returns 2 because binary 101 equals 5
 * * countOnes(15) returns 4 because binary 1111 equals 15.
 * * You may assume that the argument is greater than 0.
 * *
 * * The function prototype is
 * * int countOnes(int n);
 * *
 * * Hint use modulo and integer arithmetic to count the number of ones.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountOnes {

    public static void main(String[] args) {
//        int number = 5;
//        int number = 9;
        int number = 15;
        log.info("Counting number of 1's in the binary of {}, we get {}", number, countOnes(number));
    }

    static int countOnes(int n) {
        boolean flag = true;
        int rem = 0;
        int countOnes = 0;
        while (flag) {
            rem = n % 2;
            if (rem == 1) {
                countOnes++;
            }
            n = n / 2;
            if (n == 1) {
                countOnes++;
                flag = false;
            }
        }
        return countOnes;
    }
}
