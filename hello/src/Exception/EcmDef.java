package Exception;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            int j = in.nextInt();
        ecm(i,j);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不匹配");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("分母不能为零");
        }catch (Ecdef e){
            System.out.println(e.getMessage());
        }

    }
    public static void ecm(int i , int j) throws Ecdef {
        if (i < 0 && j < 0 ){
            throw new Ecdef("您输入的数存在负数!");
        }
        System.out.println(i / j);
    }
}
//自定义异常类
class Ecdef extends Exception{
    static final long serialVersionUID = -3387516993124229948L;

    public Ecdef(){

    }
    public Ecdef(String msg){
        super(msg);
    }

}
