package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        //启动!
        new MyFrame();
    }
}
class MyFrame extends Frame{
    public MyFrame(){
        TextField textArea=new TextField();
        add(textArea);//因为继承了Frame

        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();

        //按下回车，就会触发这个输入框的事件
        textArea.addActionListener(myActionListener2);

        //设置替换编码，把输入的文本变成*
        textArea.setEchoChar('*');
        setVisible(true);
        pack();
    }
}
class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field=(TextField) e.getSource();//获得一些资源,返回一个Object类
        field.getText();//获得输入框中的文本
        System.out.println(field.getText());
        //把输入的文本清空
        field.setText("");
    }
}