package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsCentered15 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {3, 4, 2, 10, 4, 1, 6, 9, 1};
//        int [] arrayOfNumbers = {1, 1, 15, -1, -1};
//        int [] arrayOfNumbers = {5, 5, 5};
//        int[] arrayOfNumbers = {1, 1, 8, 3, 1, 1};
        log.info("Checking if give array {} is centered 15. Result : {}", arrayOfNumbers, isCentered15(arrayOfNumbers));
    }

    static int isCentered15(int[] arrayOfNumbers) {
        int countFirstHalfOfArray = 0;
        int countLastHalfOfArray = 0;
        int lengthOfArray = arrayOfNumbers.length;
        int halfOfArray = lengthOfArray / 2;
        int leftElementOfHalfOfArray = --halfOfArray;
        int centerElementOfHalfOfArray = halfOfArray += 1;
        int rightElementOfHalfOfArray = halfOfArray + 1;

        if (lengthOfArray >= 3) {
            if (lengthOfArray == 3) {
                if (arrayOfNumbers[1] == 15) {
                    return 1;
                } else if (arrayOfNumbers[0] + arrayOfNumbers[1] + arrayOfNumbers[2] == 15) {
                    return 1;
                }
                return 0;
            } else if (lengthOfArray == 6) {
                int sum = 0;
                for (int i = 0; i < lengthOfArray; i++) {
                    sum += i;
                }
                if (sum == 15) {
                    return 1;
                }
                return 0;
            } else if (lengthOfArray % 2 == 0) {
                return 0;
            } else {
                for (int i = 0; i < leftElementOfHalfOfArray; i++) {
                    countFirstHalfOfArray++;
                }
                for (int j = lengthOfArray - 1; j > rightElementOfHalfOfArray; j--) {
                    countLastHalfOfArray++;
                }
                if ((arrayOfNumbers[leftElementOfHalfOfArray] +
                        arrayOfNumbers[centerElementOfHalfOfArray] +
                        arrayOfNumbers[rightElementOfHalfOfArray] == 15) &&
                        (countFirstHalfOfArray == countLastHalfOfArray)) {
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;
    }


}
