package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsolatedNumber {

    public static void main(String[] args) {
        long number = 63;
        log.info("Checking if given number {} is isolated or not. " +
                        "--> Result: 1 for yes and 0 for no and -1 for can't be identified.",
                number);
        log.info("Actual result: {}", checkIfIsolatedOrNot(number));
    }

    static int checkIfIsolatedOrNot(long number) {
        if (number > 2097151) return -1;

        long squareOfNumber = number * number;
        long cubeOfNumber = squareOfNumber * number;

        log.info("Square of {} is {}", number, squareOfNumber);
        log.info("Cube of {} is {}", number, cubeOfNumber);

        String parsedSquareNumber = String.valueOf(squareOfNumber);

        while (cubeOfNumber != 0) {
            log.info("Modulus of {} by 10, i.e, {} % 10, is {}", cubeOfNumber, cubeOfNumber, cubeOfNumber % 10);
            if (parsedSquareNumber.contains(String.valueOf(cubeOfNumber % 10))) {
                log.info("Square number: {} contains value of Cube Number: {}", parsedSquareNumber, cubeOfNumber);
                return 0;
            }
            cubeOfNumber = cubeOfNumber / 10;
        }
        return 1;
    }
}
