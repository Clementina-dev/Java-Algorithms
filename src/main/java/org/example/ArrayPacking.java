package org.example;

import java.util.ArrayList;

public class ArrayPacking {
    public static int arrayPacking(ArrayList<Integer> integers) {
        StringBuilder packed = new StringBuilder();
        StringBuilder zeroCount;
        for (int i = integers.size() - 1; i >= 0; i--) {
            zeroCount = new StringBuilder();
            String rValue = Integer.toBinaryString(integers.get(i));
            int difference = 8 - rValue.length();
            zeroCount.append("0".repeat(Math.max(0, difference)));
            packed.append(zeroCount).append(rValue);
//            for (int j = 0; j < difference; j++) {
//                zeroCount.append("0");
//            }
//            packed.append(zeroCount+rValue);
        }
        return Integer.parseInt(packed.toString(),2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(5);
        System.out.println(arrayPacking(arr));
    }
}
