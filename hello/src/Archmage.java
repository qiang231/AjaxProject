/**
 * 法师类
 */

public class Archmage extends Hero1 {



    private int magicSttack;


    public Archmage(){
        setNiceName("默认法师");
        setLevel(1211);
        setMaxLife(100);
        setCurrLife(100);
        setMagicSttack(99);
    }

    public Archmage(String nickName){
        this(); //调用自己的构造方法
        setNiceName(nickName);
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append(getLevel());
        string.append("\t");
        string.append(getNiceName());
        string.append("\t");
        string.append("\t");
        string.append(getMaxLife());
        return string.toString();
    }

    public int getMagicSttack() {
        return magicSttack;
    }

    public void setMagicSttack(int magicSttack) {
        this.magicSttack = magicSttack;
    }

    public void biubiubiu(){
        System.out.println("大法师" + getNiceName() + "正在戳火球：");
    }
}
