package BookV1;

public class Main {
    public static void main(String[] args) {
//        new BookView();
        new BookView();

    }


    public static void show(){

        BookBiz bookBiz = new BookBiz();
        if (bookBiz.getBookCount() == 0) {
            System.out.println("仓库空空如也");
            return;
        }
        for (int i = 0; i < new BookBiz().getBookCount(); i++) {
            System.out.println(Data.bookStore[i].getBookId()+ "\t" + Data.bookStore[i].getBookName()
                    + "\t" + Data.bookStore[i].getCount());
        }


    }
}
