package study;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckDemo {
    public static void main(String[] args) {
        File file = new File("D:/test.txt");
        System.out.println(file.exists());
        try {
            FileWriter fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
