/**
 * Leetcode Challange 1:
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 *
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 *
 * Example 2:
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsecutiveOnes {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 1, 0, 1, 1, 1};
        int[] arrayOfNumbers = {1, 0, 1, 1, 0, 1};
        log.info("Consecutive 1's in the array {} is {}", arrayOfNumbers, findMaxConsecutiveOnes(arrayOfNumbers));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int lastCount = 0;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                if (lastCount >= currentCount) {
                    lastCount = lastCount;
                } else {
                    lastCount = currentCount;
                }
                currentCount = 0;
            }
        }
        return lastCount < currentCount ? currentCount : lastCount;
    }
}
