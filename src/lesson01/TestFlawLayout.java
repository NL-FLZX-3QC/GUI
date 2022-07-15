package lesson01;

import java.awt.*;

public class TestFlawLayout {
    public static void main(String[] args) {
        Frame frame=new Frame();

        //组件-按钮
        Button button1=new Button("button1");
        Button button2=new Button("button2");
        Button button3=new Button("button3");

        //设置流式布局
            //frame.setLayout(new FlowLayout());
            //frame.setLayout(new FlowLayout(FlowLayout.LEFT));//向左靠齐
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));//向右靠齐

        frame.setSize(200,200);

        //把按钮添加上去。不加位置的话默认置顶居中
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);

    }
}
