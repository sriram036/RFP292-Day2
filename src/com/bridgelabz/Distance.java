package com.bridgelabz;

public class Distance {
    public static void main(String[] args) {
    int x,y;
    float distance;

    x=Integer.parseInt(args[0]);

    y=Integer.parseInt(args[1]);

    distance=(float)Math.sqrt(x*x + y*y);

    System.out.println("distance is "+distance);
    }
}
