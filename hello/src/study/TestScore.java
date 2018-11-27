package study;

import java.util.Scanner;
import java.util.Vector;

public class TestScore {
    public static void main(String[] args) {

        //1.创建Scanner对象，提示从键盘中输入学生的成绩，以负数结束
        Scanner in = new Scanner(System.in);
        System.out.print("请输入学生的成绩（输入负数时结束）：");

        //2.for（; ; ）从键盘一次获取学生的成绩，并填入Vector v = new Vector（）
        Vector vector = new Vector();
        int maxScore = 0;


        for ( ; ; ) {
            int score = in.nextInt();
            if (score < 0)
                break;
            //3.求出所有的正的成绩中的最高分
            if (maxScore < score)
                maxScore = score;
            Integer s1 = new Integer(score);
            //Vector集合
            vector.addElement(score);

        }



        //4.通过v.elementAt(i)依次获取填入v中的元素，同时判断下一个分数的等级并输出
        for (int i = 0; i < vector.size(); i++) {
            Integer score = (Integer)vector.elementAt(i);
            char level ;
            if (maxScore - score <= 10){
                level = 'A';
            }else if (maxScore -score <=20){
                level = 'B';

            }else if (maxScore - score <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("学生成绩为：" + score + "，等级为：" + level);

        }




    }
}
