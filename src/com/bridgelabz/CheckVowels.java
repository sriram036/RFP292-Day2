package com.bridgelabz;

public class CheckVowels {
    public static void main(String[] args) {
        char character = 'u';
        switch (character) {
            case 'a','e','i','o','u':
                System.out.println(character+" is a vowel.");
                break;
            default:
                System.out.println(character+" is a constant.");
        }
    }
}
