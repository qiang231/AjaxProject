package decorator;

/**
 * 装饰器夫父类，为基本的组件实现功能的扩展
 */
public class Decorator extends Component{
    private Component component;


    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void read() {
        component.read();
    }
}
