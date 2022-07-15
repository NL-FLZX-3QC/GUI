package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮的时候，触发一些事件
        Frame frame = new Frame();
        Button button = new Button();
        MyActionListener myActionListener=new MyActionListener();
        button.addActionListener(myActionListener);
        frame.add(button);
        frame.setVisible(true);
        frame.pack();
        WindowClose(frame);

        
    }
    //关闭窗体的事件
    private static void WindowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
//事件监听
class MyActionListener implements ActionListener{//创造原因：因为addActionListener方法需要一个ActionListener

    @Override
    //当按钮点击后，会执行这个方法代码
    public void actionPerformed(ActionEvent e) {

        System.out.println("aaa");
    }
}