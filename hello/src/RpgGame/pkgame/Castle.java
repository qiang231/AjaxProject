package RpgGame.pkgame;

/**
 * 城堡类
 */
public class Castle implements Assailaable {

    private String name;
    private int x;
    private int y;
    private int maxHp;
    private int hp;
    private int attackDistance;


    public Castle(String name, int x, int y, int attackDistance) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.attackDistance = attackDistance;
        setMaxHp(100);
        setHp(100);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttackDistance() {
        return attackDistance;
    }

    public void setAttackDistance(int attackDistance) {
        this.attackDistance = attackDistance;
    }



    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setY(int y) {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public boolean canFightNyDistance(Assailaable assailaable) {
        return false;
    }

    @Override
    public void fight(Assailaable assailaable) {
        int attack = 15;
        assailaable.setHp(assailaable.getHp() - attack);

    }
}
