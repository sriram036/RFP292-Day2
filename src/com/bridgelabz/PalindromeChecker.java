package com.bridgelabz;

public class PalindromeChecker {
    public static void main(String[] args) {
        int num = 151;
        int num1 = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (num1 == reverse) {
            System.out.println(num1+" and "+reverse+" are a palindrome.");
        }
        else {
            System.out.println(num1+" and "+reverse+" are not a palindrome.");
        }
    }
}
