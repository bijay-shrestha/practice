/**
 *
 * * Write a function that accepts a character array, a zero-based start position and a length.
 * * It should return a character array containing length-characters starting with the start-character of the input array.
 * *
 * * The function should do error checking on the start position and the length and return null if the either value is not legal.
 * *
 * * The function signature is:
 * * char[ ] f(char[ ] a, int start, int len)
 * * Example:
 * *
 * *    If input parameters are	     return
 * *    {‘a’, ‘b’, ‘c’}, 0, 4	     null
 * *    {‘a’, ‘b’, ‘c’}, 0, 3	     {‘a’, ‘b’, ‘c’}
 * *    {‘a’, ‘b’, ‘c’}, 0, 2	     {‘a’, ‘b’}
 * *    {‘a’, ‘b’, ‘c’}, 0, 1	     {‘a’}
 * *    {‘a’, ‘b’, ‘c’}, 1, 3	     null
 * *    {‘a’, ‘b’, ‘c’}, 1, 2	     {‘b’, ‘c’}
 * *    {‘a’, ‘b’, ‘c’}, 1, 1	     {‘b’}
 * *    {‘a’, ‘b’, ‘c’}, 2, 2	     null
 * *    {‘a’, ‘b’, ‘c’}, 2, 1	     {‘c’}
 * *    {‘a’, ‘b’, ‘c’}, 3, 1	     null
 * *    {‘a’, ‘b’, ‘c’}, 1, 0	     {}
 * *    {‘a’, ‘b’, ‘c’}, -1, 2	     null
 * *    {‘a’, ‘b’, ‘c’}, -1, -2	     null
 * *    {}, 0, 1	null
 */
package com.basic.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuestionThree {

    public static void main(String[] args) {
//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 0;
//        int length = 4;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 0;
//        int length = 3;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 0;
//        int length = 2;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 0;
//        int length = 1;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 1;
//        int length = 3;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 1;
//        int length = 2;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 1;
//        int length = 1;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 2;
//        int length = 2;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 2;
//        int length = 1;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 3;
//        int length = 1;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = 1;
//        int length = 0;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = -1;
//        int length = 2;

//        char[] inputArray = {'a', 'b', 'c'};
//        int startCharacter = -1;
//        int length = -2;

        char[] inputArray = {};
        int startCharacter = 0;
        int length = 1;


        log.info("Character array containing containing length-characters starting with the start-character of the input " +
                "array {} is : {}", inputArray, f(inputArray, startCharacter, length));

    }

    static char[] f(char[] a, int start, int len) {
        int lengthOfA = a.length;
        if (len < 0 || len >= lengthOfA || start < 0 || start >= lengthOfA) {
            return null;
        }
        char[] arr = new char[lengthOfA > len ? len : lengthOfA];
        int index = 0;
        for (int i = 0; i < lengthOfA; i++) {
            if (i == start) {
                for (int j = 0; j < len; j++) {
                    arr[index] = a[i];
                    i++;
                    index++;
                    if (i > lengthOfA) {
                        return null;
                    }
                }
            }

        }

        return arr;
    }
}
