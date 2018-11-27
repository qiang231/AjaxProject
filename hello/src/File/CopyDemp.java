package File;

import java.io.*;

public class CopyDemp {

    private static final String FilePath1 = "D:/迅雷下载/古惑仔.1996-2001.国粤双语￡CMCT南山石/[古惑仔1人在江湖(国粤双语)].Young.And.Dangerous.I.1996.DVDrip.x264.AC3.2Audios-CMCT.mkv";
    private static final String FilePath2 = "D:/古惑仔1.mkv";

    public static void main(String[] args) {

        long time = Copy();
        System.out.println("拷贝用时：" + time);
    }

    public static long Copy(){
        File file = new File(FilePath1);
        long startTime = System.currentTimeMillis();
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);

            outputStream = new FileOutputStream(FilePath2);
            bufferedOutputStream = new BufferedOutputStream(outputStream);


            int i = -1;

            while ((i = bufferedInputStream.read()) != -1){
                try {
                    bufferedOutputStream.write(i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("文件复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
