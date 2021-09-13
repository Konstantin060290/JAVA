package ITMO.ITMO;

public class Track extends Car {
    int quan_wheels;
    double max_weight;

    public void newWheels(int qw)
    {
        quan_wheels = qw;
        System.out.println("Количество колес - " + quan_wheels);
    }

    public Track(int w, String m, char c, float s, int qw, double mw)
    {
        super(w,m,c,s);
        this.quan_wheels = qw;
        this.max_weight = mw;
    }
}
