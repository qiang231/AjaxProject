package RpgGame;

/**
 * 英雄类，父类
 */
public abstract class Hero {
    private long id;
    private String name;
    private int level;
    private int maxHp;
    private int hp;
    private int attack;
    private int x;
    private int y;


    public Hero() {
        setHp(100);
        setMaxHp(100);
    }

    public Hero(long id, String name) {
        this();
        setId(id);
        setName(name);
    }

    /**
     * 使用模板实现的对战方法
     * 规定了默认情况下对战的流程
     * @param hero
     */
    public void Pk(Hero hero){

        //1.计算距离
        if(canFightByDistance(hero) && hero.getHp() > 0){

        //2.可以攻击的话调用攻击方法

            fight(hero);
        }
        else {
            System.out.println("由于攻击距离或其他原因，攻击失败！");
        }
        //3.在控制台打印对战后的结果
        System.out.println("两位英雄的当前状态：");
        System.out.println("昵称\tHp\tX坐标\ty坐标");
        System.out.println(name + "\t" + hp + "\t" + x + "\t\t" + y);
        System.out.printf("%S\t%d\t%d\t%d",
                hero.getName(),hero.getHp(),hero.getX(),hero.getY());
    }


    /**
     * 计算两个点之间的距离，子类可以调用
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @return
     */
    protected double getDistance(int x1,int x2, int y1, int y2){
        return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1) ,2));
    }




    /**
     * 判断能否攻击对方的英雄
     * @param hero
     * @return
     */
    public abstract boolean canFightByDistance(Hero hero);

    /**
     * 攻击传入的英雄对象，默认根据速记生成的攻击力减Hp值
     * @param hero
     */
     public abstract void fight(Hero hero);





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0 || level > 100) {
            this.level = 1;
        }else {
            this.level = level;
        }
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
