/**
 * Define an array to be a railroad-tie array if the following three conditions hold
 * a. The array contains at least one non-zero element
 * b. Every non-zero element has exactly one non-zero neighbor
 * c. Every zero element has two non-zero neighbors.
 *
 *
 * For example, {1, 2, 0, 3, -18, 0, 2, 2} is a railroad-tie array because
 * a[0] = 1 has exactly one non-zero neighbor (a[1])
 * a[1] = 2 has exactly one non-zero neighbor (a[0])
 * a[2] = 0 has two non-zero neighbors (a[1] and a[3])
 * a[3] = 3 has exactly one non-zero neighbor (a[4])
 * a[4] = -18 has exactly one non-zero neighbor (a[3])
 * a[5] = 0 has two non-zero neighbors (a[4] and a[6])
 * a[6] = 2 has exactly one non-zero neighbor (a[7])
 * a[7] = 2 has exactly one non-zero neighbor (a[6])
 *
 *
 * The following are not railroad-tie arrays
 * {1, 2, 3, 0, 2, 2}, because a[1]=2 has two non-zero neighbors.
 * {0, 1, 2, 0, 3, 4}, because a[0]=0 has only one non-zero neighbor (it has no left neighbor)
 * {1, 2, 0, 0, 3, 4}, because a[2]=0 has only one non-zero neighbor (a[1])
 * {1}, because a[0]=1 does not have any non-zero neighbors.
 * {}, because the array must have at least one non-zero element
 * {0}, because the array must have at lease one non-zero element.
 *
 *
 */

package com.hawa.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RailroadTie {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 0, 3, -18, 0, 2, 2};
//        int[] arrayOfNumbers = {1, 2};
//        int[] arrayOfNumbers = {1, 2, 0, 1, 2, 0, 1, 2};
//        int[] arrayOfNumbers = {0, 0, 0, 0};
//        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arrayOfNumbers = {1, 3, 0, 3, 5, 0};

        log.info("Checking if the array {} is a Railroad-Tie array. Result: 1 for Yes and 0 for No.", arrayOfNumbers);

        log.info("Actual result: {}", isRailroadTie(arrayOfNumbers));
    }

    static int isRailroadTie(int[] a) {
        int countZeros = 0;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                if (a[i + 1] == 0) {
                    return 0;
                }
            } else if (i == len - 1) {
                if (a[i] == 0) {
                    return 0;
                }
            } else {
                if (a[i] != 0) {
                    if (a[i - 1] != 0 && a[i + 1] != 0) {
                        return 0;
                    } else if (a[i - 1] == 0 && a[i + 1] == 0) {
                        return 0;
                    }
                } else if (a[i] == 0) {
                    countZeros++;
                    if (!(a[i - 1] != 0 && a[i + 1] != 0)) {
                        return 0;
                    }
                }
            }
        }
        if (countZeros == len) {
            return 0;
        }

        return 1;
    }

}
