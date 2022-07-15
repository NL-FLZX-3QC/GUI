package lesson06;

import javax.swing.*;
import java.awt.*;

public class TestComboxDemo02 extends JFrame {
    public TestComboxDemo02() {
        Container contentPane = this.getContentPane();
        //生成列表内容
        String[] contents={"1","2","3"};
        //列表中需要放内容
        JList jList = new JList(contents);
        contentPane.add(jList);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
