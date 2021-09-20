package ITMO.ITMO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main

{
    public static void main(String[] args)

    {
        Main m1 = new Main();

        //region <Task 1>
        ArrayList<String> al1 = new ArrayList<>();
        al1 = m1.ReadFile("MyFile.txt");
        for (int i = 0; i <al1.size(); i++)
        {
            System.out.println(al1.get(i));
        }
        //endregion <Task 1>

        //region <Task 2>
        m1.WriteToFile("Привет!","ToFile.txt");
        //endregion <Task 2>

        //region<Task 3>
        m1.ConcatFiles("MyFile.txt", "ToFile.txt","ConcatFile.txt");
        //endregion<Task 3>
    }

    //region <Task 1>
    public ArrayList ReadFile(String filename)
    {
        ArrayList<String> al1 = new ArrayList<>();
        try(FileReader fr = new FileReader(filename))
        {
            BufferedReader br1 = new BufferedReader(fr);
            String line = br1.readLine();
            while (line != null)
            {
                al1.add(line);
                line = br1.readLine();
            }
        }
        catch(IOException ex)
        {
        System.out.println(ex.getMessage());
        }
        return al1;
    }
    //endregion <Task 1>

    //region <Task 2>

    public void WriteToFile(String toFile, String filename)
    {
        try( FileWriter fw1 = new FileWriter(filename, false))
        {
            fw1.write(toFile);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    //endregion <Task 2>

    //region <Task 3>

    public void ConcatFiles(String filename1, String filename2, String concatfile)
    {
        ArrayList<String> al1 = new ArrayList<>();
        try(FileReader fr1 = new FileReader(filename1))
        {
            BufferedReader br1 = new BufferedReader(fr1);
            String line = br1.readLine();
            while (line != null)
            {
                al1.add(line);
                line = br1.readLine();
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        try(FileReader fr2 = new FileReader(filename2))
        {
            BufferedReader br1 = new BufferedReader(fr2);
            String line = br1.readLine();
            while (line != null)
            {
                al1.add(line);
                line = br1.readLine();
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        try( FileWriter fw1 = new FileWriter(concatfile, false))
        {
            for (int i = 0; i <al1.size(); i ++)
            {
                fw1.write(al1.get(i));
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    //endregion <Task 3>

}
