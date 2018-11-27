package study;

public class Main{
    public static void main(String[] args) {

        MainTest.main(new String[1000]);
    }

}
class MainTest{
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            args[i] = "value_" + i;
            System.out.println(args[i]);
        }
    }
}
