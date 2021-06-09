/**
 * What Does the Method Print?
 *
 * a. false false
 * b. true false
 * c. true true
 * d. None of the above (Could be exception, or false true, et cetera)
 */


package com.basic.practice;


public class EffectiveJava {

    public static void main(String[] args) {
        System.out.println(yesOrNo("true") + " " + yesOrNo("YeS"));
    }

    static boolean yesOrNo(String s) {
        s = s.toLowerCase();
        if (s.equals("yes") || s.equals('Y') || s.equals("t"))
            s = "true";
        return Boolean.getBoolean(s);
    }
}




