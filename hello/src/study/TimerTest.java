package study;

import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;

public class TimerTest {
    public static void main(String[] args) {

        System.out.println("At the tone,the time is" + new Date());

        for (int i = 0; i < 10 ; i++) {
            Toolkit.getDefaultToolkit().beep();
        }


    }
}
