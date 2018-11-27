package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    private static final String FilePath = "D:/wsss.txt";
    private static final String FilePath1 = "D:/Wss.txt";

    public static void main(String[] args) {
            CopyFile();
//        File file = new File(FilePath);
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(FilePath),"rw")) {
//        //读取文件
//            randomAccessFile.setLength(0);//强制让文件大小归零
//            //写入两千个整形数据
//            for (int i = 0; i < 2000; i++) {
//                randomAccessFile.writeChars("wsswan" + "\t");
//            }
//            //读取文件内容
//            System.out.println("当前文件大小" + randomAccessFile.length() + "字节");
//
//            randomAccessFile.seek(4 * 8);
//            randomAccessFile.seek(4 * 699);
//            System.out.println(randomAccessFile.readChar());
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
   }

        private static void CopyFile () {
            try (
                    RandomAccessFile srcFile = new RandomAccessFile(new File(FilePath1), "r");
                    RandomAccessFile newFile = new RandomAccessFile(new File(FilePath), "rw");
            ) {
                long fileLength = srcFile.length();
                byte[] bytes = new byte[(int) fileLength];
                srcFile.readFully(bytes);
                newFile.write(bytes);
                System.out.println("文件复制成功！");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
