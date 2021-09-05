package ITMO.ITMO;
import java.util.Random;

public class Vector {
    int x;
    int y;
    int z;
    public Vector(int ix, int iy, int iz)
    {
       x = ix;
       y = iy;
       z = iz;
    }
    public double Lengthcalc()
    {
    double l;
    l  = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    return l;
    }

    public double SCMultiplication(Vector v1, Vector v2)
    {
        double mp;
        mp  = (v1.x*v2.x) + (v1.y*v2.y) + (v1.z*v2.z);
        return mp;
    }

    public Vector VecMultiplication(Vector v1, Vector v2)
    {
        int x;
        int y;
        int z;
        x = v1.y*v2.z - v1.z*v2.y;
        y = v1.z*v2.x - v1.x*v2.z;
        z = v1.x*v2.y - v1.y*v2.x;
        Vector v3 = new Vector(x,y,z);
        return v3;
    }

    public double Anglebetvectors (Vector v1, Vector v2)
    {
        double cosalpha;
        cosalpha  = SCMultiplication(v1, v2)/(v1.Lengthcalc()*v2.Lengthcalc());
        return cosalpha;
    }

    public Vector SumVectors (Vector v1, Vector v2)
    {
        Vector v = new Vector(0,0,0);
        v.x = v1.x + v2.x;
        v.y = v1.y + v2.y;
        v.z = v1.z + v2.z;
        return v;
    }
    public Vector DiffVectors (Vector v1, Vector v2)
    {
        Vector v = new Vector(0,0,0);
        v.x = v1.x - v2.x;
        v.y = v1.y - v2.y;
        v.z = v1.z - v2.z;
        return v;
    }
    public Vector[] GenVectors(int n)
    {
        Vector[] arr;
        arr = new Vector[n];
        Random random = new Random();
        for (int i=0; i<n; i++)
        {
            Vector v1 = new Vector(random.nextInt(), random.nextInt(), random.nextInt());
            arr[i] = v1;
        }
        return arr;
    }


}
