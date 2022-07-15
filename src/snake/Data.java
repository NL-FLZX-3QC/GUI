package snake;

import javax.swing.*;
import java.net.URL;

//数据中心
public class Data {
    public static URL headerURL=Data.class.getResource("static/4.png");
    public static ImageIcon header=new ImageIcon(headerURL);

    public static URL upURL=Data.class.getResource("static/2.png");
    public static URL downURL=Data.class.getResource("static/5.png");
    public static URL leftURL=Data.class.getResource("static/6.png");
    public static URL rightURL=Data.class.getResource("static/3.png");

    public static ImageIcon up=new ImageIcon(upURL);
    public static ImageIcon down=new ImageIcon(downURL);
    public static ImageIcon right=new ImageIcon(rightURL);
    public static ImageIcon left=new ImageIcon(leftURL);

    public static URL foodURL=Data.class.getResource("static/7.png");
    public static ImageIcon food=new ImageIcon(foodURL);

    public static URL bodyURL=Data.class.getResource("static/1.png");
    public static ImageIcon body=new ImageIcon(bodyURL);

}
