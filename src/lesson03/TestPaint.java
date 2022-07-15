package lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        MyPaint myPaint = new MyPaint();
        myPaint.loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,600,300);
        setVisible(true);
    }
    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔，需要有颜色，可以画画
        g.setColor(Color.red);

        //画空心圆x，y的值为相对于窗体的坐标
            //g.drawOval(100,100,100,100);

        //画实心圆
        g.fillOval(100,100,100,100);

        //画实心矩形
        g.setColor(Color.green);
        g.fillRect(150,200,200,200);

        //画笔用完，将它还原到最初的颜色（就是不设置的颜色。默认黑色）
    }
}