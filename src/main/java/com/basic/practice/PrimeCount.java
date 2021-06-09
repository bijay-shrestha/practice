package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class PrimeCount {


    public static void main(String[] args) {
        int start = 2, end = 5;
//        log.info("Prime number count between  {} and {} is, {}", start, end, primeCount(start, end));
        log.info("Prime number count between  {} and {} is, {}", start, end, primeCountAnotheerWay(start, end));
    }

    public static int primeCount(int start, int end) {

        int count;
        int primeCount = 0;
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeCount++;
                primeList.add(i);
            }
        }
        primeList.forEach(p -> log.info("{}, ", p));
        return primeCount;
    }

    static int primeCountAnotheerWay(int start, int end) {
        int primeCount = 0;

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                log.info("{} is prime", i);
                primeCount++;
            }
        }

        return primeCount;
    }

}

