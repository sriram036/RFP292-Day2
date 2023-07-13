package com.bridgelabz;

public class NumberToUnit {
    public static void main(String[] args) {
        int num = 300;

        if (num > 0 && num < 10){
            System.out.println("The number is unit one.");
        }
        else if (num >= 10 && num < 100) {
            System.out.println("The number is unit ten.");
        }
        else if (num >= 100 && num < 1000) {
            System.out.println("The number is unit hundred.");
        } else if (num >= 1000 && num < 10000) {
            System.out.println("The number is unit thousand.");
        }
    }
}
