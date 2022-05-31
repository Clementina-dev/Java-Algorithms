package org.example;

public class NumToOrdinal {
    public static String numberToOrdinal(Integer number) {
        int special = number % 100;
        if (special == 11 || special == 12 || special == 13) return String.valueOf(number) + "th";
        if(number % 10 == 1){
            return String.valueOf(number) + "st";
        } else if (number % 10 == 2) {
            return String.valueOf(number) + "nd";
        } else if (number % 10 == 3) {
            return String.valueOf(number) + "rd";
        }
        else {
            if (number == 0) return "0";
            else return String.valueOf(number) + "th";
        }
    }

    public static void main(String[] args) {
        System.out.println(NumToOrdinal.numberToOrdinal(101));
    }
}
