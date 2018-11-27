public class CircleV3 {
    /**
     *  圆的半径
     */
    private double radius;
    /**
     * 圆的周长
     */
    private double perimeter;
    /**
     * 圆的面积
     */
    private double area;

    public CircleV3() {
    }


    public CircleV3(double radius) {
//        this.radius = radius;
        this.setRadius(radius);
    }

    public void show(){
        System.out.println("周长为： " + getPerimeter());
        System.out.println("面积为： " + getArea());
    }



    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        //this --> 朕/寡人
        if(radius <= 0){
            radius = 1;

        }else {
            this.radius = radius;
        }
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getArea() {
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
//    public void setPerimeter(double perimeter) {
//        this.perimeter = perimeter;
//    }
}
