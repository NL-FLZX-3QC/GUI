package lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}
class MyJFrame extends JFrame{
    public void init(){
        this.setVisible(true);
        this.setBounds(100,100,200,200);

        //设置文字 Jlabel
        JLabel label = new JLabel("欢乐谷了");
        this.add(label);

        //让文本居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //获得一个容器
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.blue);
    }
}