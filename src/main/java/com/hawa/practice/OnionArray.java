//Todo: This is not completed.

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OnionArray {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 19, 4, 5};
//        int[] arrayOfNumbers = {1, 2, 3, 4, 15};
        log.info("Checking if the array {} is an onion array or not. Return 1 for Yes and 0 for No.", arrayOfNumbers);
        log.info("Actual Result: {}", isOnionArray(arrayOfNumbers));
    }

    static int isOnionArray(int[] a) {

        boolean isOnion = false;
        int len = a.length;
        if (len == 0) {
            return 1;
        }

        if (len == 1 && a[0] <= 10) {
            return 1;
        }

        for (int j = 0; j < len; j++) {

            if (len % 2 != 0) {
                if (a[j] == a[len / 2 + 1]) {
                    continue;
                }
            }

            if (a[j] == 0) {
                return 0;
            }
            if (a[j] == a[len - j - 1] && len % 2 == 0) {
                return 0;
            }

            if (a[j] + a[len - j - 1] <= 10) {
                isOnion = true;
                continue;
            }
            if (a[j] + a[len - j - 1] == len) {
                isOnion = true;
                continue;
            }
        }
        return isOnion ? 1 : 0;
    }
}
