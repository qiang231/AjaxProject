public class Hero1 {
    private String niceName;
    private int level;
    private int maxLife;
    private int currLife;

    public Hero1() {
        System.out.println("父类构造！");
    }

    public Hero1(String niceName, int level, int maxLife, int currLife) {
        this.niceName = niceName;
        this.level = level;
        this.maxLife = maxLife;
        this.currLife = currLife;
    }

    public void move(){
        System.out.println("hero类的move方法");
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurrLife() {
        return currLife;
    }

    public void setCurrLife(int currLife) {
        this.currLife = currLife;
    }
}
