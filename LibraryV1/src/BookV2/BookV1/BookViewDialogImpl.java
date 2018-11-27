package BookV2.BookV1;

import javax.swing.*;

public class BookViewDialogImpl extends AbstractBookView {
    private BookBiz bookBiz =null;
    public  BookViewDialogImpl(){
        bookBiz = new BookBiz();

    }

    @Override
    public String showMainView() {
//        System.out.println("*************************************");
//        System.out.println("\t\t欢迎使用图书管理系统");
//        System.out.println("\t1.登录系统\t\t2.退出系统");
//        System.out.println("*************************************");
//        System.out.print("请选择：");

        String strMenu = "*************************************\n";
        strMenu += "       欢迎使用图书管理系统\n";
        strMenu += "   1.登录系统        2.退出系统\n";
        strMenu += "*************************************\n";
        strMenu += "请选择：";
        String result = JOptionPane.showInputDialog(strMenu);
        if (result == null) {
            result = "2";
        }
        return result;
    }

    @Override
    public void showOutStore() {

    }

    @Override
    public void showInStore() {

    }

    @Override
    public void showFindById() {

    }

    @Override
    public void showDelBookView() {

    }

    @Override
    public Book showAddNewBookView() {
        return null;
    }

    @Override
    public void showBooks(Book... BookArray) {

    }


}
