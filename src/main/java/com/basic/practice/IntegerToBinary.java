package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntegerToBinary {

    public static void main(String[] args) {
        int number = 100;
        log.info("The binary of {} is , {}", number, intToBinary(100));
    }

    public static String intToBinary(int n) {
        String s = "";
        while (n > 0) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        return s;
    }

}
