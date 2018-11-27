import java.util.Scanner;

public class MoneyTotal {
    public static void main(String[] args){

        double money = Double.MAX_VALUE;
        int count = 0;
        for (int i = 0; i <5; ){
            System.out.println("请输入消费额（第" + ++i + "次）：" );
            Scanner in = new Scanner(System.in);
            money = in.nextDouble();

//            if (money > 500)
//                count ++;
            if (money > 500)
                continue;
            count++;
        }
        System.out.println("消费金额中大于500的次数是：" + count);
    }
}
