package lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo(){
        Container contentPane = this.getContentPane();

        //文本域
        JTextArea textArea=new JTextArea(20,50);//50行，每一行能写20字
        textArea.setText("馄饨");//默认文本

        //Scroll面板
        JScrollPane jScrollPane = new JScrollPane(textArea);//让文本边框有滚动条
        contentPane.add(jScrollPane);

        this.setBounds(100,100,300,350);
        this.setVisible(true);
    }
}
