package com.bridgelabz;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 231;
        int reverse = 0;
        System.out.println("The original number is "+num);
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("The Reversed number is "+reverse);
    }
}
