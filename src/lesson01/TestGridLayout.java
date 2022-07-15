package lesson01;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame=new Frame();

        Button button1=new Button("button1");
        Button button2=new Button("button2");
        Button button3=new Button("button3");
        Button button4=new Button("button4");
        Button button5=new Button("button5");
        Button button6=new Button("button6");

        frame.setLayout(new GridLayout(3,2));//三行两列

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
//        frame.add(button6);

        frame.pack();//Java函数。该函数自动把布局选择一个最优秀的位置。一般不用
        frame.setVisible(true);

    }
}
