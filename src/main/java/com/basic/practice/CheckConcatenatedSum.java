/**
 * The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its digits is concatenated twice and then summed, the result
 * will be the original number. It turns out that 198 is the only number with this property.
 * <p>
 * However, the property can be generalized so that each digit is concatenated n times and then summed.
 * For example, 2997 = 222+999+999+777 and here each digit is concatenated
 * three times.
 * <p>
 * Write a function named checkContenatedSum that tests if a number has this generalized property.
 * <p>
 * The signature of the function is
 * int checkConcatenatedSum(int n, int catlen) where n is the number and catlen is the number of times to concatenate each digit
 * before summing.
 * <p>
 * The function returns 1 if n is equal to the sum of each of its digits contenated catlen times. Otherwise, it returns 0. You may assume
 * that n and catlen are greater than zero
 * Hint: Use integer and modulo 10 arithmetic to sequence through the digits of the argument.
 * Examples:
 * if n is and catlen is return       reason
 * 198           2          1          because 198 == 11 + 99 + 88
 * 198           3          0          because 198 != 111 + 999 + 888
 * 2997          3          1          because 2997 == 222 + 999 + 999 + 777
 * 2997          2          0          because 2997 != 22 + 99 + 99 + 77
 * 13332         4          1          because 13332 = 1111 + 3333 + 3333 + 3333 + 2222
 * 9             1          1          because 9 == 9
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class CheckConcatenatedSum {

    public static void main(String[] args) {

        int number = 198;
        int catLen = 2;
//        int number = 2997;
//        int catLen = 3;
//        int number = 13332;
//        int catLen = 4;
//        int number = 9;
//        int catLen = 1;
//        int number = 2997;
//        int catLen = 2;
//        int number = 198;
//        int catLen = 3;
//        log.info("Checking Concatenated sum of a number {} with length {}. Result is: {}", number, catLen, checkConcatenatedSum(number, catLen));
//        log.info("Checking Concatenated sum of a number {} with length {}. Result is: {}", number, catLen, checkConcatenatedSumAnotherWay(number, catLen));
        log.info("Checking Concatenated sum of a number {} with length {}. Result is: {}", number, catLen, checkContencatedSum(number, catLen));
    }

    static int checkConcatenatedSum(int n, int catlen) {
        ArrayList<String> arrString = new ArrayList<>();
        ArrayList<String> newArrString = new ArrayList<>();
        ArrayList<Integer> strToIntegerArray = new ArrayList<>();
        int sumOfNewArrayElement = 0;
        String intToString = Integer.toString(n);

        for (int i = 0; i < intToString.length(); i++) {
            arrString.add(String.valueOf(intToString.charAt(i)));
        }

        log.info("Array of Characters: {}", arrString.toString());

        for (int i = 0; i < arrString.size(); i++) {
            StringBuilder sb = new StringBuilder(arrString.get(i));
            for (int j = 0; j < catlen - 1; j++) {
                sb.append(arrString.get(i));
            }
            newArrString.add(sb.toString());
        }

        for (int i = 0; i < newArrString.size(); i++) {
            strToIntegerArray.add(Integer.parseInt(newArrString.get(i)));
        }

        log.info("Metamorphosed array: {}", strToIntegerArray);

        for (int i = 0; i < strToIntegerArray.size(); i++) {
            sumOfNewArrayElement += strToIntegerArray.get(i);
        }

        if (sumOfNewArrayElement == n) {
            return 1;
        }

        return 0;
    }

    static int checkConcatenatedSumAnotherWay(int n, int catlen) {
        StringBuilder catlenStr = new StringBuilder();
        for (int i = 0; i < catlen; i++) {
            catlenStr.append(1);
        }
        log.info("Another way: CatlenStr: {}", catlenStr);
        if (n % Integer.parseInt(catlenStr.toString()) == 0) {
            return 1;
        }
        return 0;
    }

    public static int checkContencatedSum(int a,int n){
        int original=a;
        int sum=0;
        int contencated=getContencatedSumOf1(n);
        do {
            int e = original % 10;
            int l = e * contencated;
            sum = sum + l;
            original = original / 10;
        }while(original!=0);

        return sum==a ? 1:0;
    }

    public static int getContencatedSumOf1(int n){
        if(n==1){
            return 1;
        }
        int count=n;
        int sum=0;
        int e=1;
        do{
            for(int i=1;i<count;i++){
                e=e*10;
            }
            sum=sum+e;
            count-- ;
            e=1;
        }while (count>1);
        sum=sum+1;
        return sum;
    }
}
