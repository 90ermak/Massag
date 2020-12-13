package ru.geekbrains.lesson3;

import java.util.Scanner;

public class DZ3 {

    public static  void main (String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ваша задача угадать число ");
     int i = 9;
     int number =(int) (Math.random() * i);
     while (true) {
         System.out.println("Угадайте число от 0 до" + i);
         int input_number = scanner.nextInt();
         if (input_number == number) {
             System.out.println("Вы угадали");
             break;
         } else if (input_number > number) {
             System.out.println("Загаданное число меньше");
         } else {
         System.out.println("Загаданное число больше");
             System.out.println("\"Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)\"");
         }
     }
     scanner.close();
        }
    }





