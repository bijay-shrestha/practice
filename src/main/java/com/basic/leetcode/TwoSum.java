/**
 * * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * *
 * * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * *
 * * You can return the answer in any order.
 * *
 * * Example 1:
 * * Input: nums = [2,7,11,15], target = 9
 * * Output: [0,1]
 * * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * *
 * * Example 2:
 * * Input: nums = [3,2,4], target = 6
 * * Output: [1,2]
 * *
 * * Example 3:
 * * Input: nums = [3,3], target = 6
 * * Output: [0,1]
 */

package com.basic.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TwoSum {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 7, 11, 15};
        int target = 9;

        log.info("Finding out two sums for the array {} and target {}. We get {}", arrayOfNumbers, target,
                twoSums(arrayOfNumbers, target));
    }

    static int[] twoSums(int[] nums, int target) {
        int[] a = new int[2];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[idx] = i;
                    a[idx + 1] = j;
                }
            }
        }
        return a;
    }
}
