import java.util.Scanner;

public class CircleV1Test {
    /**
     * 圆的半径
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

//    /**
//     * 方法一：输入圆的半径
//     */
//    public  void inputRadius(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("请输入圆的半径：");
//        radius = in.nextDouble();
//        in.close();
//    }
//    /**
//     * 方法二：显示周长
//     */
//
//    public void showPerimeter(){
//        if (radius <= 0){
//            inputRadius();
//        }
//        perimeter = 2 * Math.PI *radius;
//        System.out.println("圆的周长为：" + perimeter);
//    }


    /**
     * 不带参数的构造函数
     */

    public CircleV1Test() {

       input();
    }

    /**
     * 带一个参数的构造函数
     */

    public CircleV1Test(double radius){
        if (radius <= 0){
            System.err.println("输入错误！");
        }else {
            this.radius = getRadius();
        }
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        radius = in.nextDouble();
        in.close();
    }

    public void show(){
        System.out.println("圆的周长为：" + perimeter);
        System.out.println("圆的面积为：" + area);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            radius = 1;
        }else {
            this.radius = radius;
        }

    }

    public double getPerimeter() {
        perimeter = Math.PI * 2 *radius;
        return perimeter;
    }

    public double getArea() {
        area = Math.PI * Math.pow(radius,2);
        return area;
    }


    //    /**
//     * 方法三：显示面积
//     */
//    public void showArea(){
//        if (radius <= 0){
//            inputRadius();
//        }
//        area = Math.PI * Math.pow(radius,2);
//        System.out.println("圆的面积为：" + area);
//    }
}
