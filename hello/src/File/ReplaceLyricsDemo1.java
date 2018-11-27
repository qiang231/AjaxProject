package File;

import java.io.*;

public class ReplaceLyricsDemo1 {
    static final String FilePath = "D:/163.html";

    public static void main(String[] args) {
        String content = ReafFileByReader(FilePath);
        //调用方法将content写入文件中
        WriteFileByWriter(content);
    }


    public static void WriteFileByWriter(String content){
        Writer writer = null;
        BufferedWriter bufferedWriter = null;

        String newContent = content.replaceAll("男","（男）").replaceAll("女","（女）").replaceAll("合","（合）");

        try {
            writer = new FileWriter(FilePath);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("修改成功!");
    }




    public static String ReafFileByReader(String filePath){

        StringBuffer lyrics = new StringBuffer();
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(filePath);
            bufferedReader = new BufferedReader(reader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                lyrics.append(line);
                lyrics.append(System.getProperty("line.separator"));
            }
            //去除最后一行分隔符
//            lyrics.delete(lyrics.toString().indexOf(System.getProperty("line.separator")),lyrics.toString().length());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return lyrics.toString();
    }
}
