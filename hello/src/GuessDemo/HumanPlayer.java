package GuessDemo;

public class HumanPlayer {
    /**
     * 静态常量：出拳类型的信息
     */
    public static final int messageTypeFist = 1;

    /**
     * 静态常量：赢拳类型的信息
     */
    public static final int messageTypeWin = 2;

    /**
     * 静态常量：输拳类型的信息
     */
    public static final int messageTypeLose = 3;

    //属性:名称、分数、所出的拳、音效、台词
    private String name;
    private int score;
    private int fist;

    /**
     * 出拳后的台词
     */
    private String[] fistWords = {
            "且随疾风前行,身后亦须留心",
            "~~~~~~哈撒卡~~~~~",
            "长路漫漫,惟剑做伴",
            "蠢货是无药可救的",
            "死亡如风,常伴吾身"
    };

    private String[] winWords = {
            "还有谁？谁能赐我一死？",
            "吃着火锅唱着歌，然后你就输了",
            "~~~~~超~~~~神~~~~",
            "全军出击~~~~~~~~~~~~~~~",
            "猜拳，还有点意思！！！！"
    };

    private String[] loseWords ={
            "通往成功路总在施工中~~",
            "等到潮水褪去，就知道谁在裸泳了",
            "夏天就是不好，穷的时候连西北风都没得喝~",
            "将来我死了，把QQ捐给希望工程！！",
            "众人皆作我独醒，举世皆浊我独清"
    };

    /**
     * 根据传入的消息类型，随机打印对应类型的消息
     * @param msgType  对应HumanPlayer类中定义的静态常量
     */

    public void sendMessage(int msgType){

        int index = ((int)(Math.random() * 1000)) % 5;
        String message = null;
        switch (msgType){
            case messageTypeFist:
                message = fistWords[index];
                break;
            case messageTypeWin:
                message = winWords[index];
                break;
            case messageTypeLose:
                message = loseWords[index];
                break;
        }
        System.out.println(message);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFist() {
        return fist;
    }

    public void setFist(int fist) {
        this.fist = fist;
    }

//方法：设置和得到名称、分数、播放音效、说台词、出拳

}
