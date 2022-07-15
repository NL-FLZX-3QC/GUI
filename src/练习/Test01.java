package 练习;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setBackground(Color.BLACK);
        frame.setLayout(new GridLayout(2,1));


        Panel panel=new Panel(new BorderLayout());//采用东西南北布局,采用这个布局时，这个必须写
        Panel panel2=new Panel(new GridLayout(2,1));//采用2行一列的表格布局
        panel2.add(new Button("button"));
        panel2.add(new Button("button"));
        panel.add(new Button("button"),BorderLayout.WEST);
        panel.add(new Button("button"),BorderLayout.EAST);
        panel.add(panel2,BorderLayout.CENTER);

        Panel P=new Panel(new BorderLayout());
        Panel P2=new Panel(new GridLayout(2,2));
        P2.add(new Button("button"));
        P2.add(new Button("button"));
        P2.add(new Button("button"));
        P2.add(new Button("button"));
        P.add(new Button("button"),BorderLayout.WEST);
        P.add(new Button("button"),BorderLayout.EAST);
        P.add(P2,BorderLayout.CENTER);


        frame.add(panel);
        frame.add(P);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
