public class Role {
    /**
     * 角色名称
     */
    public String name;
    /**
     * 等级
     */
    public int level;
    /**
     * 职业
     */
    public String job;
    /**
     * 技能
     */
    /**
     * 构造方法/构造器
     */
    public Role(String name1, int level1, String job1){

        name = name1;
        level = level1;
        job = job1;

    }

    public void show(){
        System.out.println(name + "\t" + level + job);
    }

    public void doSkill(){
        if (name.equals("劳拉")){

            System.out.println("双枪老太婆");
        }else if(name.equals("孙悟空")){
            System.out.println("吃俺老孙一棒");
        }else {
            System.out.println(name +  "打出了致命一击");
        }
    }}
