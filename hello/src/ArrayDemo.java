import java.util.Scanner;

public class ArrayDemo {
    public static void  main(String[] args){


        Scanner in = new Scanner(System.in);
        double[] score = new double[5];
        double sum = 0, avg;
        for (int i =0; i < score.length; i++ ){
            System.out.printf("请输入第" + (i + 1) + "位同学的成绩:");
            score[i] = in.nextDouble();
        }
        for(int i = 0; i<score.length;i++){
            System.out.println(score[i]);
            sum += score[i];

        }
        sum /= 5;
        System.out.println(sum);
    }
}
