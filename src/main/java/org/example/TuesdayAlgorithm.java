package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TuesdayAlgorithm {
    public static boolean hasUniqueChar(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if(str.charAt(i) == str.charAt(j)) {
//                    return false;
//                }
//            }
//        }

//        ANOTHER SOLUTION
        Set<Character> charSet = new HashSet<>();
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            charSet.add(strChar[i]);
        }
        if (charSet.size() == strChar.length) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "A";
        System.out.println(TuesdayAlgorithm.hasUniqueChar(str));
    }
}
