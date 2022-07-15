package lesson04;

import javax.swing.*;

public class JFrameDemo {
    //init();初始化
    public void init(){
        //顶级窗口
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);

        //设置文字 Jlabel
        JLabel label = new JLabel("欢乐谷了");
        jFrame.add(label);
        //关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
