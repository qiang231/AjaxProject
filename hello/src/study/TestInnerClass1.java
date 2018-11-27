package study;

public class TestInnerClass1 {
    public static void main(String[] args) {

    }
}

class OuterClass {

    public void method1() {
        class InnerClass {

        }

    }

    public Comparable getComparable() {
        class MyComparable implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }

    //实现接口的匿名内部类对象
    public Comparable getComparable1() {
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}















