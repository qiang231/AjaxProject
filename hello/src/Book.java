public class Book {
    private String name;
    private String isbn;
    private double price;
    private int count;          //库存量
    private boolean borrow;

    public Book(){}



    public Book(String name ){
        this.setName(name);
    }

    public Book(String name, String isbn, double price, int count) {
//        this.name = name;
//        this.isbn = isbn;
//        this.price = price;
//        this.count = count;
        setName(name);
        setIsbn(isbn);
        setCount(count);
        setPrice(price);
        setBorrow(borrow);
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            price = 0;
        }else {
            this.price = price;
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count < 0) {
            count = 0;
        }else {
        this.count = count;
        }
    }
}
