package lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Panel 可以看成一个空间，但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame=new Frame();

        Panel panel=new Panel();

        //设置布局
        frame.setLayout(null);//将容器的布局设为绝对布局。如果不设的话，panel的布局会采用默认布局，setBounds控制它们的位置也没用

        //设置坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(112, 117, 149));

        //Panel设置坐标，相对于frame而言的坐标
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(140, 0, 128));

        //frame添加面板
        frame.add(panel);

        frame.setVisible(true);

        //监听事件，监听窗口关闭事件 System.exit(0)
        //适配器模式(23种设计模式之一)
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0 );
            }
        });
    }
}
