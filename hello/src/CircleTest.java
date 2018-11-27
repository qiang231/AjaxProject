import org.junit.Test;

import java.util.Scanner;

public class CircleTest {

//        Circle circle = new Circle();
//        circle.inputRadius();
//        circle.showPerimeter();
//        circle.showArea();

//        CircleV2 circleV2 = new CircleV2();
//        circleV2.showArea();

    @Test
     public void  test(){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        double radius = in.nextDouble();
        CircleV3 circleV3 = new CircleV3(radius);
        circleV3.show();
    }



}
