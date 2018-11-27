package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {
    static final String Filepath = "D:/wssss.txt";

    public static void main(String[] args) throws FileNotFoundException {
        String sep = System.getProperty("line.separator");
        String content = "wssnswysdza" + sep;
        content += "wsswxnldsaasdasfd" + sep;
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new File(Filepath));
            printWriter.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.close();


        try (Scanner scanner = new Scanner(new File(Filepath))) {
            StringBuffer value = new StringBuffer();
            while (scanner.hasNextLine()){
                value.append(scanner.nextLine());
                value.append(sep);
            }
            System.out.println("从文件中读取出的内容是：");
            System.out.println(value.toString());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }

}
