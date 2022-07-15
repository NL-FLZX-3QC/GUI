package lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        new MyFrame(100,100,200,200,Color.blue);
        new MyFrame(300,100,200,200,Color.red);
        new MyFrame(100,300,200,200,Color.yellow);
        new MyFrame(300,300,200,200,Color.BLACK);
    }
}
class MyFrame extends Frame{
    static int id=0;//可能存在多个窗口，我们需要一个计数器
    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame"+(++id));
        setBackground(color);

        //把设置窗口大小和窗口起始位置放在一起设置
        setBounds(x,y,w,h);

        setVisible(true);

    }
}
