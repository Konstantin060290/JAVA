package ITMO.ITMO;

import java.io.Console;

public class T4_1 {
    String[] words ={"Привет", "Java", "Ты классный язык программирования", "хм"};

public String the_longest_string(String[] array) {
    int arr_length=0;
    String arr_value="0";
    for (int i=0; i<array.length;i++){
            if (arr_length< array[i].length())
            {
                arr_length=array[i].length();
                arr_value=array[i];
            }
        }
    return arr_value;
    }
}


