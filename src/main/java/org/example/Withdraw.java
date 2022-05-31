package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Withdraw {
    public static ArrayList<Integer> withdraw(int amount) {
        int countHundred = 0;
        int countFifty = 0;
        int countTwenty = 0;

        while (amount > 0) {
            if (amount % 100 == 0) {
                amount -= 100;
                countHundred++;
            } else if (amount % 50 == 0) {
                amount -= 50;
                countFifty++;
            } else {
                amount -= 20;
                countTwenty++;
            }
        }

        return new ArrayList<>(Arrays.asList(countHundred, countFifty, countTwenty ));
    }

    public static void main(String[] args) {
        int amount = 270;
        System.out.println(Withdraw.withdraw(amount));
    }
}
