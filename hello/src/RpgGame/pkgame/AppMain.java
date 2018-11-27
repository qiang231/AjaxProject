package RpgGame.pkgame;

public class AppMain {
    public static void main(String[] args) {
        Hero hero = new Warrior(1,"曹操",0,0);
        Castle castle = new Castle("威廉古堡",10,10,750);
        hero.pk(castle);
    }
}
