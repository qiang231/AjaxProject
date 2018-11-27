package File;

import java.io.*;

public class FileStreamDemo {
    private static final String FilePath = "src/File/FileDemo.java";

    public static void main(String[] args) throws IOException {
        readFile();
        writeFile();


    }
    public static void writeFile() throws IOException {
        //1.定义文件的路径
        final String FilePath1 = "src/File/FileDemo1.java";
        //2.将路径传入实例化的文件流
        OutputStream outputStream = new FileOutputStream(FilePath1,false);
        //3.编辑文件内容
        String content = "//public static void main(String[] args){\n ";
        content += "//system.out.println(\"hello world!\"); }";
        //4.调用文件输出流的write方法写文件
        outputStream.write(content.getBytes());   //将字符串转换为字节数组，写入到文件中
        //5.写入完成后关闭
        outputStream.close();
    }


    public static void readFile() throws IOException {
        //1.初始化文件的路径
        File file = new File(FilePath);
        //2.将路径传入到输入流
        InputStream inputStream = new FileInputStream(file);

        //3.建立一个字节数组
        byte[] bytes = new byte[20000];
//        int count = 0;
        //4.调用输入流的read方法，按字节读取文件内容
        inputStream.read(bytes);
//        while ((bytes[count] = (byte)inputStream.read()) != -1 ){
//            count++;
//        }
        //5.将读取出来的内容转换为字符串打印出来
        String content = new String(bytes);
        System.out.println(content);
//        System.out.println(count);
    }
}
