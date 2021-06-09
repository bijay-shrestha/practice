/**
 * * A positive number n is consecutive-factored if and only if it has factors, i and j where i > 1, j > 1 and j = i + 1.
 * * Write a function named isConsecutiveFactored that returns 1 if its argument is consecutive-factored, otherwise
 * * it returns 0.
 * *
 * * the function signature is
 * * int isConsecutiveFactored(int n)
 * *
 * * If n is      return      because
 * * 24           1           24 = 2*3*4 and 3 = 2 + 1
 * * 105          0           105 = 3*5*7 and 5 != 3+1 and 7 != 5+1
 * * 90           1           factors of 90 include 2 and 3 and 3 = 2 + 1
 * * 23           0           has only 1 factor that is not equal to 1
 * * 15           0           15 = 3*5 and 5 != 3 + 1
 * * 2            0           2 = 1*2, 2 = 1 + 1 but factor 1 is not greater than 1
 * * 0            0           n has to be positive
 * * -12          0           n has to be positive
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsConsecutiveFactored {
    public static void main(String[] args) {
//        int number = 24;
//        int number = 105;
//        int number = 90;
//        int number = 23;
//        int number = 15;
//        int number = 2;
//        int number = 0;
        int number = -12;
        log.info("Checking if the number {} is consecutive factored. Return 1 for Yes and 0 for No.", number);
        log.info("Actual Result: {}", isConsecutiveFactored(number));
    }

    static int isConsecutiveFactored(int n) {
        int[] arr = new int[getCountOfFactorsOfNumberN(n)];
        int[] actArray = getArrayOfFactorNumbers(n, arr);
        int len = actArray.length;

        if (n <= 0) return 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] < 1 || arr[i + 1] < 1) {
                return 0;
            }
            if (actArray[i + 1] == actArray[i] + 1) {
                return 1;
            }
        }
        return 0;

    }

    static int getCountOfFactorsOfNumberN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                log.info("{} is a factor.", i);
                count++;
            }
        }
        log.info("Number of factors: {}", count);
        return count;
    }

    static int[] getArrayOfFactorNumbers(int n, int[] arr) {
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}
