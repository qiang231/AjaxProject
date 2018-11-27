import javax.swing.*;

/**
 * 商品管理类
 */

public class ProductBiz {

    public static void main(String[] args) {
        /**  保存每种商品的总量*/
        int[] counts = new int[3];

        double total = 0; //支付的总金额
        Product[] products = new Product[3];

        for (int i = 0; i < counts.length; i++) {
            if (products[i] == null) {
                products[i] = new Product();
            }
            String name = JOptionPane.showInputDialog("请输入商品名称");
            products[i].setName(name);
            // 返回值为字符串类型
            String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
            //将字符串类型转换为double类型
            products[i].setPrice(Double.parseDouble(strPrice));

            String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
            counts[i] = Integer.parseInt(strCount);

            total += products[i].getPrice() * counts[i];



        }
//        System.out.println("商品总金额为：" + total );
        System.out.println("购物结算");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + "\t" + products[i].getPrice());
        }
        JOptionPane.showMessageDialog(null,"商品总金额为" + total);
    }
}
