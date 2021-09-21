package ITMO.ITMO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main

{
    public static void main(String[] args) throws IOException
    {
        Main m1 = new Main();

        //region <Task 1>
//        ArrayList<String> al1 = new ArrayList<>();
//        al1 = m1.ReadFile("MyFile.txt");
//        for (int i = 0; i <al1.size(); i++)
//        {
//            System.out.println(al1.get(i));
//        }
        //endregion <Task 1>

        //region <Task 2>
        //m1.WriteToFile("Привет!","ToFile.txt");
        //endregion <Task 2>

        //region<Task 3>
        //m1.ConcatFiles("MyFile.txt", "ToFile.txt","ConcatFile.txt");
        //endregion<Task 3>

        //region<Task 4>
        File source = new File("ConcatFile.txt");
        File dest = new File("For_copy/ConcatFile2.txt");
//      m1.copyFileUsingStream(source, dest);
        //endregion<Task 4>

        //region<Task 5>
//        List<String> files = m1.findFileName("For_copy/","Concat");
//        for(String l:files)
//        {
//            System.out.print(l+"\n");
//        }
        //endregion<Task 5>

        //region <Task 6>
        List<String> newfiles = m1.findContainsInFile("For_copy/","test");
        for(String l:newfiles)
        {
            System.out.print(l+"\n");
        }

        //endregion <Task 6>
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

    //region<Task 4>

    public void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    //endregion<Task 4>>

    //region<Task 5>

    public static List<String> findFileName (String dir, String substring) {
        File folder = new File(dir);
        try {
            File[] listOfFiles = folder.listFiles();
            return Stream.of(listOfFiles)
                    .filter(File::isFile)
                    .map(File::getName)
                    .filter(it -> it.contains(substring))
                    .collect(Collectors.toList());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    //endregion<Task 5>

    //region <Task 6>

    public static List<String> readFile (String path) {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public List<String> findContainsInFile (String dir, String substring) {
        File folder = new File(dir);
        try {
            File[] listOfFiles = folder.listFiles();
            List<String> result = new ArrayList<>();
            return Stream.of(listOfFiles)
                    .filter(File::isFile)
                    .filter(file -> readFile(file.getPath())
                            .toString()
                            .toLowerCase()
                            .contains(substring.toLowerCase()))
                    .map(File::getName)
                    .collect(Collectors.toList());
        }
        catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }
    //endregion <Task 6>
}
