package ITMO.ITMO;

import java.lang.reflect.GenericArrayType;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	Main m1 = new Main();
	//Task1
	String[] arr = new String[3];
	arr[0] = "Moscow";
    arr[1] = "Moscow";
    arr[2] = "London";
//    HashSet<String> hs1 = new HashSet<String>();
//	hs1 = m1.ReturnUniq(arr);
//	m1.PrintUniq(hs1);

    //Task2
//    List<Integer> al1 = new ArrayList<>();
//    m1.FillAl(al1);
//    m1.Choose100k(al1);
//    List<Integer> ll1 = new LinkedList<>();
//    m1.FillAl(ll1);
//    m1.Choose100k(ll1);
    // LinkedList выполняется дольше чем Arraylist в 40 раз

    //Task 3
//    Map<User, Integer> map = new HashMap<>();
//    User u1 = new User("Vasya");
//    User u2 = new User("Kolya");
//    User u3 = new User("Ivan");
//    map.put(u1, 15);
//    map.put(u2, 25);
//    map.put(u3, 35);
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter name: ");
//    String name = scanner.nextLine();
//    User u4 = new User(name);
//    m1.GetScore(u4, map);

        //4.
        String[] strings1 = arr;
        arrayToMap(strings1).forEach((s, integer) -> System.out.println("Слово " + s + " встречается " + integer + " раз"));
    }

//Task1
    public HashSet ReturnUniq(String array[])
    {
        HashSet<String> uniq = new HashSet<String>();
        for (int i = 0; i <array.length; i++)
        {
            uniq.add(array[i]);
        }
        return uniq;
    }

    public void PrintUniq(HashSet<String> set)
    {
        for(String sets : set){

            System.out.println(sets);
        }
    }
//Task2
    public void FillAl(List<Integer> al1)
    {
        int min = 0;
        int max = 1000000;
        for (int i = min; i < max; i++)
        {
            al1.add(i);
        }
    }

    public void Choose100k(List al1)
    {
        int a = 0;
        int b = 100000;
        Long start = System.nanoTime();
        for (int i = 0; i < b; i ++)
        {
            int rnd = a + (int) (Math.random() * b);
            System.out.println(al1.get(rnd));
        }
        Long end = System.nanoTime();
        Long delta = end - start;
        System.out.println("Длительность - "+ delta/1000000 + "мс");
    }
//Task 3
    public void GetScore(User u1, Map map)
    {
        Integer score = (Integer) map.get(u1);
        if ((int)score !=0)
        {
            System.out.println("Scores - " + score);
        }
        else
        {
            System.out.println("User didn't play");
        }
    }
//Task 4
    public static  <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> result = new HashMap<>();
        for (K k : ks) {
            if (result.get(k) != null) {
                int t = result.get(k);
                result.put(k, ++t);
            }
            else {
                result.put(k, 1);
            }
        }
        return result;
    }


}

//Task3

class User
{
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    User(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object ob){
        if(this==ob)
        {
            return true;
        }
        return name.equals(((User)ob).name);
    }
    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }
}