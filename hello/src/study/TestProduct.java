package study;

public class TestProduct {
    public static void main(String[] args) {
        //方法一：创建一个实现Product接口的类的对象，并将此对象传入方法中
        TestProduct testProduct = new TestProduct();
        NoteBook noteBook = new NoteBook();
        testProduct.show(noteBook);


        //方法二：
        Product p = new Product() {
            @Override
            public void getName() {
                System.out.println("华为");
            }

            @Override
            public void getPrice() {
                System.out.println("￥231321");
            }
        };
        testProduct.show(p);


        //方法三：创建一个实现Product接口的匿名类的对象
        testProduct.show(new Product() {
            @Override
            public void getName() {
                System.out.println("iPhone");
            }

            @Override
            public void getPrice() {
                System.out.println("￥231123");
            }
        });
    }


    public void show(Product product){
        product.getName();
        product.getPrice();
    }
}

interface Product{
    void getName();

    void getPrice();
}

class NoteBook implements Product{

    @Override
    public void getName() {
        System.out.println("惠普笔记本");
    }

    @Override
    public void getPrice() {
        System.out.println("￥5000");
    }
}