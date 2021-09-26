package ITMO.ITMO;


import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
    Main m1 = new Main();
    System.out.println("Enter search request in wiki:");
    Scanner in = new Scanner(System.in);
    String myURL="https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch="+in.nextLine().toString();
    String json = m1.readUrl(myURL);
//        String json = m1.readUrl("http://www.javascriptkit.com/"
//                + "dhtmltutors/javascriptkit.json");

        Gson gson = new Gson();
//      Search s1 = gson.fromJson(json, Search.class);
//      System.out.println(s1.title);

        org.json.JSONObject parsedObject = new org.json.JSONObject(json); //Здесь парсим.
        Object title = parsedObject.get("query"); //Получить элемент по имени
        System.out.println(title);
    }

    public String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }



    @Generated("jsonschema2pojo")
    public class Continue {

        @SerializedName("sroffset")
        @Expose
        public Integer sroffset;
        @SerializedName("continue")
        @Expose
        public String _continue;

    }


    @Generated("jsonschema2pojo")
    public static class Query {

        @SerializedName("searchinfo")
        @Expose
        public Searchinfo searchinfo;
        @SerializedName("search")
        @Expose
        public List<Search> search = null;

    }

    @Generated("jsonschema2pojo")
    public class Search {

        @SerializedName("ns")
        @Expose
        public Integer ns;
        @SerializedName("title")
        @Expose
        public String title;
        @SerializedName("pageid")
        @Expose
        public Integer pageid;
        @SerializedName("size")
        @Expose
        public Integer size;
        @SerializedName("wordcount")
        @Expose
        public Integer wordcount;
        @SerializedName("snippet")
        @Expose
        public String snippet;
        @SerializedName("timestamp")
        @Expose
        public String timestamp;

    }

    @Generated("jsonschema2pojo")
    public class Searchinfo {

        @SerializedName("totalhits")
        @Expose
        public Integer totalhits;

    }


    @Generated("jsonschema2pojo")
    public class WikiPage {

        @SerializedName("batchcomplete")
        @Expose
        public String batchcomplete;
        @SerializedName("continue")
        @Expose
        public Continue _continue;
        @SerializedName("query")
        @Expose
        public Query query;

    }

}


