public class SingleModeDemo {
    // 用来保存唯一的本类实例
    private static SingleModeDemo me = null;
    public int count = 0;
    //构造方法也是私有的
    private SingleModeDemo(){
        count++;
    }

    public static SingleModeDemo getInstance(){
        if (null == me)
            me = new SingleModeDemo();
        return me;
    }

//    public static void main(String[] args) {
//
//        SingleModeDemo singleModeDemo1 = new SingleModeDemo();
//        System.out.println(singleModeDemo1.count);
//
//        SingleModeDemo singleModeDemo2 = new SingleModeDemo();
//        System.out.println(singleModeDemo2.count);
//
//        SingleModeDemo singleModeDemo3 = new SingleModeDemo();
//        System.out.println(singleModeDemo3.count);
//
//        SingleModeDemo singleModeDemo4 = new SingleModeDemo();
//        System.out.println(singleModeDemo4.count);
//    }
}
