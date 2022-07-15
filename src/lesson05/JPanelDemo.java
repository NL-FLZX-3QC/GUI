package lesson05;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    public JPanelDemo(){
        Container container=this.getContentPane();
        //网络布局组件数超过其容纳个数会自动优化以容纳这些组件
        container.setLayout(new GridLayout(2,1,10,10));//后面两个参数的是间距
        JPanel jPanel = new JPanel(new GridLayout(1, 3));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("1"));
        container.add(jPanel);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
