package lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo02 extends JFrame {
    public TestTextDemo02(){
        Container contentPane = this.getContentPane();
        JPasswordField passwordField=new JPasswordField();//输出来的默认为*
        passwordField.setEchoChar('*');//可以设置展示出来的效果
        contentPane.add(passwordField);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
