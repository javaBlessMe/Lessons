package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    private static int firstFunction (int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    private static boolean secondFunction(int a, int b){
        return a+b>=10 && a+b<=20;
    }
    private static void thirdFunction(int a){
        if(a>=0) System.out.println("Передано положительно число");
        else System.out.println("Передали отрицательное число");
    }
}
