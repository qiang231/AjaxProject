package RpgGame.pkgame;


public class Warrior extends Hero{


    @Override
    public int getX() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public boolean canFightNyDistance(Assailaable hero) {
        double distance = getDistance(getX(),getY(),hero.getX(),hero.getY());
        //假设战士的攻击距离是100
        return distance <= 100;
    }

    @Override
    public void fight(Assailaable hero) {
        //1.生成随机的攻击力
        //2.剪掉传入英雄的hp
        int attack = ((int)(Math.random() * 1000)) % 51 + 20;
        setAttack(attack);

        hero.setHp(hero.getHp() - attack);

    }

    public Warrior(){
        super();
        setName("默认英雄");
    }

    public Warrior(long id, String name, int x, int y){
        super(id,name);
        setX(x);
        setY(y);
    }


}
