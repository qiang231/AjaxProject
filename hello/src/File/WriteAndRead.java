package File;

import java.io.*;

public class WriteAndRead {
    public static void main(String[] args) throws IOException {
        final String filePath1 = "D:/迅雷下载/古惑仔.1996-2001.国粤双语￡CMCT南山石/[古惑仔1人在江湖(国粤双语)].Young.And.Dangerous.I.1996.DVDrip.x264.AC3.2Audios-CMCT.mkv";
//        File file = new File(filePath);
//        OutputStream outputStream = new FileOutputStream(filePath);
//        String content = "wsswan";
//        outputStream.write(content.getBytes());
//        outputStream.close();




        long startTime = System.currentTimeMillis();
        InputStream inputStream = new FileInputStream(filePath1);
        byte[] bytes = new byte[filePath1.length()];
        inputStream.read(bytes);
        String content1 = new String(bytes);


        final String filePath2 = "D:/古惑仔1.mkv";
        OutputStream outputStream1 = new FileOutputStream(filePath2);
        outputStream1.write(content1.getBytes());
        outputStream1.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
