/**
 *
 * * Given an integer x, return true if x is palindrome integer.
 * *
 * * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 * *
 * * Example 1:
 * * Input: x = 121
 * * Output: true
 * *
 * * Example 2:
 * * Input: x = -121
 * * Output: false
 * * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * *
 * * Example 3:
 * * Input: x = 10
 * * Output: false
 * * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * *
 * * Example 4:
 * * Input: x = -101
 * * Output: false
 * *
 * *
 * * Constraints:
 * *
 * * -231 <= x <= 231 - 1
 *
 */

package com.basic.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Palindrome {

    public static void main(String[] args) {
//        int number = 1231;
        int number = 121;
        log.info("Checking if the given number {} is palindrome. Return true for Yes and false for No.", number);
        log.info("Actual Result: {}", isPalindrome(number));
    }

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int rem = 0;
        int count = 0;
        while (num > 0) {
            rem = num % 10;
            count++;
            num = num / 10;
        }
        log.info("Count: {}", count);
        int[] arr = createNormalArray(x, count);
        int[] revArr = createReverseArray(x, count);

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != revArr[idx]) {
                return false;
            }
            idx++;
        }

        return true;
    }

    static int[] createNormalArray(int n, int count) {
        int[] arr = new int[count];
        int rem = 0;
        int idx = count - 1;
        while (n > 0) {
            rem = n % 10;
            arr[idx] = rem;
            n = n / 10;
            idx--;
        }
        return arr;
    }

    static int[] createReverseArray(int n, int count) {
        int[] rev = new int[count];
        int rem = 0;
        int idx = 0;
        while (n > 0) {
            rem = n % 10;
            rev[idx] = rem;
            n = n / 10;
            idx++;
        }
        return rev;

    }

}
