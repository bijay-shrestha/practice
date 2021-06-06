package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Matches {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, -5, -5, 2, 3, 8};
        int[] P = {3, -2, 3};
//        int[] P = {2, 1, -1, -1, 2, 1};

        log.info("Checking if given array A={} matches P={} . --> Result: 1 for yes and 0 for no.",
                A, P);
        log.info("Actual result: {}", matches(A, P));
    }

//    static int matches(int[] a, int[] p) {
//        boolean isMatch = false;
//        int sumP = 0;
//        int[] newPArray = new int[p.length];
//
//        for (int i = 0; i < p.length; i++)
//            newPArray[i] = p[i];
//
//        for (int i = 0; i < newPArray.length; i++) {
//            if (newPArray[i] < 0) {
//                newPArray[i] = -1 * newPArray[i];
//            }
//            sumP += newPArray[i];
//        }
//
//        log.info("Sum of P {}, is {}.", p, sumP);
//        if (sumP != a.length) {
//            return 0;
//        }
//
//        int lastArrayIndex = 0;
//        for (int x = 0; x < p.length; x++) {
//            for (int y = 0; y < (p[x] > 0 ? p[x] : -1 * p[x]); y++) {
//                log.info("iterating with index: a[{}] = {}", lastArrayIndex, a[lastArrayIndex]);
//
//                lastArrayIndex++;
//
//            }
//            log.info("break... ");
//        }
//
//        return 1;
//    }

    static int matches(int[] a, int[] p) {
        int count = 0;
        for (int i : p) {
            count += i > 0 ? i : 0 - i;
        }
        if (a.length != count) {
            return 0;
        }
        int index = 0;
        for (int out : p) {
            int start = index;
            for (; start < (index + out > 0 ? out : 0 - out); start++) {
                if ((out > 0 && a[start] < 0) || (out < 0 && a[start] > 0)) {
                    return 0;
                }
            }
            index += start;
        }
        return 1;
    }
}
