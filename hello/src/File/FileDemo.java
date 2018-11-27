package File;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("src");

        JFileChooser fileChooser =new JFileChooser(new File("."));
        fileChooser.showOpenDialog(null);
//        String pathName = fileChooser.getName();
        File file1 = fileChooser.getSelectedFile();
        String[] fileName = file.list();
        for (int i = 0; i < fileName.length; i++) {
            System.out.println(fileName[i]);
        }
    }
}
//    class Dirfilter implements FileFilter {
//
//        @Override
//        public boolean accept(File pathname) {
//            if (pathname.endsWith("java") || name.endsWith("project")){
//                return true;
//            }
//                return false;
//        }
//
//        @Override
//        public boolean accept(File pathname) {
//            return false;
//        }
//    }
//}










//        System.out.println("文件/文件夹是否存在:" + file.exists());
//        System.out.println("是不是一个文件:" + file.isFile());
//        System.out.println("是不是一个文件夹" + file.isDirectory());
//        System.out.println("文件名是：" + file.getName());
//        System.out.println("绝对路径" + file.getAbsolutePath());
//        System.out.println("路径是：" + file.getPath()  + "\t" + file.getParent());
//        System.out.println(new Date(file.lastModified()).toLocaleString() + file.getTotalSpace());

//        if(!file.exists()){
//                if (file.mkdir()){
//                    System.out.println("文件夹创建成功");
//                }
//
//        }


