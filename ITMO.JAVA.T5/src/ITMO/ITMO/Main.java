package ITMO.ITMO;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input coordinates of first vector x, y ,z:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        Vector v1 = new Vector(x,y,z);
        System.out.println("Input coordinates of second vector x, y ,z:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        Vector v2 = new Vector(x,y,z);
        System.out.println("First Vector length = " + v1.Lengthcalc());
        System.out.println("Second Vector length = " + v2.Lengthcalc());
        System.out.println("Vectors scalar multiplication = " + v1.SCMultiplication(v1,v2));
        Vector v3 = v1.VecMultiplication(v1,v2);
        System.out.println("Vectors vector multiplication = " + v3.x +","+v3.y+","+v3.z);
        System.out.println("Cos = " + v1.Anglebetvectors(v1,v2));
        System.out.println("Sum of vectors  = V(" + v1.SumVectors(v1,v2).x+","+v1.SumVectors(v1,v2).y+","+v1.SumVectors(v1,v2).z+")");
        System.out.println("Difference of vectors  = V(" + v1.DiffVectors(v1,v2).x+","+v1.DiffVectors(v1,v2).y+","+v1.DiffVectors(v1,v2).z+")");
        System.out.println("Enter quantity of random vectors:");
        int quantity;
        quantity =in.nextInt();
        Vector[] arr = v1.GenVectors(quantity);
        for (int i = 0; i <quantity; i ++)
        {
            System.out.println("Vector"+(i+1)+"("+arr[i].x+","+arr[i].y+","+arr[i].z+")");
        }
    }
}
