package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsSquare {
    public static void main(String[] args) {
        int number = 0;
        log.info("Checking if {} has a square. Result: {}", number, isSquare(number));
    }

    static int isSquare(int n) {
        int isSquare = 0;
        for (int i = 0; i <= n; i++) {
            if (n == i * i) {
                isSquare = 1;
                break;
            }
            log.info("n {}", i);
        }
        return isSquare;
    }
}
