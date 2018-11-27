package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        //创建要被装饰的原始对象
        Component component =new  TrueComponent();
        //为原始对象透明的增加功能
        ComponentImpA componentImpA = new ComponentImpA(component);
        componentImpA.read();
    }
}
