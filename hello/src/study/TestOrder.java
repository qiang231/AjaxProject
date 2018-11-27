package study;


public class TestOrder {
    public static void main(String[] args) throws InterruptedException {
        Order o1 = new Order(1001,"aa");
        Order o2 = new Order(1001,"aa");
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1);
        System.out.println(o1.toString());
        System.out.println(o1.getClass().getSuperclass());
    }
}

class Order{
    private  int orderId;
    private String orderName;


    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrdreName(String ordreName) {
        this.orderName = ordreName;
    }

    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }else if (obj instanceof Order){
            Order o1 = (Order)obj;
            return this.orderId == o1.orderId && this.orderName.equals(o1.orderName);
        }else {
            return false;
        }
    }


}