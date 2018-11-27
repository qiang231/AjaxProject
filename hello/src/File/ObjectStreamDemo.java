package File;

import java.io.*;

/**
 * 对象的序列化和反序列化
 */
public class ObjectStreamDemo {
    private static String FilePath = "D:/Wss.dat";
    public static void main(String[] args) {
        Player player = new Player("wss",99);

        //使用对象流将序列化的对象写入到文件中
        try (
            FileOutputStream fileOutputStream = new FileOutputStream(FilePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(player);
            System.out.println("对象写入成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //从文件中读取对象内容
        try(
                FileInputStream finput = new FileInputStream(FilePath);
                ObjectInputStream oinput = new ObjectInputStream(finput);
                 ){
            Player player1 = (Player)oinput.readObject();
            System.out.println("读取出的对象内容" + player1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Player implements Serializable {
        private String nickName;
        private int level;

        public Player() {
        }

        public Player(String nickName, int level) {
            this.nickName = nickName;
            this.level = level;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "nickName='" + nickName + '\'' +
                    ", level=" + level +
                    '}';
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
