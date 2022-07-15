package lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {

    public JButtonDemo01(){
        Container contentPane = this.getContentPane();
        URL resource = JButtonDemo01.class.getResource("img.jpg");
        Icon imageIcon = new ImageIcon(resource);

        //把图片放在按钮上
        JButton jButton = new JButton();
        jButton.setIcon(imageIcon);
        jButton.setToolTipText("图片按钮");//鼠标悬浮在图片上出现的文字
        contentPane.add(jButton);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
