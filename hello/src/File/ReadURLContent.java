package File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadURLContent {
    static final String FilePath = "D:/163.html";
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.163.com/index.html");

            //将InputStream转换成Reader的套路，使用装饰类InputStream
            StringBuffer content = new StringBuffer();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))){
                String line = null;
                while ((line = bufferedReader.readLine()) != null){
//                    System.out.println(line);
                    content.append(line);
                    content.append(System.getProperty("line.separator"));
                }
//                 ReplaceLyriceDemo.FilePath = FilePa;
                ReplaceLyricsDemo1.WriteFileByWriter(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
