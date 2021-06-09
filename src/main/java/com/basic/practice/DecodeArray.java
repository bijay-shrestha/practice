/**
 * A number can be encoded as an integer array as follows. The first element of the array is any number and
 * if it is negative then the encoded number is negative.
 * <p>
 * Each digit of the number is the absolute value of the difference of two adjacent elements of the array. The
 * most significant digit of the number is the absolute value of the difference of the first two elements of the array.
 * <p>
 * For example, the array
 * {2, -3, -2, 6, 9, 18} encodes the number 51839 because
 * <p>
 * - 5 is abs(2 - (-3))
 * - 1 is abs(-3 - (-2))
 * - 8 is abs(-2 - 6)
 * - 3 is abs(6-9)
 * - 9 is abs(9-18)
 * <p>
 * The number is positive because the first element of the array is >= 0.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecodeArray {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {2, -3, -2, 6, 9, 18};
//        int[] arrayOfNumbers = {0, -3, 0, -4, 0};
//        int[] arrayOfNumbers = {-1, 5, 8, 17, 15};
//        int[] arrayOfNumbers = {1, 5, 8, 17, 15};
        int[] arrayOfNumbers = {111, 115, 118, 127, 125};
//        int[] arrayOfNumbers = {1, 1};

        log.info("Checking if the given array {} is encoded.", arrayOfNumbers);
        log.info("Actual Result: {}", isDecodeArray(arrayOfNumbers));
        log.info("Actual Result: {}", encodedNumber(arrayOfNumbers));
    }

    static int isDecodeArray(int[] a) {
        int[] arr = new int[a.length];
        int num = 0;
        String numToString = "";
        for (int i = 0; i < a.length - 1; i++) {
            int diff = (a[i] - a[i + 1]);
            num = diff > 0 ? diff : -1 * diff;
            arr[i] = num;
            numToString += String.valueOf(num);
        }
        num = a[0] >= 0 ? Integer.parseInt(numToString) : -1 * Integer.parseInt(numToString);


        return num;
    }

    public static int encodedNumber(int[] n){
        int[] encodedNumners=new int[n.length-1];
        int i=0;
        for(int j=0;j<n.length-1;j++){
            encodedNumners[i] =n[j]-n[j+1];
            i++;
        }

        int size=encodedNumners.length-1;
        int sum=0;

        for(int j=0;j<encodedNumners.length;j++){
            int c=0;
            if(encodedNumners[j]>0){
                c=encodedNumners[j];
            }else {
                c= -(encodedNumners[j]);
            }
            int m=c*get10s(size);
            sum=sum+m;
            size--;
        }

        return sum;


    }

    public static int get10s(int n){
        int num=1;
        if(n==0){
            return num;
        }
        for(int i=1;i<=n;i++){
            num=num*10;
        }

        return num;
    }
}
