package lesson06;

import javax.swing.*;
import java.awt.*;

public class TestComboxDemo01 extends JFrame {
    public TestComboxDemo01(){
        Container contentPane = this.getContentPane();
        JComboBox jComboBox=new JComboBox();

        //下拉框
        jComboBox.addItem(null);
        jComboBox.addItem("正在上架");
        jComboBox.addItem("即将上映");


        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
