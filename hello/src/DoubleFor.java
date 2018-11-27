import javafx.css.Size;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args){

//        int size;
//        Scanner in = new Scanner(System.in);
//        size = in.nextInt();
//
//
//        while (true){
//            if (size % 2 == 0) //  偶数的时候对称输出
//            {
//                System.out.println("请输入奇数");
//                size = in.nextInt();
//            }else
//                break;
//        }

        char ch = 'A' ;

        for (int i = 0; i < 4 ; i ++){
            for (int j = 0; j <= 2 - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i ; j ++ ){
                if (j == 0 || j == 2* i)
                    System.out.print("*");
                else
                    System.out.print(" ");
//                System.out.print("*");



            }
            System.out.println();
            }


        for (int i = 0; i < 3 ; i ++){

            for (int j = 0; j <= i; j ++){
                System.out.print(" ");
            }
            for (int j = 0; j <= 4 - 2 * i ; j ++ ){
//                System.out.print("*");

                if (j == 0 || j == 4 - 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        }
    }

