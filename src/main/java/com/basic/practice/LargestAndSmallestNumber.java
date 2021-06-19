package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LargestAndSmallestNumber {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {5, 7, 2, 4, 4, 19, 10};
        log.info("Getting the smallest and largest number from an array {}", arrayOfNumbers);
        log.info("small: {}, large: {}", getSmallestValueFromArray(arrayOfNumbers), getLargestValueFromArray(arrayOfNumbers));
        log.info("small: {}, large: {}", getSmallestValueFromArrayAlternative(arrayOfNumbers), getLargestValueFromArrayAlternative(arrayOfNumbers));
    }

    static int getSmallestValueFromArray(int[] a) {

        int small = a[0];
        int prevSmall = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            prevSmall = small;
            if (a[i] < a[i + 1] && a[i] < prevSmall) {
                small = a[i];
            } else {
                if (prevSmall <= a[i]) {
                    small = prevSmall;
                } else {
                    small = a[i + 1];
                }
            }
            if (small <= prevSmall) {
                prevSmall = small;
            }
        }

        return small;
    }

    static int getLargestValueFromArray(int[] a) {

        int large = a[0];
        int prevLarge = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            prevLarge = large;
            if (a[i] > a[i + 1]) {
                large = a[i];
            } else {
                if (prevLarge >= a[i + 1]) {
                    large = prevLarge;
                } else {
                    large = a[i + 1];
                }
            }

            if (large >= prevLarge) {
                prevLarge = large;
            }
        }

        return large;
    }

    static int getLargestValueFromArrayAlternative(int[] a) {
        int largestValue = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largestValue) {
                largestValue = a[i];
            }
        }
        return largestValue;
    }

    static int getSmallestValueFromArrayAlternative(int[] a) {
        int smallestValue = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallestValue) {
                smallestValue = a[i];
            }
        }
        return smallestValue;
    }
}
