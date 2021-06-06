package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class SumSafe {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {5, -2, 1};

        log.info("Checking if given array {} is sum-safe. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", isSumSafe(arrayOfNumbers));
    }

    static int isSumSafe(int[] a) {
        int sum = 0;
        ArrayList<Integer> integerArrayList = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            integerArrayList.add(a[i]);
        }
        if (integerArrayList.contains(sum)) {
            log.info("The ultimate sum of array {} matches the element in the array {}", sum, a);
            return 0;
        }
        log.info("Array {} is a sum-safe!", integerArrayList);
        return 1;
    }
}
