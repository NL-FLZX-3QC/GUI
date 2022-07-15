package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent02 {
    public static void main(String[] args) {
        //两个按钮，实现同一个监听
        Frame frame=new Frame("开始-停止");
        frame.pack();
        frame.setVisible(true);

        Button button = new Button("begin");
        Button button2 = new Button("stop");

        //显示的定义触发返回的命令，与MyMonitor中的getActionCommand相呼应。可以写按钮名字以便区分按钮
        //可以多个按钮只写一个监听
        button.setActionCommand("button-begin");

        MyMonitor myMonitor=new MyMonitor();
        button.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        frame.add(button,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);
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
class MyMonitor implements ActionListener {//创造原因：因为addActionListener方法需要一个ActionListener

    @Override
    //当按钮点击后，会执行这个方法代码
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了：msg"+e.getActionCommand());
    }
}