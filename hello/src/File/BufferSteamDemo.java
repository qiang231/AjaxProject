package File;

import java.io.*;

/**
 * 使用带缓存的流增加读写效率
 */
public class BufferSteamDemo {
    static final String filePath = "D:/eqwe.txt";
    public static void main(String[] args) throws IOException {

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
//        byte[] bytes = new byte[bufferedOutputStream.available()];
//        bufferedInputStream.read(bytes);
        String content = "wqeq";
        System.out.println(content);
        bufferedOutputStream.write(content.getBytes());
        bufferedOutputStream.close();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = new byte[bufferedInputStream.available()];
        bufferedInputStream.read(bytes);
        String content2 = new String(bytes);
        System.out.println(content2);
        bufferedInputStream.close();


    }
}
