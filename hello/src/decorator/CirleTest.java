package decorator;

public class CirleTest {
    public static void main(String[] args) {
        ComparableCircle circle = new ComparableCircle(2.3);
        ComparableCircle circle1 = new ComparableCircle(2.2);
        ComparableCircle circle2 = new ComparableCircle(2.3);

        int i1 = circle.compareTo(circle1);
        int i2 = circle.compareTo(circle2);
        System.out.println(i1);
        System.out.println(i2);
        int i3 = circle.compareTo(new String());
    }
}


interface CompareObject{
    int compareTo(Object o);
}

class Circle{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }else if (o instanceof ComparableCircle){
            ComparableCircle circle = (ComparableCircle)o;
            if (this.getRadius() > circle.getRadius()){
                return 1;
            }else if (this.getRadius() < circle.getRadius()){
                return -1;
            }else {
                return 0;
            }

        }else {
//            return -2;
            throw new RuntimeException("传入的类型不匹配");
        }
    }
}