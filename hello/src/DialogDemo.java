import javax.swing.*;

public class DialogDemo {
    public static void main(String[] args) {

        //参数1：对话框的父窗体对象
        //参数2：对话框中的提示信息
        //参数3：对话框的标题类型
        //参数4：对话框的消息类型
        //JOptionPane.showMessageDialog(null,"提示信息");
//        JOptionPane.showMessageDialog(null,"嘘寒问暖",JOptionPane.QUESTION_MESSAGE);

//        while (true) {
//            JOptionPane.showMessageDialog(null, "我是警告提示框！╮(╯▽╰)╭", "231", JOptionPane.ERROR_MESSAGE);
////        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//
//            JOptionPane.showConfirmDialog(null, "我是警告提示框！╮(╯▽╰)╭", "231", JOptionPane.YES_NO_CANCEL_OPTION);
//
//        Object[] options ={ "必须是", "当然是" };  //自定义按钮上的文字
//        int m = JOptionPane.showOptionDialog(null, "钓鱼岛是中国的吗？", "标题",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            Object[] obj2 = {"路人甲","路人乙","路人丙"};
            String s = (String) JOptionPane.showInputDialog(null, "请选择你的身份：\n", "身份",JOptionPane.PLAIN_MESSAGE);


    }
}
