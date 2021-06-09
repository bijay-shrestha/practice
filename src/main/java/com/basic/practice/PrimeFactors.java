package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class PrimeFactors {

    public static void main(String[] args) {
        int n = 6936;
        int smallestPrimeNumber = 2;
        int nextPrimeNumber;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = smallestPrimeNumber; i <= n; i++) {
            if (n % smallestPrimeNumber == 0) {
                log.info(" Dividing {} by {}", n, smallestPrimeNumber);
                arr.add(smallestPrimeNumber);
            } else {
                nextPrimeNumber = smallestPrimeNumber + 1;
                if (isPrimeNumber(nextPrimeNumber)) {
                    smallestPrimeNumber = nextPrimeNumber;
                } else {
                    smallestPrimeNumber++;
                }
                continue;
            }
            n = n / smallestPrimeNumber;
            if (isPrimeNumber(n)) {
                arr.add(n);
            }
        }

        log.info("Resultant Prime Factors are: {}", arr.toString());

    }

    static boolean isPrimeNumber(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return true;
        }
        return false;
    }

}


