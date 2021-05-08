package ITMO.ITMO;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Main L1 = new Main();
        //L1.task_2_1();
        //L1.task_2_2();
        //System.out.println(L1.task_2_3());
        //System.out.println(L1.task_2_4());
        //System.out.println(L1.task_2_5());
        System.out.println(L1.task_2_6());

    }

    public void task_2_1() {
        int i;
        for (i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void task_2_2() {
        int[] array = new int[100];
        int j = 1;
        System.out.println("Числа, которые делятся на 3:");
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
            j++;
        }
        int k = 1;
        System.out.println("Числа, которые делятся на 5:");
        for (int i = 0; i < array.length; i++) {
            array[i] = k;
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
            k++;
        }
        int l = 1;
        System.out.println("Числа, которые делятся на 3 и 5:");
        for (int i = 0; i < array.length; i++) {
            array[i] = l;
            if (array[i] % 3 == 0 & array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
            l++;
        }
    }

    public boolean task_2_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Сумма первого и второго чисел: " + sum+"\n");
        if (sum == num3) {
            return true;
        }
        return false;
        }

    public boolean task_2_4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();
        if (num2>num1 & num3>num2) {
            return true;
        }
        return false;
        }

        public boolean task_2_5() {
        int [] array = {0,5,7,12,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: "+"\n");
        int num = sc.nextInt();
            for (int i :array)
            {
                System.out.print(i+",");
            }
        if (num==array[0]&num==array[array.length-1])
        {
            return true;
        }
            return false;
        }


        public boolean task_2_6() {
            int [] array = {1,5,7,12,3};
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: "+"\n");
            int num = sc.nextInt();
            for (int i :array)
            {
                System.out.print(i+",");
            }
            boolean contains = IntStream.of(array).anyMatch(x -> x == num);
            if (contains==true)
            {
                System.out.print("Массив содержит введенное число"+"\n");
                return true;
            }
            else {
                System.out.print("Массив не содержит введенное число"+"\n");
            }
            return false;
        }

}
