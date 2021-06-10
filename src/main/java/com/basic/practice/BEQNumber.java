/**
 * * A BEQ number is one whose cube contains exactly four 6’s. For example, 806 is a BEQ number because 806*806*806 =
 * * 523,606,616 which has four 6’s. But 36 is not a BEQ number because its cube is 46,656 which has only three 6’s.
 * *
 * * And neither is 1,118 because its cube is 1,676,676,672 which contains five 6’s.
 * * Write a function named findSmallestBEQ that returns the smallest BEQ number.
 * *
 * * The function signature is
 * * int findSmallestBEQnumber( )
 * *
 * * Hint use modulo base 10 arithmetic and integer division to get the digits of an integer.
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BEQNumber {
    public static void main(String[] args) {
        log.info("************ Trying to find the smallest BEQ number ************: {}", findSmallestBEQnumber());
    }

    static int findSmallestBEQnumber() {
        boolean flag = true;
        int n = 1;
        int cube;
        while (flag) {
            cube = n * n * n;
            if (getNumberOfSixes(cube) == 4) {
                flag = false;
            }
            n++;
        }
        return --n;
    }

    static int getNumberOfSixes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (n % 10 == 6) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
