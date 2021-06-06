/**
 * Write a program to find out whether a given integer is present in an array or not.
 **/
package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PracticeSetTwo {

    public static void main(String[] args) {
        int find = 13;
        boolean found = false;
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};

        for (int num : arrayOfNumbers) {
            if (num == find) {
                found = true;
                break;
            }
        }
        log.info("The number {} is found in an array {}. Result: {}", find, arrayOfNumbers, found);
    }
}
