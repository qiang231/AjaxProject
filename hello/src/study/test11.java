package study;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class test11 {

    HashMap<String, String> datas = new HashMap<String, String>();
    String d1 = "I like to watch the sun set with my friend";
    String d2 = "The Best Place To Watch The Sunset";
    String d3 = "My friend watch the sun come up";

    public void dispose()
    {
        HashSet<String> terms = new HashSet<>();
        for(String term : d1.concat(d2).concat(d3).split(" "))
        {
            terms.add(term);
        }

        String[] words = new String[terms.size()];
        for (int i=0; i<terms.size(); i++)
        {
            String word = terms.toArray(words)[i];
            datas.put(word, (d1.contains(word)?"1":"") + "" + (d2.contains(word)?"2":"") + "" + (d3.contains(word)?"3":""));
        }
        System.out.println(datas);
    }
    public void search() throws IOException
    {
        boolean flag = false;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String[] keywords = line.split(" ");
        for (String keyword : keywords)
        {
            if (!datas.keySet().contains(keyword))
            {
                flag = true;
            }

            else
            {
                String docs = datas.get(keyword);
                char[] cs = docs.toCharArray();
                for (int i=0; i<cs.length; i++)
                {
                    System.out.println("doc" + cs[i]);
                }
            }
        }
        if(flag)
        {
            System.out.println("找不到");
        }
    }
    public static void main(String[] args) throws IOException {
        test11 ii = new test11();
        ii.dispose();
        ii.search();
    }
}