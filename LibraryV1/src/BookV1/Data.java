package BookV1;

public class Data {
    //图书的仓库
    public static Book[] bookStore = new Book[999];


    //使用静态块为图书仓库添加书籍信息，以便测试
    static {
        Book book =new Book();
        book.setBookId("1212");
        book.setBookName("java编程思想");
        book.setCount(10);
        book.setPrice(100);
        bookStore[0] = book;

        Book book1 =new Book();
        book1.setBookId("2311");
        book1.setBookName("java核心技术");
        book1.setCount(10);
        book1.setPrice(106);
        bookStore[1] = book1;

        Book book2 =new Book();
        book2.setBookId("1215");
        book2.setBookName("Java虚拟机");
        book2.setCount(10);
        book2.setPrice(50);
        bookStore[2] = book2;

        Book book3 =new Book();
        book3.setBookId("1232");
        book3.setBookName("Java多线程");
        book3.setCount(10);
        book3.setPrice(1);
        bookStore[3] = book3;

    }
}
