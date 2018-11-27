public class CrossActor extends Actor{
    public CrossActor() {
    }

    public CrossActor(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "：现在相声节目不景气了，我想死你们了");
    }
}
