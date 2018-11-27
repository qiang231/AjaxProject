package RpgGame;

public class Warrior extends Hero{



    public Warrior(){
        super();
        setName("默认英雄");
    }

    public Warrior(long id, String name, int x, int y){
        super(id,name);
        setX(x);
        setY(y);
    }

    @Override
    public boolean canFightByDistance(Hero hero) {
        double distance = getDistance(getX(),getY(),hero.getX(),hero.getY());
        //假设战士的攻击距离是100
        return distance <= 100;
    }

    @Override
    public void fight(Hero hero) {
        //1.生成随机的攻击力
        //2.剪掉传入英雄的hp
        int attack = ((int)(Math.random() * 1000)) % 51 + 20;
        setAttack(attack);

        hero.setHp(hero.getHp() - attack);

    }
}
