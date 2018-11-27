import java.io.IOException;
import java.util.Properties;

public class Chunwan {
    public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException {
        Director 张艺谋 = new Director();

        Singer 宋祖英 = new Singer("宋祖英");
        Dancer 杨丽萍 = new Dancer("杨丽萍");
//        Actor actor = new Actor("赵本山");

        张艺谋.action(宋祖英);
        张艺谋.action(杨丽萍);
//        张艺谋.action(actor);


        //升级1.模拟程序的升级，要求添加相声演员，要求核心业务层代码不变
//        CrossActor 冯巩 = new CrossActor("冯巩");
//        张艺谋.action(冯巩);

        //升级2.要求实现main方法中的代码也不修改的情况下实现某个角色的修改
        //解决方案：使用反射+多态技术实现无缝升级
        Properties properties = new Properties();

        properties.load(Chunwan.class.getResourceAsStream("ActorConfig.properties"));

        //通过反射实例化配置文件中配置的类
        Actor actor = (Actor)Class.forName(properties.getProperty("crossactor")).newInstance();



        actor.setName("郭德纲");
        张艺谋.action(actor);
    }
}
