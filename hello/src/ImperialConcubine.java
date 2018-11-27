import javax.swing.*;
import java.util.Scanner;

public class ImperialConcubine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] nnNameArray = {"周迅", "韩雪", "貂蝉", "西施", "昭君", "", "", "", "", ""};   //初始妃嫔
        String[] newNameArray = {"褒姒", "甄嬛", "钟艳", "圆圆", "富察"};                      // 待选妃嫔

        String[] levelNames = {"贵人", "嫔妃", "贵妃", "皇贵妃", "皇后"};                      // 级别

        int newNameCount = newNameArray.length;                                              //待选妃嫔的数量
        int[] level = new int[10];          //  嫔妃级别下标数组
        int[] loves = new int[10];          //  好感度

        int nnCount = 5;                    //娘娘的初始数量
        int gameDays = 1;                   //游戏默认运行10天

        for (int i = 0; i < nnCount; i++) {
            loves[i] = 100;
        }

        //主界面
        JOptionPane.showMessageDialog(null, "", "欢迎来到选妃游戏", 0, new ImageIcon("1.jpg"));
        while (gameDays <= 10) {
//            System.out.println("游戏进行到第" + gameDays + "天：");
//            System.out.println("1.皇帝下旨选妃\t\t(增加)");
//            System.out.println("2.翻牌宠幸    \t\t(修改状态)");
//            System.out.println("3.打入冷宫    \t\t(删除)");
//            System.out.println("4.朕的爱妃呢？\t\t(查找，修改状态)");
//            System.out.print("陛下请选择：");
//            int choice = in.nextInt();
            String strMenu = "1.皇帝下旨选妃\n";
            strMenu += "2.翻牌宠幸\n";
            strMenu += "3.打入冷宫\n";
            strMenu += "4.朕的爱妃呢？\n";
            strMenu += "请选择：";
            Object obj = JOptionPane.showInputDialog(null, strMenu,
                    "游戏进行到第" + gameDays + "天：",
                    0, new ImageIcon("1.jpg"),
                    new String[]{"1", "2", "3", "4"},
                    4);

//            int choice = Integer.parseInt(obj.toString());
            switch (obj.toString()) {
                case "1":
                    if (nnCount == nnNameArray.length) {
                        System.out.println("皇帝陛下，后宫已经人满为患，添加失败");
                        break;
                    }

//                    System.out.print("请输入新进娘娘的名讳：");
//                    String newName = in.next();
                    obj = JOptionPane.showInputDialog(null,
                            "请选择秀女", "选妃",
                            0, new ImageIcon("1.jpg"), newNameArray, null);

                    if (obj == null) {
                        continue;
                    }
                    JOptionPane.showMessageDialog(null,
                            "选妃",
                            "选中的妃嫔", 0, new ImageIcon("1.jpg"));
                    nnNameArray[nnCount] = obj.toString();
                    loves[nnCount] = 100;
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] -= 10;
                    }

                    nnCount++;
                    break;
                case "2":

                    obj = JOptionPane.showInputDialog(null,"陛下请选择：",
                            "翻牌", 0,
                            new ImageIcon("1.jpg"), nnNameArray,
                            null);
                    if (obj == null) {
                        continue;
                    }

                    String name = obj.toString();
//                    System.out.print("请输入娘娘的名讳：");
//                    String name = in.next();
                    int searchIndex = Integer.MIN_VALUE;
                    for (int i = 0; i < nnCount; i++) {
                        if (name.compareTo(nnNameArray[i]) == 0) {
                            searchIndex = i;
                            break;
                        }

                    }
                    if (searchIndex == Integer.MIN_VALUE) {
                        System.out.println("陛下不要活在梦中");
                        break;
                    }
                    //找到的话 好感度加20 并升级，其他人-10
                    loves[searchIndex] += 20;
                    if (level[searchIndex] == levelNames.length - 1) {
                        System.out.println(nnNameArray[searchIndex] + "已经母仪天下，升级失败！");
                        loves[searchIndex] += 10;
                        //break;
                    }else {


                        level[searchIndex]++;
                        for (int i = 0; i < nnCount; i++) {
                            if (i == searchIndex) {
                                continue;
                            }
                            loves[i] -= 10;
                        }
                        JOptionPane.showMessageDialog(null, "宠幸" + nnNameArray[searchIndex] + "，好感度加10\n升级为" + levelNames[level[searchIndex]] + ",其他娘娘-10!",
                                "翻牌的结果", 0, new ImageIcon("images/" + nnNameArray[searchIndex] + ".jpg"));


                    }
//                    System.out.println("宠幸" + nnNameArray[searchIndex] + "，好感度加10，升级为" + level[searchIndex] + "其他娘娘-10");

                    break;
                case "3":
                    break;
                case "4":
                    break;

                default:
                    System.out.println("必须输入1-4之间的数据");
                    continue;

            }
            int count = 0;
            for (int i = 0; i < nnCount; i++) {
                if (loves[i] < 60){
                    count++;
                }
            }
            if (count >= 3){
                JOptionPane.showMessageDialog( null,"后宫有3个以上的娘娘好感度低于60，发生暴乱",
                        "皇上被害",0 ,new ImageIcon("images/gg.jpg"));
            }

            String value ="后宫的情况如下：\n";

            for (int i = 0; i < nnCount; i++) {
//            System.out.println(nnNameArray[i] + "\t\t" + levelNames[level[i]] + "\t\t" + loves[i]);
                value += String.format("%s    %s    %d\n",nnNameArray[i],levelNames[level[i]], loves[i]);

            }
            JOptionPane.showMessageDialog(null,value,"每日结算", 0 , new ImageIcon("images/杨广.jpg"));
        }
//            System.out.println("姓名\t\t级别\t\t好感度");
//            for (int i = 0; i < nnCount; i++) {
//                System.out.println(nnNameArray[i] + "\t\t" + levelNames[level[i]] + "\t\t" + loves[i]);
//            }
            gameDays++;
        }

//        System.out.println("姓名\t级别\t好感度");
//        for (int i = 0; i < nnCount; i++) {
//            System.out.println(nnNameArray[i] + "\t\t" + levelNames[level[i]] + "\t\t" + loves[i]);
//        }
    }
