package decorator;

public class ComponentImpA extends Decorator{
    public ComponentImpA(Component component){
        super(component);
    }

    @Override
    public void read() {
        this.extendsReadA();
        super.read();
        this.extendsReadB();
    }

    private void extendsReadA(){
        System.out.println("自定义的扩展方法A：");
    }

    private void extendsReadB(){
        System.out.println("自定义的扩展方法B：");

    }}
