package ITMO.ITMO;

import java.util.Scanner;

public class T4_2 {

    public void palindrom_ckeck()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = sc.next();

        if (word.length()%2==0)
        {
            if (word.substring(0, (word.length() / 2)).equals((new StringBuilder(word.substring((word.length() / 2), word.length())).reverse()).toString()))
            {
                System.out.print("Это слово - палиндром");
            }
            else
            {
                System.out.print("Это слово - не палиндром");
            }
        }
        if (word.length()%2!=0)
        {
            if (word.substring(0, ((word.length()-1 )/ 2)).equals((new StringBuilder(word.substring(((word.length()+1) / 2), word.length())).reverse()).toString()))
            {
                System.out.print("Это слово - палиндром");
            }
            else
            {
                System.out.print("Это слово - не палиндром");
            }
        }
    }

}
