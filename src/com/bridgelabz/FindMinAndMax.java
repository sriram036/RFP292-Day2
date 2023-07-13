package com.bridgelabz;

public class FindMinAndMax {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int ans1 = a+b*c;
        int ans2 = c+a/b;
        int ans3 = a%b+c;
        int ans4 = a*b+c;

        System.out.println(ans1+" "+ans2+" "+ans3+" "+ans4);

        if (ans1 > ans2 && ans1 > ans3 && ans1 > ans4) {
            System.out.println("Max is "+ ans1);
        } else if (ans2 > ans1 && ans2 > ans3 && ans2 > ans4) {
            System.out.println("Max is "+ans2);
        } else if (ans3 > ans1 && ans3 > ans2 && ans3 > ans4) {
            System.out.println("Max is "+ans3);
        } else if (ans4 > ans1 && ans4 > ans2 && ans4 > ans3) {
            System.out.println("Max is "+ans4);
        }

        if (ans1 < ans2 && ans1 < ans3 && ans1 < ans4) {
            System.out.println("Min is "+ ans1);
        } else if (ans2 < ans1 && ans2 < ans3 && ans2 < ans4) {
            System.out.println("Min is "+ans2);
        } else if (ans3 < ans1 && ans3 < ans2 && ans3 < ans4) {
            System.out.println("Min is "+ans3);
        } else if (ans4 < ans1 && ans4 < ans2 && ans4 < ans3) {
            System.out.println("Min is "+ans4);
        }
    }
}
