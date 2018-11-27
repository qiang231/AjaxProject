import java.util.Scanner;

public class CircleV2 {
    /**
     *  圆的半径
     */
    public double radius;
    /**
     * 圆的周长
     */
    public double perimeter;
    /**
     * 圆的面积
     */
    public double area;

    public CircleV2(){
        inputRadius();
    }

    public CircleV2(double radius1){
        if (radius1 > 0){
            radius = radius1;
        }else {
            inputRadius();
        }
    }

    private void inputRadius(){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        radius = in.nextDouble();
        in.close();
    }

    public void showPerimeter(){
        if(radius <= 0) {
            inputRadius();
        }
        perimeter = 2 * Math.PI * radius;
        System.out.println("周长为：" + perimeter);
    }

    public void showArea(){
        if (radius <= 0){
            inputRadius();
        }
        area = Math.PI * Math.pow(radius,2);
        System.out.println("面积为：" + area);
    }
}

