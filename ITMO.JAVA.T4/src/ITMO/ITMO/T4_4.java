package ITMO.ITMO;

public class T4_4 {

    public void finder(){
        String text ="Привет, бяка! Как дела, бяка? бяка, ау!?";
        String find = "бяка";
        int index = text.indexOf(find);
        StringBuilder text_new=new StringBuilder(text);
        int i=0;
        while (index!=-1){
            text_new.replace(index,index+find.length(),"вырезано цензурой");
            index=text_new.toString().indexOf("бяка");
            i++;
        }
        System.out.println(i);
    }


}
