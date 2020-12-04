package ru.geekbrains.lesson1;


public class DZ {
    public static void main(String[] args) {
        System.out.println("домашнее задание №1");

        int a = 30;
        a = 30;
        float b = 2f;
        b = 2f;
        float c;
        c = a + b;
        System.out.println("c" + a + b);
        {
        }
    }

    public static float sumCalculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isSumBetween10And20(int a, int b) {
//        a=9;
//        b=12;
       int sum  =a + b;
       boolean res = sum > 10 && sum<= 20;
       System.out.println(isSumBetween10And20(8,11));
       System.out.println(isSumBetween10And20(11,13));
        return res;
    }
    public static void printNegativeOrPositive(int number){
        if(10 >=0){
            System.out.println(10+"Положительное число ");
        }
        else
            {
                System.out.println(10+"Отрицательное число");
            }
    }
    public static  boolean isNegative(int number){
        return  number<0;
    }
    public static void  printName(String name){
        System.out.println("Привет, Артем!!!");
    }
    }
