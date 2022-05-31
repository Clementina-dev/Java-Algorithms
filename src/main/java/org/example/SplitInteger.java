package org.example;

import java.util.ArrayList;
import java.util.List;

public class SplitInteger {
//    Task
//In this challenge, you will write a function to divide an integer into a number of even parts,
// which will be returned in a result array. Summing the integers in this result array will produce the original number.
//For example, given number = 10 and parts = 2, splitInteger(10, 2) should return an array of integers with
// length equal to parts: [5, 5].
//Not all numbers will offer a clean division. In this case, we should split the number as closely as possible to even,
// with the smaller numbers in the front of the array. For example,
//splitInteger(11, 3) → [3, 4, 4]
//There is no reason to test for edge cases; the input to your function will always be valid for this challenge.
// Please see the below specification for the exact constraints on the


    public static List<Integer> splitInteger(int num, int parts) {
        ArrayList<Integer> newArr = new ArrayList<>();
        while (num > 0){
            int a = num / parts;
            newArr.add(a);
            num -= a;
            parts -= 1;
        }
        return new ArrayList<Integer>(newArr);
    }
    public static void main(String[] args) {
        System.out.println(SplitInteger.splitInteger(15, 3));
    }
}


