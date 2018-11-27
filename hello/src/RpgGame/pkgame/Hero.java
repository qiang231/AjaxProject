package RpgGame.pkgame;

/**
 * 实现了可攻击接口的英雄类
 */
public abstract class Hero implements Assailaable {
    private long id;
    private String name;
    private int level;
    private int maxHp;
    private int hp;
    private int attack;
    private int x;
    private int y;


    public Hero(){
        setMaxHp(100);
        setHp(100);
    }

    public Hero(long id, String name ){
        this();
        setId(id);
        setName(name);
    }

    /**
     * 英雄之间的pk，首先判断两者之间的距离
     * @param assailaable
     */
    public void pk(Assailaable assailaable){
        if(canFightNyDistance(assailaable) && hp > 0 && assailaable.getHp() > 0){
            fight(assailaable);
        }else {
            System.out.println("攻击距离或者其他原因，攻击失败！");

        }
        System.out.println("两位英雄的当前状态：");
        System.out.println("昵称\tHp\tX坐标\ty坐标");
        System.out.println(name + "\t" + hp + "\t" + x + "\t\t" + y);
        System.out.printf("%S\t%d\t%d\t%d",
                assailaable.getName(),assailaable.getHp(),assailaable.getX(),assailaable.getY());


    }
    protected double getDistance(int x1,int x2, int y1, int y2){
        return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1) ,2));
    }


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
        this.level = level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
