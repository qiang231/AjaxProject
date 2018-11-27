public class SingleMode {
    public static void main(String[] args) {
        SingleModeDemo singleModeDemo = SingleModeDemo.getInstance();
        System.out.println(singleModeDemo.count);
        singleModeDemo.count++;

        SingleModeDemo singleModeDemo1 = SingleModeDemo.getInstance();
        System.out.println(singleModeDemo1.count);

        System.out.println(singleModeDemo == singleModeDemo1);
    }
}
