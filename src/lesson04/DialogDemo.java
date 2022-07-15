package lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {
    public DialogDemo() {
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame 放东西，容器
        Container container=this.getContentPane();
        //绝对布局
        container.setLayout(null);

        //按钮
        JButton jButton = new JButton("点击弹出一个对话框");
        jButton.setBounds(30,30,200,50);

        //点击这个按钮的时候，弹出一个弹窗
        jButton.addActionListener(new ActionListener() {//监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });
        container.add(jButton);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}
//弹窗的窗口
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 弹窗类默认可以被关闭，不用设置
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        contentPane.add(new Label("学JAVA"));
    }
}