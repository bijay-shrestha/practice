/**
 * Print Triangle of Ones.
 */
package com.basic.practice;

public class TriangleOfOne {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println("");
        }
    }
}
