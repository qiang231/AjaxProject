package study;

import java.util.Scanner;

/**
 * 输入不匹配
 */

public class InputMissPointDemo {
    public static void main(String[] args) {

        System.out.println("请输入年龄（必须是整形数字）：");

        Scanner in = new Scanner(System.in);
        int age = -1;
        try {
            age = in.nextInt();
        }catch (Exception e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }

        System.out.println("输入的年龄是：" + age);


    }
}
