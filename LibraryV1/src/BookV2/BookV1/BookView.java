package BookV2.BookV1;

import java.util.Scanner;

/**
 * 图书系统的视图
 */
public class BookView {
    private Scanner input = null;
    private BookBiz bookBiz = null;

    public BookView(){
        input = new Scanner(System.in);
        bookBiz = new BookBiz();

        System.out.println("*************************************");
        System.out.println("\t\t欢迎使用图书管理系统");
        System.out.println("\t1.登录系统\t\t2.退出系统");
        System.out.println("*************************************");
        System.out.print("请选择：");

        String choice = input.next();
        if ("1".equals(choice)){
            //执行登录操作
            System.out.println("登录功能暂未实现，默认已登录");
            showMainView();
        }

        System.out.println();
        System.out.println("已退出，欢迎再次使用！");
    }

    public void showMainView(){
        System.out.println("\n图书管理系统>>主菜单");
        System.out.println("1.新增图书\t2.删除图书\t3.查看所有图书\t4.按编号检索\t5.入库\t6.出库\t7.退出");
        System.out.print("请选择：");

        String choice = input.next();

        switch (choice){
            case "1":       //增加图书
            showAddNewBookView();
            showBooks(Data.bookStore);
                break;
            case "2":       //删除图书
            showDelBookView();
                break;
            case "3":       //查看所有图书
            showBooks(null);
                break;
            case "4":       //按编号查询
            showFindById();
                break;
            case "5":       //入库
            showInStore();
                break;
            case "6":       //出库
            showOutStore();
                break;
            case "7":       //退出系统
//                System.exit(0);
                return;
            default:
                break;
        }
        showMainView();
    }

    /**
     * 图书出库
     */
    public void showOutStore(){
        System.out.println("图书管理系统>>图书出库");
        System.out.print("请输入需要出库的图书编号：");
        String bookId = input.next();

        System.out.print("请输入需要出库的图书数量：");
        int bookCount = input.nextInt();

        if (bookBiz.outStore(bookId,bookCount)){
            System.out.println("图书出库成功！");
            showBooks(null);
        }
        System.out.println("请检查出库的图书编号和数量！");

    }




    /**
     * 图书入库
     */
    public void showInStore(){
        System.out.println("图书管理系统>>图书入库");
        System.out.print("请输入需要入库的图书编号：");

        String bookId = input.next();
        System.out.print("入库的数量：");
        int bookCount = input.nextInt();
        if ( bookBiz.inStore(bookId,bookCount)){
            System.out.println("入库成功！");
            showBooks(null);
        }else {
            System.out.println("入库失败，请检查入库的图书!");
        }



    }




    /**
     * 按编号查询
     */
    public void showFindById(){
        System.out.println("图书管理系统>>按编号查询");

        System.out.print("请输入要查询的图书编号：");
        String bookId = input.next();
        Book book = bookBiz.findById(bookId);
        if (book == null) {
            System.out.println("查无此书！");
            return;
        }
        showBooks(book);


    }

    /**
     * 删除图书
     */
    public void showDelBookView(){
        System.out.println("图书管理系统>>删除图书");

        System.out.print("请输入删除的图书编号：");
        String delId = input.next();
        Book delBook = new Book();
        delBook.setBookId(delId);
        if(bookBiz.delBook(delBook)){
            System.out.println("删除成功！");
            showBooks(null);  //打印默认的图书仓库，显示仓库中的书
        }else {
            System.out.println("删除失败！");
        }



    }

    public Book showAddNewBookView(){

        System.out.println("图书管理系统>>新增图书");
        System.out.print("内部编号：");
        String bookId = input.next();
        //验证编号是否存在
        Book newBook = bookBiz.findById(bookId);
        if (newBook == null) {
            newBook = new Book();
            newBook.setBookId(bookId);
            System.out.print("名称：");
            newBook.setBookName(input.next());
            System.out.print("库存：");
            newBook.setCount(input.nextInt());

            bookBiz.addBook(newBook);   //调用业务层的方法，添加图书

        }else {
            System.out.println("图书已存在，请重新录入");
            newBook = showAddNewBookView();  //重新调用本方法
        }
        return newBook;
    }

    /**
     * 如果传入的是null则默认希纳是图书仓库中的数组
     * @param BookArray
     */
    //参数(BookV1...BookArray)代表既可以传递一个对象也可以传递一个数组
    public void showBooks( Book... BookArray){
        System.out.println("内部编号\t\t图书名称\t\t\t库存量\t");
        if (BookArray == null){
            BookArray = Data.bookStore;
        }
        int bookCount = bookBiz.getBookCount(BookArray);
        for (int i = 0; i < bookCount; i++) {
            System.out.printf("%-12s%-14s%d",BookArray[i].getBookId(),BookArray[i].getBookName(),BookArray[i].getCount());
            System.out.println();
        }

    }

}
