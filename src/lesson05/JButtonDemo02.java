package lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame{
    public JButtonDemo02(){
        Container contentPane = this.getContentPane();
        URL resource = JButtonDemo01.class.getResource("img.jpg");
        Icon imageIcon = new ImageIcon(resource);

        //单选框
        JRadioButton jRadioButton1 = new JRadioButton("单选框");
        JRadioButton jRadioButton2 = new JRadioButton("单选框");
        JRadioButton jRadioButton3 = new JRadioButton("单选框");

        //由于单选框只能选择一个 ，所以进行分组,一个组只能选择一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        contentPane.add(jRadioButton1,BorderLayout.WEST);
        contentPane.add(jRadioButton2,BorderLayout.CENTER);
        contentPane.add(jRadioButton3,BorderLayout.EAST);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
