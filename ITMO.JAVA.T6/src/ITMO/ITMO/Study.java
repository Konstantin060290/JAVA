package ITMO.ITMO;

import java.util.Scanner;

class Study
{

    private String course;

    Study(String in)
    {
        this.course = in;
    };


    public String printCourse()
    {
        return this.course;
    }
}

class JavaProgram
{
    public static void main(String[] args)
    {
//       Study s1 = new Study("Изучение Java - это просто!");
//       System.out.println(s1.printCourse());
//       House h1 = new House();
//       h1.init(5,1950,"Чистое небо");
//       h1.Show();
//       h1.Age();
//       House h2 = new House();
//       h2.init(44,2011,"Tower");
//       h2.Show();
//       h2.Age();
//        Tree t1 = new Tree();
//        Tree t2 = new Tree(25, "Хвоя");
//        Tree t3 = new Tree(25, true, "Ель");
        Plane p1 = new Plane();
        Plane.Wing w1 = p1.new Wing();
        System.out.println("Введите вес крыла:");
        Scanner sc = new Scanner(System.in);
        w1.Set_Weight(sc.nextInt());
        System.out.println("Вес:"+w1.Show_Weight());
        Plane p2 = new Plane();
        Plane.Wing w2 = p2.new Wing();
        System.out.println("Введите вес крыла:");
        Scanner sc2 = new Scanner(System.in);
        w2.Set_Weight(sc2.nextInt());
        System.out.println("Вес:"+w2.Show_Weight());
    }
}

