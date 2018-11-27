package File;

import java.io.*;

public class BufferStreamTest {
    /**
     * 本地文件
     */
    private static final String FilePath1 = "D:/迅雷下载/古惑仔.1996-2001.国粤双语￡CMCT南山石/[古惑仔1人在江湖(国粤双语)].Young.And.Dangerous.I.1996.DVDrip.x264.AC3.2Audios-CMCT.mkv";
    private static final String FilePath2 = "D:/迅雷下载/古惑仔.1996-2001.国粤双语￡CMCT南山石/古惑仔1.mkv";

    public static void main(String[] args) throws IOException {
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
//        byte[] bytes = new byte[200];
//        System.out.println("请输入字符串：");
//        bufferedInputStream.read(bytes);
//        System.out.println("用户输入的字符串是：" + new String(bytes));
        long time = copyFileBufferedStream();
        System.out.println("拷贝用时：" + time + "毫秒");


    }

    private static long copyFileBufferedStream(){
        File file = new File(FilePath1);
        if(!file.exists()){
            System.out.println("文件不存在，复制失败");
        }


        long startTime = System.currentTimeMillis();
        InputStream inputStream = null;//输入流
        BufferedInputStream bufferedInputStream = null;    //输入缓存流

        OutputStream outputStream = null;                   //输出流
        BufferedOutputStream bufferedOutputStream = null;   //输出缓存流
        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);

            outputStream = new FileOutputStream(FilePath2);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            int i = -1;//读取出的临时变量

            while ((i = bufferedInputStream.read()) != -1){
                bufferedOutputStream.write(i); //这里只是写道缓存中去
            }
            System.out.println("文件复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();//最后将缓存中的内容写入到文件中去
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
