import java.util.Scanner;

/**
 * 猜数字游戏
 */

public class GuessNumTest {
    public static void main(String[] args){
        final int price = (int)(Math.random() * 1000) % 9 +1;//随机产生0- 8 的数字
        System.out.println(price);

        int guessprince = 0;
        int count = 0;
        String priceName = null;
        for (int i = 0; i < 5; i ++){
            System.out.print("请输入您要猜的数字(" + ++count + "次):");
            Scanner in = new Scanner(System.in);
            guessprince = in.nextInt();
            if (guessprince == price) {
                //判断count的次数，根据次数来判断奖品
                if (count == 1) {
                    System.out.println("太厉害了，恭喜你获得一等奖！");
                    priceName = "iphoneX max";
                } else if (count == 2 || count == 3) {
                    System.out.println("恭喜您获得二等奖");
                    priceName = "华为荣耀智能手环";
                } else if (count == 5 || count == 4) {
                    System.out.println("恭喜您获得三等奖");
                    priceName = "小米";
                }
                break;
            }else if (guessprince > price){
                System.out.println("大了，请继续");
            }else if (guessprince < price){
                System.out.println("小了，请继续");
            }
        }
        if (priceName == null){
            System.out.println("不好意思，5次机会已经用完，欢迎下次参与！");
        }else {
            System.out.println(priceName);
        }
    }
}
