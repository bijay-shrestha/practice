package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Slf4j
public class Trivalent {
    public static void main(String[] args) {

//        int[] arrayOfNumbers = {-1, 0, 1, 0, 0, 0};
//        int[] arrayOfNumbers = {};
        int[] arrayOfNumbers = {2147483647, -1, -1, -214783648, 4};

        log.info("Checking if given array {} is trivalent. --> Result: 1 for yes and 0 for no.",
                arrayOfNumbers);
        log.info("Actual result: {}", isTrivalent(arrayOfNumbers));
    }

    static int isTrivalent(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            newSet.add(a[i]);
        }
        /**
         * ***** [START] Code snippet to print hashset values
         */

        Iterator itr = newSet.iterator();
        while (itr.hasNext()) {
            log.info("Set element are as :: {}", itr.next());
        }

        /**
         * ***** [END] Code snippet to print hashset values
         */

        if (newSet.size() == 3) {
            return 1;
        }
        return 0;
    }

    int testTrivalent(int arrayOfNumbers[]) {
        int check[] = new int[arrayOfNumbers.length];
        int count = 0, flag;
        check[0] = arrayOfNumbers[0];
        count++;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            flag = 0;
            for (int j = 0; j < count; j++) {
                if (check[j] == arrayOfNumbers[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                check[count++] = arrayOfNumbers[i];
            }
        }
        if ((count) == 3)
            return 1;
        else
            return 0;

    }
}
