package File;

import java.io.*;

/**
 * 修改歌词，实际上是一个文件读写操作
 */
public class ReplaceLyriceDemo {
    static final String FilePath = "src/File/lyrics";
    public static void main(String[] args) {
        //使用字符流进行操作
        Reader reader =null;
        BufferedReader bufferedReader = null;

        Writer writer = null;
        BufferedWriter bufferedWriter = null;

        StringBuffer lyrice = new StringBuffer();
        try {
            reader = new FileReader(FilePath);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                lyrice.append(line);
                lyrice.append(System.getProperty("line.separator"));
            }
            //替换文件中的信息
            String newLyrice = lyrice.toString().replaceAll("（男）","男：").replaceAll("（女）","女：").replaceAll("（合）","合：");
            //将替换后的信息重新写入文件中

            writer = new FileWriter(FilePath);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(newLyrice);
            System.out.println("已替换成功！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                reader.close();
                bufferedWriter.flush();
                bufferedWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
