public class Dancer extends Actor {

    public Dancer() {

    }

    public Dancer(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println("舞蹈家" + getName() + "正在展现她那婀娜多姿的舞蹈");
    }
}
