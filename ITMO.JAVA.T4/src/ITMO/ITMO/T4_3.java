package ITMO.ITMO;

public class T4_3 {

    public void censored (){
        String text ="Привет, бяка! Как дела, бяка? бяка, ау!?";
        String find = "бяка";
        int index = text.indexOf(find);
        StringBuilder text_new=new StringBuilder(text);
        while (index!=-1){
            text_new.replace(index,index+find.length(),"вырезано цензурой");
            index=text_new.toString().indexOf("бяка");
            }
        System.out.println(text_new.toString());

    }


}
