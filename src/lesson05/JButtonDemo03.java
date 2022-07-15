package lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame{
    public JButtonDemo03() {
        Container contentPane = this.getContentPane();
        URL resource = JButtonDemo01.class.getResource("img.jpg");
        Icon imageIcon = new ImageIcon(resource);

        //多选框
        JCheckBox checkBox=new JCheckBox("1");
        JCheckBox checkBox2=new JCheckBox("2");
        JCheckBox checkBo3=new JCheckBox("3");
        contentPane.add(checkBo3);
        contentPane.add(checkBox);
        contentPane.add(checkBox2);

        //由于单选框只能选择一个 ，所以进行分组,一个组只能选择一个

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
