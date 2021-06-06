/**
 *
 * It is a fact that there exist two numbers x and y such that  x! + y! = 10!.
 * Write a method named solve10  that returns the values x and y in an array.
 * The notation n! is called n factorial and is equal to n * n-1 * n-2 * … 2 * 1, e.g.,  5! = 5*4*3*2*1 = 120.
 *
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solve10 {

    public static void main(String[] args) {
        log.info("Solve 10, value: {}", solve10());
    }

    static int[] solve10() {
        int factorialX = 1;
        int factorialY = 1;
        int x = 1;
        int y = 1;
        boolean matched = false;
        int tenFactorial = 1;
        int[] result = new int[2];

        for (int i = 1; i <= 10; i++) {
            tenFactorial *= i;
        }

        for (x = 1; x <= 10 && !matched; x++) {
            factorialX *= x;
            factorialY = 1;
            for (y = 1; y <= 10 && !matched; y++) {
                factorialY *= y;
                if (tenFactorial == factorialX + factorialY) {
                    matched = true;
                    break;
                }
            }
        }

        if (matched) {
            result[0] = x;
            result[1] = y;
        } else {
            result[0] = 0;
            result[1] = 0;
        }

        return result;

    }


}
