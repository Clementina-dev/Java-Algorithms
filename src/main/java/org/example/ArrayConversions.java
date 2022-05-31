package org.example;

import java.util.ArrayList;

public class ArrayConversions {
    public static void main(String[] args) {
        int sum;
        int product;
        int finalProduct = 0;
        int[] num = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < num.length; i+= 2) {
            sum = num[i] + num[i + 1];
            list1.add(sum);
        }

        for (int i = 0; i < list1.size(); i+= 2) {
            product = list1.get(i) * list1.get(i + 1);
            list2.add(product);
        }

        for (int total : list2) {
            finalProduct += total;
        }
        System.out.println(finalProduct);
    }
}
