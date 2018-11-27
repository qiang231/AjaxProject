package BookV2.BookV1;

import java.util.Scanner;

public abstract class AbstractBookView {


    public  AbstractBookView(){

    }

    /**
     * 本方法用来规定固定的程序逻辑
     */
    public void doMainView(){
       String result = showMainView();

        switch (result){
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
            doMainView();
    }

    public abstract String showMainView();

    /**
     * 图书出库
     */
    public abstract void showOutStore();




    /**
     * 图书入库
     */
    public abstract void showInStore();




    /**
     * 按编号查询
     */
    public abstract void showFindById();

    /**
     * 删除图书
     */
    public abstract void showDelBookView();

    public abstract Book showAddNewBookView();

    /**
     * 如果传入的是null则默认希纳是图书仓库中的数组
     * @param BookArray
     */
    //参数(BookV1...BookArray)代表既可以传递一个对象也可以传递一个数组
    public abstract void showBooks( Book... BookArray);
}
