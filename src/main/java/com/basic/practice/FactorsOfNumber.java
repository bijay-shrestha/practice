package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = 20;
        log.info("The factors of {} are {}", num, getFactorsOfNumber(num));
    }

    static int[] getFactorsOfNumber(int n) {
        int x = 0;
        int[] arr = new int[countFactorsOfNumber(n)];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[x] = i;
                x++;
            }
        }
        return arr;
    }

    static int countFactorsOfNumber(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
