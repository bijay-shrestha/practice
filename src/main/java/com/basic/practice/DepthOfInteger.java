package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class DepthOfInteger {

    public static void main(String[] args) {
        int n = 42;

        System.out.println(depth(n));
        System.out.println(Int_to_array(4123));
    }

    static int depth(int n) {
        int a[] = new int[10];
        System.out.println(a.length);

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int pro = 0;
            pro = n * i;
            int cont = pro % 10;

            for (int j = 0; j < a.length; j++) {

            }

        }
        return 0;
    }


    static int[] Int_to_array(int n)
    {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        return arr;
    }
}
