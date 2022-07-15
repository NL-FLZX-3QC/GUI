package lesson04;

import javax.swing.*;
import java.awt.*;

//图标，需要实现类
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;
    public IconDemo(){
    }
    public IconDemo(int width,int height){
        this.height=height;
        this.width=width;
    }
    public static void main(String[] args) {
        new IconDemo().init();
    }
    public void init(){
        IconDemo iconDemo = new IconDemo(15, 15);
        //图像放在标签，也可以放在按钮上
        JLabel icon = new JLabel("ICON", iconDemo, SwingConstants.CENTER);
        Container contentPane = getContentPane();
        contentPane.add(icon);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
