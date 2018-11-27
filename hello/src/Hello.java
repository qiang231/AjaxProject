import java.util.ArrayList;
import java.util.List;
import java.util.*;//后面就不用手动导入包 直接他给你就导进去了好

public class Hello {
    public  static void main(String[] args){
        System.out.print("hello");
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("hello");
        System.out.println(list);
        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();
        System.out.print("sadsa");


    }
}

