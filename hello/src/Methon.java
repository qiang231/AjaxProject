import javax.swing.*;

public class Methon {


    public static void printWords(int times, String words) {
        for (int i = 0; i < times; i++) {
//            System.out.println(words);
            JOptionPane.showMessageDialog(null,words,"皇后",0,
                    new ImageIcon("images/富察皇后1.jpg"));

        }


    }
    public static void main(String[] args) {

        String words1 = "富察皇后";
//        String words2 = "欲上青天揽明月";
        printWords(2,words1);
//        printWords(10, words2);
    }
}
