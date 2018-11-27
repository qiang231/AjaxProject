public class CrossActorV1 extends Actor {
    public CrossActorV1() {
    }

    public CrossActorV1(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "相声讲究脱鞋就唱。。。。");
    }
}
