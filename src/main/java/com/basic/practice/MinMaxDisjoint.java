package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinMaxDisjoint {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {5, 4, 3, 2, 1};
        int[] arrayOfNumbers = {18, -1, 3, 4, 0};
//        int[] arrayOfNumbers = {9, 0, 5, 9};
//        int[] arrayOfNumbers = {0, 5, 18, 0, 9};
//        int[] arrayOfNumbers = {7, 7, 7, 7};
//        int[] arrayOfNumbers = {};
//        int[] arrayOfNumbers = {1, 2};
//        int[] arrayOfNumbers = {1};
//        log.info(" The maximum value of array {} is : {}", arrayOfNumbers, maxValue(arrayOfNumbers));
//        log.info(" The minimum value of array {} is : {}", arrayOfNumbers, minValue(arrayOfNumbers));
        log.info("Checking if given array {} is minmax-disjoing. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", isMinMaxDisjoint(arrayOfNumbers));
    }

    private static int isMinMaxDisjoint(int[] n) {
        if (n.length == 0) {
            return 0;
        }
        int maximumValue = maxValue(n);
        int minimumValue = minValue(n);

        log.info("max val: {}", maximumValue);
        log.info("min val: {}", minimumValue);
        log.info("max occ: {}", countOccurrence(n, maximumValue));
        log.info("min occ: {}", countOccurrence(n, minimumValue));

        if ((countOccurrence(n, maximumValue) == 1) &&
                (countOccurrence(n, minimumValue) == 1) &&
                (minimumValue != maximumValue) &&
                (maximumValue != minimumValue + 1)
        ) {
            return 1;
        }
        return 0;
    }

    static int maxValue(int[] arr) {
        int largestValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        return largestValue;
    }

    static int minValue(int[] arr) {
        int smallestValue = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < smallestValue) {
                smallestValue = arr[j];
            }
        }
        return smallestValue;
    }

    static int countOccurrence(int[] arr, int occurrenceToBeCounted) {
        int occurance = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == occurrenceToBeCounted) {
                occurance++;
            }
        }
        return occurance;
    }


}
