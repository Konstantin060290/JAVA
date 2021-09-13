package ITMO.ITMO;

abstract public class Human
{
    private String firstname;
    private String surname;

    public String getName()
    {
        return firstname;
    }

    public String getSurname()
    {
        return surname;
    }

    abstract String getFullName();

    Human(String fn, String sn)
    {
        this.firstname = fn;
        this.surname = sn;
    }
}
