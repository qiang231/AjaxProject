package GuessDemo;

public class ComputerPlayer {
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
            "视死如归，就在今天！",
            "我们的使命，就是力战而亡！",
            "德玛西亚，永世长存！",
            "为了父王！",
            "战斗之心，至死方休！"
    };

    private String[] winWords = {
            "兄弟姐妹们，和我并肩作战吧！",
            "消除不公！把你们队的其他人找来吧，我会在这等你的！",
            "洞察力是取胜的关键！一定不要让你的警觉松懈！",
            "阻断敌军！粉碎山峰！跨国最长的——噢，我的脚趾头",
            "喜欢我的武器？那就过来看看吧！"
    };

    private String[] loseWords ={
            "消除不公！把你们队的其他人找来吧，我会在这等你的！",
            "我喜欢挑战！",
            "保护忠良！",
            "德玛西亚，无可匹敌！",
            "正义的惩罚！"
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
        //电脑出拳就是生成1-3 的随机数
        fist = ((int)(Math.random() * 30000)) % 3 + 1;
        return fist;
    }

//    public void setFist(int fist) {
//        this.fist = fist;
//    }

    //方法：设置和得到名称、分数、播放音效、说台词、出拳

}
