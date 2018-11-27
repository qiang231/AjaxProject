public class Singer extends Actor {

    public Singer() {
    }

    public Singer(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println("歌唱演员" + getName() + "正在表演节目：在这桃花盛开的地方");
    }
}
