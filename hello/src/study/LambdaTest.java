package study;

import java.util.Arrays;
import java.util.Date;
import java.util.Timer;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"aasd","sad","dsfs","dweq","dasd","eqwe","asdad","g"};
        System.out.println(Arrays.toString(planets));
        System.out.println("排序后的结果：" );
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("sorted by length");
        Arrays.sort(planets,(first,second) ->first.length() - second.length());
        System.out.println(Arrays.toString(planets));

//        Timer timer = new Timer(1000,event -> System.out.println("The time is " + new Date()));

    }
}
