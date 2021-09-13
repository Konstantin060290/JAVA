package ITMO.ITMO;

public class Bank_employee extends Human

{
    private String bankname;

    @Override
    String getFullName()
    {
        String fullname;
        fullname = this.getName()+" "+this.getSurname();
        return fullname;
    }

    Bank_employee(String fn, String sn, String bn)
    {
        super(fn, sn);
        this.bankname = bn;
    }
}
