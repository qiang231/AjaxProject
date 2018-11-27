public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Java核心技术卷","121312312-123"
        , 206,5);
        System.out.println(book);
        BookBiz bookBiz = new BookBiz();
        bookBiz.sellBook(book);
        System.out.println(book.getCount());
    }
}
