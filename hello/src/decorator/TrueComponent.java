package decorator;

public class TrueComponent extends Component {


    @Override
    public void read() {
        System.out.println("TrueComponent 实现的read方法：");
    }
}
