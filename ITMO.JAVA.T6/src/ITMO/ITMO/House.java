package ITMO.ITMO;

import java.time.Year;

public class House
{
    int floors;
    int buildyear;
    String name;

    public void init(int floors, int buildyear, String name)
    {
        this.floors = floors;
        this.name = name;
        this.buildyear = buildyear;
    }

    public void Show()
    {
        System.out.println(this.floors);
        System.out.println(this.name);
        System.out.println(this.buildyear);
    }

    public void Age()
    {
        int age;
        int year = Year.now().getValue();
        age = year - buildyear;
        System.out.println(age);
    }

}
