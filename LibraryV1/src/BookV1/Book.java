package BookV1;

public class Book {
    private String bookId;
    private String bookName;
    private String ISBN;
    private int count;          //库存量
    private String type;        //图书的类型
    private String author;
    private String publisher;
    private double price;


    public Book(){

    }

    /**
     * 重写了图书对象的equals方法，方便后续进行的对象恒等性比较
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        //如果传入的参数为空或不是Book类的实例，直接返回false
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        return bookId.equals(book.getBookId());
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
