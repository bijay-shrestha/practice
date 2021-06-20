/**
 * * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * * Example 1:
 * *
 * * Input: nums = [-4,-1,0,3,10]
 * * Output: [0,1,9,16,100]
 * * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * * After sorting, it becomes [0,1,9,16,100].
 * *
 * * Example 2:
 * *
 * * Input: nums = [-7,-3,2,3,11]
 * * Output: [4,9,9,49,121]
 * *
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeetCodeQuestionThree {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {-4, -1, 0, 3, 10};
        log.info("Output: {}", sortedSquares(arrayOfNumbers));
    }

    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int temp = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums.length; k++) {
                if (nums[j] < nums[k]) {
                    temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }
        return nums;
    }

}
