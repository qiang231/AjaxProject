import java.util.Scanner;

/**
 * 实现用户注册
 */

public class UserMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//
//        System.out.print("请输入用户名：");
//        String userName= in.next();


        System.out.print("请输入密码：");
        String password = in.next();
        System.out.println(StringUtil.validPassword(password));

//
//        System.out.print("请输入电子邮件：");
//        String email = in.next();
    }
}
