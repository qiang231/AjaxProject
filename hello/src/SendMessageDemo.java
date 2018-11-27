import java.util.concurrent.TimeUnit;

public class SendMessageDemo {
    public static void main(String[] args) {
        SendMessage("凤求凰","世界","组团打副本了",2,1);
        SendMessage("王三狗");
        SendMessage("富察皇后","皇宫");
      //  System.out.println(hexToDec(110));
    }

    /**
     *
     * * @param nickName  //提供昵称
     */
    public static void SendMessage(String nickName){
        String[] contents = {
                "nihao","sdqwdqw","wqeqwdsadsa"
        };
        SendMessage(nickName,"默认频道",contents[(int) (Math.random() * 2)],1,1);
    }

    /**
     *
     * @param nickName  // 昵称
     * @param channel   // 频道
     */
    public static void SendMessage(String nickName, String channel){
        String[] contents = {"nihao","sdqwdqw","wqeqwdsadsa"};
        SendMessage(nickName,channel,contents[(int)(Math.random() * 2)],1,1);

    }
    /**
     *
     * @param name            //玩家姓名
     * @param channelName     //频道
     * @param message         //喊话内容
     * @param count           //次数
     * @param interval        //间隙
     */
    public static void SendMessage(String name, String channelName, String message, int count, int interval){

        if (interval < 5) {
            interval = 5;
        }
        String value = String.format("【%s】%s:%s", channelName,name,message);

        for (int i = 0; i < count ; i++) {
            System.out.println(value);
            try {
//                Thread.sleep( interval * 1000);
                TimeUnit.SECONDS.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     *
     * @param decNum //十进制数字
     * @return       //返回十六进制字符串
     */
    public static String hexToDec(int decNum) {
        String hex = "";
        while (decNum != 0){
            int temp = decNum % 16;

            if (temp >= 0 && temp<= 9){
                hex = temp + hex;
            }else if (temp >= 10 && temp <=15 ){
                hex =   (char)(temp + 'A' - 10) + hex;
            }

            decNum /= 16;
        }


        return hex;
    }
}
