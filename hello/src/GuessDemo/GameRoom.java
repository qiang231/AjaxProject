package GuessDemo;

import java.util.Scanner;

/**
 * 游戏房间
 */
public class GameRoom {
    //属性：记分牌、道具、参与游戏的玩家、房间号、房间名称、房间密码
    private  HumanPlayer player1 = null;
    private ComputerPlayer player2 = null;
    private int roomId;
    private String roomName;
    /**
     * 房间密码
     */
    private String roomPass;


    public GameRoom(String roomName, String roomPass){
        if ("admin".equals(roomName) && "123".equals(roomPass)){
            System.out.println("房间名称或密码错误，游戏退出");
        }
        initGame();
        startGame();
        endGame();
    }



    //方法：
    public void initGame(){
        //1.实例化游戏玩家对象
        player1 = new HumanPlayer();
        player2 = new ComputerPlayer();
        //2.初始化游戏的其他属性
        //如：游戏中的花花草草
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("游戏加载成功！");
    }

    public void startGame(){
        showMenu();
        choiceRole();
        //双方出拳

        Gameing();


    }

    /**
     * 游戏大循环
     */
    private void Gameing() {
        while (true) {
            System.out.println(player1.getName() + "请出拳：");
            Scanner in = new Scanner(System.in);
            //判断输入
            player1.setFist(in.nextInt());
            int fist1 = player1.getFist();

            player2.getFist();
            int fist2 = player2.getFist();

            //判断输赢

            int result = judge(fist1, fist2);
            //如果返回-1 玩家胜利；  返回0：打平   返回1 ：电脑胜利
            if (result == -1) {
                System.out.println("【吉永老师】：" + player1.getName() + "胜利");
                player1.sendMessage(HumanPlayer.messageTypeWin);
                player2.sendMessage(ComputerPlayer.messageTypeLose);
            } else if (result == 0) {
                System.out.println("【吉永老师】：" + player1.getName() + "和" + player2.getName() + "打平");
                player1.sendMessage(HumanPlayer.messageTypeFist);
                player2.sendMessage(ComputerPlayer.messageTypeFist);
            } else {
                System.out.println("【吉永老师】：" + player2.getName() + "胜利");
                player2.sendMessage(ComputerPlayer.messageTypeWin);
                player1.sendMessage(HumanPlayer.messageTypeLose);

            }
            System.out.println("是否继续游戏？(Y/N)");
            String answer = new Scanner(System.in).next();
            if ("y".equalsIgnoreCase(answer)){
                continue;
            }

        }
    }

    public void showMenu(){
        System.out.println("欢迎进入《" + roomName + "》游戏房间");
        System.out.println("出拳规则：1-剪刀；2-布；3-石头");


    }

    public void choiceRole(){
        System.out.println("对方角色：1-风间；2-妮妮；3-正南；4-阿呆：");
        System.out.print("请选择角色：");
        int choice = new Scanner(System.in).nextInt();
        String[] nameArray = {"风间","妮妮","正南","阿呆"};
        //省略对用户的输入进行验证
        player2.setName(nameArray[choice - 1]);
        player1.setName("野原新之助");
        System.out.println(player1.getName() + " VS." + player2.getName());



    }

    public int judge(int fist1, int fist2){
        if (fist1 == fist2) {
            return 0;
        }
        if (fist1 == 1 && fist2 == 3 ||
                fist1 ==2 && fist2 == 1 ||
                fist1 == 3 && fist2 == 2){
            //玩家1 的分数加1，玩家2 的分数减1
            player1.setScore(player1.getScore() + 1);
            player2.setScore(player2.getScore() - 1);
            return -1;
        }
        player1.setScore(player1.getScore() - 1);
        player2.setScore(player2.getScore() + 1);
        return 1;
    }


    public void endGame(){
        System.out.println("游戏已经结束，欢迎下次再来");
    }


    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPass() {
        return roomPass;
    }

    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass;
    }

}
