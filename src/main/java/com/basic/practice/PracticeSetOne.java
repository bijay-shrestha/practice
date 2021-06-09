/**
 * Calculate an array of 5 floats and calculate their sum.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PracticeSetOne {

    public static void main(String[] args) {
        float sum = 0f;
        float[] floatNumbers = {1.0f, 2.14f, 3.15f, 4.0f, 5.12f};

        for (float num : floatNumbers) {
            sum += num;
        }
        log.info("The sum of float numbers in a array {} is {}", floatNumbers, sum);
    }
}
