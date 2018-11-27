package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrinterWriterDemoTest {
    static final String FilePath = "D:/soil.txt";

    public static void main(String[] args) {
        String separator = System.getProperty("line.separator");
        //编写内容
        String content = "wssas"+separator;
        content += "wsasa";
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new File(FilePath));
            printWriter.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.close();

        Scanner scanner =null;
        try {
            scanner = new Scanner(new File(FilePath));
            StringBuffer value = new StringBuffer();
            while (scanner.hasNextLine()){
                value.append(scanner.nextLine());
                value.append(separator);
            }

            System.out.println("从文件中读取出的内容是：");
            System.out.println(value.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
