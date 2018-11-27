import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args){
        final int price = ((int)(Math.random() * 1000)) % 9 +1;
        System.out.println(price);
        int guseeprice = 0;//用户猜的价格
        int count = 0;
        String prizename = null;
        for(int i = 0; i < 5; i++){
            System.out.println("请输入神秘商品的单价：(" + ++count +"次)");

            Scanner in = new Scanner(System.in);
            guseeprice = in.nextInt();
            if (guseeprice == price){    //猜测的正确情况下，讨论猜的次数
                if (count == 1){
                    System.out.println("牛逼了");
                    prizename = "iphone";
                }
                else if (count ==2 || count ==3){
//                    System.out.println("奖品是华为荣耀手环");
                    prizename = "华为荣耀手环";
                }else {
//                    System.out.println("小米耳机蓝牙音箱");
                    prizename = "小米";
                }
                break;
            }else if(guseeprice < price){
                System.out.println("小了，请继续！");
            }else if(guseeprice > price){
                System.out.println("大了，请继续");
            }

        }
        if (null == prizename){
            System.out.println("很遗憾，5次机会已经用完，期待您的下次参与!");
        }else {
            System.out.print("恭喜，您中奖了！奖品是");
            System.out.println(prizename);
        }
    }
}
