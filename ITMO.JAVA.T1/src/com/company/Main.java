package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("Я\nхорошо\nзнаю\nJava");
        //2
        int i=(46+10)*(10/3);
        System.out.println(i);
        int j=29*4*(-15);
        System.out.println(j);
        //3
        int number=10500;
        int result=number/10/10;
        System.out.println(result);
        //4
        double a=3.6;
        double b=4.1;
        double c=5.9;
        double result_=a*b*c;
        System.out.println(result_);
        //5
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int input1=in.nextInt();
        System.out.println("Первое число="+input1);
        System.out.println("Введите второе число:");
        int input2=in.nextInt();
        System.out.println("Второе число="+input2);
        System.out.println("Введите третье число:");
        int input3=in.nextInt();
        System.out.println("Третье число="+input3);
        //6
        System.out.println("Введите число:");
        int bb=in.nextInt();
        int cc=bb%2;
        if (cc==0 && bb<=100)
        {
            System.out.println("Четное");
        }
        else if (cc==0 && bb>100)
        {
            System.out.println("Выход за пределы диапазона");
        }
        else
        {
            System.out.println("Нечетное");
        }
    }
}
