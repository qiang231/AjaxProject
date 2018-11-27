package Download;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 1.从HTTP协议下载文件（文件流），经文件流以缓冲流的方式读到内存中
 * InputStream ->BufferedInputStream
 * 2.将缓存中数据分块写入到硬盘上（使用RandomAccessFile实现）
 * 当前案例主要实现从http协议下载文件
 */
public class Download_RandomAccessFile {
    public static final String StrUrl ="https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows";
    /**
     * 设置下载时的最大缓存大小
     */
    private static final int MAX_BUFFER_SIZE = 102400;

    public static void main(String[] args) {

        //1.打开http链接，获取下载内容的长度
        //2.创建RanddomAccessFile对象
        //3.将下载的内容缓存到字节数组中
        //4.将缓存字节数组通过RandomAccessFile对象写入到文件中
        HttpURLConnection connection = null;
        BufferedInputStream bufferedInputStream =null;
        try {
            URL url = new URL(StrUrl);
            connection =(HttpURLConnection)url.openConnection();

            //设置连接属性,Range指从服务器请求下载的文件的字节数范围；0- 最大值
            connection.setRequestProperty("Range","bytes=0-");
            connection.connect();//连接到服务器

            //判断连接是否成功，一般连接成功后返回一个代码，一般在200范围内
            if (connection.getResponseCode() / 100 != 2) {
                System.err.println("连接的响应不再200范围内，连接错误");
                return;
            }
            int fileSize = connection.getContentLength();
            bufferedInputStream = new BufferedInputStream(connection.getInputStream(),MAX_BUFFER_SIZE);

            int downloaded = 0;  //已下载的字节数，用来计算当前下载的百分比

            String fileName = url.getFile();  //获得下载的文件名
            //从最后一个斜线加1的位置开始截取
            fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            RandomAccessFile file = new RandomAccessFile(fileName,"rw");
            file.setLength(0);
            file.seek(0);//将文件指针置0

            while (downloaded < fileSize){//当前文件小于文件总大小继续下载
                byte[] bytes = null;
                //未下载的大小是否超过最大缓存数
                if(fileSize - downloaded > MAX_BUFFER_SIZE){
                    bytes = new byte[MAX_BUFFER_SIZE];
                }else {
                    bytes = new byte[fileSize - downloaded];
                }
                //将缓存中的内容读取出来
                int read = bufferedInputStream.read(bytes); //****
                if (read == -1) break; //下载完毕
                //将当前下载的缓存写入到文件中
                file.seek(downloaded);  //设置文件指针
                file.write(bytes,0,read);
                downloaded += read;
                System.out.println("当前下载进度" + downloaded * 1.0 /fileSize * 10000 / 100 + "%");

            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
