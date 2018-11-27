/**
 * 相当于项目中的核心业务类，主要功能是让演员就位开始表演
 */
public class Director {
    /**
     * 导演的Action方法
     * @param actor
     */
    public void action(Actor actor){
        actor.performs();
    }
}
