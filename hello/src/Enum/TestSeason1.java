package Enum;

public class TestSeason1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        spring.show();
        Season1 summer= Season1.SUMMER;
        System.out.println(summer);
        summer.show();
        Season1 s3 = Season1.AUTUMN;
        System.out.println(s3);
        s3.show();
        Season1 s4 = Season1.WINTER;
        System.out.println(s4);
        s4.show();

        System.out.println(spring.getSeasonName()+spring.getSeasonDesc() );
        //1.values
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }
        //2.valueOf
//        String str = "SPRING";
//        Season1 season1 = Season1.valueOf(str);
        System.out.println(Season1.valueOf("SPRING"));
        Thread.State[] thread  = Thread.State.values();
        for (int i = 0; i < thread.length; i++) {
            System.out.println(thread[i]);
        }

    }
}
interface info{

    void show();

}


//枚举类
enum  Season1 implements info{
    SPRING("spring","春暖花开"){
        public void show(){
            System.out.println("春天在哪里");
        }
    },
    SUMMER("summer","夏日炎炎"){
        public void show(){
            System.out.println("生如夏花");
        }
    },
    AUTUMN("autumn","秋高气爽"){
        public void show(){
            System.out.println("秋天不回来");
        }
    },
    WINTER("winter","冬寒抱冰"){
        public void show(){
            System.out.println("冬天的秘密");
        }
    };

    private String seasonName;
    private  String seasonDesc;

    //2.声明为final的属性，在构造器中初始化
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    Season1() {
    }

    //3.通过公共的方法来调用属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.创建枚举类的对象



    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

//    public void show(){
//        System.out.println("这是一个季节！");
//    }


}
