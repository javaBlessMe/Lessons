package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        leapYear(1900);
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
    private static boolean fourth(int a){
       return a<0;
    }
    private static void fives(String str){
        System.out.println("Привет, "+str);;
    }
    private static void leapYear(int year){
        if(year%4!=0){
            System.out.println("Это невисокосный год");
        }
        else
        {
            if(year%100==0 && year%400!=0){
                System.out.println("Это невисокосный год");
            }
            else System.out.println("Это високосный год");

        }
    }
}
