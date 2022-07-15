package lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}
class MyFrame extends Frame {
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    ArrayList points;
    public MyFrame(String title){
        super(title);//设置标题
        setBounds(200,200,400,300);
        setVisible(true);

        //存鼠标点击的点
        points=new ArrayList<>();
        //鼠标监听器，正对着这个窗口
        this.addMouseListener(new MyMouseListener());
    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标的事件

        //迭代器
        Iterator iterator=points.iterator();
        while (iterator.hasNext()){
            Point point=(Point) iterator.next();//获取每次鼠标按下的事件
            g.setColor(Color.red);//给每次按下的事件设置颜色
            g.fillOval(point.x,point.y,10,10);//获取每次鼠标按下时的坐标并且产生一个圆
        }

    }
    //适配器模式（这样理解，当要实现一个接口时，是要实现接口的所有方法。但是有些方法不需要，那么就用继承一个实现了这个接口的类）
    private class MyMouseListener extends MouseAdapter{
        //鼠标 按下，弹起，按住不放

        //当鼠标按下时会调用这个方法
        @Override
        public void mousePressed(MouseEvent e) {//变量e大概指鼠标

            MyFrame frame=(MyFrame) e.getSource();//拿到这个窗口

            points.add(new Point(e.getX(),e.getY()));//获取鼠标按下后的坐标并添加在集合中

            //每次点击鼠标都需要重新画一遍
            frame.repaint();

        }
    }
}