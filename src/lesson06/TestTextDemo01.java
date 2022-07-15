package lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo01 extends JFrame{
    public TestTextDemo01() {
        Container contentPane = this.getContentPane();
        JTextField jTextField = new JTextField("hello");
        JTextField jTextField2 = new JTextField("word",20);//规定大小
        contentPane.add(jTextField);
        contentPane.add(jTextField2);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
