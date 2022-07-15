package lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
//把图片加进窗体
public class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        JLabel jLabel = new JLabel("imageicon");
        //获取图片地址
        URL url = ImageIconDemo.class.getResource("img.jpg");//理解问获取当前类下面同级资源"img.jpg"的地址
        ImageIcon imageIcon = new ImageIcon(url);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container contentPane = getContentPane();
        contentPane.add(jLabel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
