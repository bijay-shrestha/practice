/**
 * * Problem: Convert Array {1,2,3,4,5} to 12345
 * * or say, {1,2,0,4,5} to 12045
 * *
 */

package com.hawa.practice;

        import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayToNumber {

    public static void main(String[] args) {
//        int[] arrayOfNumber = {1, 2, 3, 4, 5};
//        int[] arrayOfNumber = {1, 2, 0, 4, 5};
        int[] arrayOfNumber = {1, 2, 3, 6, 8, 5};
        log.info("Converting array {} to the number. Result: {}",
                arrayOfNumber, convertArrayToInt(arrayOfNumber));

    }

    static int convertArrayToInt(int[] a) {
        int len = a.length;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += getMultipleOf10ByNTimes(a[i], --len);
        }
        return sum;
    }

    static int getMultipleOf10ByNTimes(int n, int times) {
        int mul = 1;
        int multipleOfTen = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < times; i++) {
            mul *= 10;
        }
        multipleOfTen = n * mul;
        log.info("Multiple Of 10 for {} is: {}", n, multipleOfTen);
        return multipleOfTen;
    }


}