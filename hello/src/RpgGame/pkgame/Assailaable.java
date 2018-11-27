package RpgGame.pkgame;

public interface Assailaable {
    String getName();

    int getX();
    void setX(int x);

    int getY();
    void setY(int y);

    int getHp();
    void setHp(int hp);

    /**
     * 根据距离判断一个对象是不是能够攻击另外一个单位
     * @param assailaable
     * @return
     */
    boolean canFightNyDistance(Assailaable assailaable);

    /**
     * 攻击另外一个对象
     * @param assailaable
     */
    void fight(Assailaable assailaable);

}
