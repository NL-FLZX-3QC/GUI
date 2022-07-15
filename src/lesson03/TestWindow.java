package lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame{
    public WindowFrame(){
        setBounds(100,100,200,200);
        setBackground(Color.blue);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            //关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
            }

            //激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame source=(WindowFrame) e.getSource();//拿到窗口
                source.setTitle("被激活了");
                System.out.println("windowActivated");
            }
        });
    }


    //内部类
        //    class MyWindowListener extends WindowAdapter{
        //        @Override
        //        public void windowClosing(WindowEvent e) {
        //            setVisible(false);//隐藏窗口
        //            System.exit(0);//正常退出
        //        }
        //    }
}