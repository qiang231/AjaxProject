package File;

import java.io.*;

public class WriteAndReadExtend {
    private static final String FilePath1 = "D:/wss.txt";
    private static final String FilePath2 = "D:/wsss.txt";

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath1));
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath2))) {

            bufferedWriter.write("wssnswysdza");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
