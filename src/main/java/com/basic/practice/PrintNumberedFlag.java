/**
 * * Print a numbered flag
 * * 1
 * * 12
 * * 123
 * * 1234
 * * 12345
 */

package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintNumberedFlag {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
