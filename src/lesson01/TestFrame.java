package lesson01;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //Frame窗口对象，看源码
       Frame frame= new Frame("我的第一个Java图像界面窗口");//设置标题

       //需要设置可见性。默认width和height为0
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色  setBackgroud需要Color类 看源码
            //frame.setBackground(Color.BLACK); 使用Color类设置好的颜色
        frame.setBackground(new Color(67, 138, 56));

        //弹出的初始位置  （0 ，0）为左上角开始，即左上角为起始点。
        frame.setLocation(200,200);

        //窗口大小固定,true可以变大变小，false为固定
        frame.setResizable(false);

    }
}
