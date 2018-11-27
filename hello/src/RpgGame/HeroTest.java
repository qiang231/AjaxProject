package RpgGame;

public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Warrior(1,"盖伦",0,0);
        Hero hero1 = new Warrior(2,"貂蝉",200,200);

        hero1.Pk(hero);
        System.out.println();
        hero.Pk(hero1);
    }
}
