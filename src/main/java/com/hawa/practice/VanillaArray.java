package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VanillaArray {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1};
//        int[] arrayOfNumbers = {11, 22, 13, 34, 125};
        int[] arrayOfNumbers = {9, 999, 99999, -9999};
//        int[] arrayOfNumbers = {};
        log.info("Checking if given array {} is vanilla. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", isVanilla(arrayOfNumbers));
    }

    static int isVanilla(int[] a) {
        int rtnVal = 1;
        int rem = 0;
        int n = 0;
        int flag = 0;

        if (a.length > 0) {
            flag = a[0] % 10;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                a[i] = -1 * a[i];
            n = a[i];
            while (n != 0) {
                rem = n % 10;
                n = n / 10;
                if (rem != flag) {
                    rtnVal = 0;
                    break;
                }
            }
        }
        return rtnVal;

    }
}
