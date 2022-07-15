package lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame(){
        setBounds(1,2,200,200);
        setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获取键盘按下的键是哪一个
                int key=e.getKeyCode();
                System.out.println(key);
                if (key==KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}