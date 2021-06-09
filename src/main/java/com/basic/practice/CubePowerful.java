/**
 * A number n>0 is called cube-powerful if it is equal to the sum of the cubes of its digits.
 * Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it returns 0.
 * The function prototype is
 * int isCubePowerful(int n);
 * Hint: use modulo 10 arithmetic to get the digits of the number.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class CubePowerful {

    public static void main(String[] args) {
        int number = -81;

        log.info("Checking if the number {} is cube-powerful or not. Return 1 for 'Yes' and 0 for 'No.", number);
        log.info("Actual Result: {}", isCubePowerful(number));
    }

    static int isCubePowerful(int n) {
        int sum = 0;
        String str = String.valueOf(n);
        if (n <= 0) {
            return 0;
        }
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            if (str.contains(String.valueOf(i))) {
                newSet.add(i);
            }
        }

        for (Integer num : newSet) {
            int cube = num * num * num;
            sum += cube;
        }

        if (sum == n) {
            return 1;
        }

        return 0;
    }
}
