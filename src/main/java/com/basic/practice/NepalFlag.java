/**
 *
 * Print Nepal Flag in your console.
 */

package com.basic.practice;

public class NepalFlag {
    public static void main(String[] args) {
        printFlag();
        printFlag();
    }

    static void printFlag() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
