package ITMO.ITMO;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
        Main M1 = new Main();
        //M1.task3_1();
        //M1.task3_2();
        //M1.task3_3();
        //M1.task3_4();
        //M1.task3_5();
        M1.task3_6();
    }

    public void task3_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arr_length = sc.nextInt();
        int[] array = new int[arr_length];
        System.out.print("Введите значения в массив: ");
        for (int i = 0; i < arr_length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введенный массив:");
        for (int i = 0; i < arr_length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        if (is_arr_sorted(array) == true) {
            System.out.print("OK");
        } else {
            System.out.print("Please, try again");
        }

    }

    public static boolean is_arr_sorted(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public void task3_2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arr_length = sc.nextInt();
        int[] array = new int[arr_length];
        System.out.print("Введите значения в массив: " + "\n");
        for (int i = 0; i < arr_length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Введенный массив: [");
        for (int i = 0; i < arr_length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[arr_length - 1] + "]");
    }

    public void task3_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arr_length = sc.nextInt();
        int[] array = new int[arr_length];
        System.out.print("Введите значения в массив: " + "\n");
        for (int i = 0; i < arr_length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Введенный массив: [");
        for (int i = 0; i < arr_length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[arr_length - 1] + "]" + "\n");
        int[] new_array = array.clone();
        new_array[arr_length - 1] = array[0];
        new_array[0] = array[arr_length - 1];

        System.out.print("Массив с переставленными местами первым и последним элементами: [");
        for (int i = 0; i < arr_length - 1; i++) {
            System.out.print(new_array[i] + ",");
        }
        System.out.print(new_array[arr_length - 1] + "]");

    }

    public void task3_4()
    {
        int[] myArray = {1, 2, 3, 1, 2, 4};
        for (int i = 0; i < myArray.length; i++) {
            boolean distinct = true;
            for (int j = 0; j < myArray.length; j++) {
                if(myArray[i] == myArray[j] && i != j){
                    distinct = false;
                    break;
                }
            }
            if(distinct){
                System.out.print(myArray[i]);
                break;
            }

        }
    }
        public void task3_5()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите порядковый элемент последовательности Фибоначчи: ");
            int n_fib_elem = sc.nextInt();
            int num1 = 0;
            int num2 = 1;
            int result = num1 + num2;
            int n_fib_elem_fact=2;

            if (n_fib_elem==1)
            {
                System.out.print(num1);
            }
            if (n_fib_elem==2)
            {
                System.out.print(num1 + " "+num2);
            }
            if (n_fib_elem>2) {
                System.out.print(num1 + " " + num2 + " ");
            }
            while (n_fib_elem_fact < n_fib_elem) {
                System.out.print(result + " ");
                num1 = num2;
                num2 = result;
                result = num1 + num2;
                n_fib_elem_fact++;
            }
        }
    public void task3_6() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите длину массива: ");
        int arr_length = sc.nextInt();
        int[] array = new int[arr_length];
        for (int i = 0; i < arr_length; i++) {
            int x = rand.nextInt(10);
            array[i] = x;
        }
        System.out.print("Несортированный массив: " + "\n");
        for (int i = 0; i < arr_length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.print("\n");
        int[] result = mergesort(array);
        System.out.print("Отсортированный массив: " + "\n");
        for (int i = 0; i < arr_length; i++) {
            System.out.print(" " + result[i]);
        }
    }

    //Агоритм я содрал..

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    /* @param buffer1 Массив для сортировки.
     * @param buffer2 Буфер. Размер должен быть равен размеру buffer1.
     * @param startIndex Начальный индекс в buffer1 для сортировки.
     * @param endIndex Конечный индекс в buffer1 для сортировки.
     */
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}