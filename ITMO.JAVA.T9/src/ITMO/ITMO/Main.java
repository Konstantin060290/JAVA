package ITMO.ITMO;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args)

    {

    int[][] array = {{1000,500}, {1000,501}, {1000,502}};
	Main m1 = new Main();
	System.out.println(m1.SearchMax(array));
	System.out.println(m1.SCheck(array));
	System.out.println("Line where sum is max - " + m1.MaxSum(array));
    char[][] array1 = {{'X','X'}, {'X','X'}, {'X','X'}};
    m1.RandArr(array1);

    }


    public int SearchMax(int[][] array)
    {
        int a = 0;
        for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j <array[i].length; j ++)
            {
                if (array[i][j]>a)
                {
                    try
                    {
                        a = array[i][j];
                    }
                    catch (Exception e)
                        {
                            System.out.println("Error");
                        }
                }
            }
        }
        return a;
    }

    public String SCheck(int[][] array)
    {
        int a = 0;
        int b = 0;
        for (int i = 0; i<array.length; i++)
        {
            a = i;
            for (int j = 0; j <array[i].length; j ++)
            {
             b = j;
            }
        }
        if (a == b)
        {
            return "Array is square";
        }
        else
        {
            return "Array is not square";
        }
    }

    public int MaxSum (int[][] array)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j <array[i].length; j ++)
            {
                a += array[i][j];

            }
            if (a > b)
            {
                b = a;
                a = 0;
                c = i;
            }

        }
        return c;
    }

    public void RandArr(char[][] array)
    {
        Random random = new Random();
        int a=0;
        int b=27;

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j <array[i].length; j++)
            {
                try {
                    int x = a + random.nextInt(b - a + 1);
                    array[i][j] = alphabet[x];
                }
                catch(Exception e)
                {
                    System.out.println("There is no letter");
                }

              System.out.println(array[i][j]);
            }
        }
    }

}
