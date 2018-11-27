package BookV2.BookV1;

public class Main {
    public static void main(String[] args) {
//        new BookView();
//        AbstractBookView bookView = new BookViewDialogImpl();//使用对话框实现的图书管理系统界面
//        bookView.doMainView();

//        FileUtil.SaveBooks(Data.bookStore);
        System.out.println(FileUtil.LoadBooks().length);
        Book[] books = FileUtil.LoadBooks();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            System.out.println(books[i].getBookId() +"\t" + books[i].getBookName());
        }
    }

}
