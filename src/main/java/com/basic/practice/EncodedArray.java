//package com.hawa.practice;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//public class EncodedArray {
//
//    public static void main(String[] args) {
//
//        encodeArray(1234);
//    }
//
//    static int[] encodeArray(int n) {
//        int[] encArray = new int[getArrayLength(n)];
//        log.info("The sum of remainder is : {}", encArray.length);
//
//        boolean flag = true;
//        int lastRem = 0;
//
//        for (int i = 0; flag; i++) {
//            if (n < 0) {
//                break;
//            }
//            int rem = n % 10;
//            int lastIndex =  placeZeros(rem, encArray, lastRemainder);
//
//            n = n / 10;
//
//        }
//
//
//        return null;
//    }
//
//    static int getArrayLength(int n) {
//        int count = 0;
//        while (n > 0) {
//            int num = n % 10;
//            count += num + 1;
//            n = n / 10;
//        }
//        return 0;
//    }
//
//    static int placeZeros(int rem, int[] a, int lastIndex) {
//        int count = 0;
//        for (int i = lastIndex; i < rem; i++) {
//            a[i] = 0;
//            count++;
//        }
//        return count;
//    }
//}
