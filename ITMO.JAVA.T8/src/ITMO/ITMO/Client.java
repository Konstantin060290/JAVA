package ITMO.ITMO;

public class Client extends Human

{
    private String bankname;

    @Override
    String getFullName()
    {
        String fullname;
        fullname = this.getName()+" "+this.getSurname();
        return fullname;
    }

    Client(String fn, String sn, String bn)
    {
        super(fn, sn);
        this.bankname = bn;
    }

}
