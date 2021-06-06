package com.hawa.practice;

public class Test {

    public static int[] doIntegerBasedRounding(int[] a, int n) {
        if (n <= 0) {
            return a;
        }

        int[] rounding = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            rounding[i] = round(a[i], n);
        }
        return rounding;
    }

    public static int round(int a, int n) {
        if (a == n) {
            return n;
        } else if (a < 0) {
            return a;
        } else if (a < n) {
            int zeroDiff = a - 0;
            int nDiff = n - a;
            if (zeroDiff == nDiff) {
                return n;
            } else if (zeroDiff < nDiff) {
                return 0;
            } else {
                return n;
            }
        } else if (a % n == 0) {
            return a;
        } else {
            int rem = a % n;
            int subRem = a - rem;
            int addRem = subRem + n;
            int aD = addRem - a;
            int sD = a - subRem;

            if (aD == sD) {
                return addRem;
            } else if (aD < sD) {
                return addRem;
            } else {
                return subRem;
            }
        }
    }
}
