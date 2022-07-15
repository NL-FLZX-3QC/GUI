package homework;

import javax.swing.*;
import java.awt.*;

public class Bank {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("简易计算器");
        Dimension winsize = new Dimension(380, 500);
        jframe.setSize(winsize);
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        jframe.setLocation((screensize.width - 300) / 2, (screensize.height - 188) / 2);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new GridLayout(7, 1));

        JLabel title = new JLabel("简易计算器");
        Panel panel1 = new Panel();
        panel1.add(title);

        JLabel label1 = new JLabel("运算数一");
        JTextField jtf1 = new JTextField(6);
        Panel panel2 = new Panel();
        panel2.add(label1, "West");
        panel2.add(jtf1, "East");

        JLabel label2 = new JLabel("运算数二");
        JTextField jtf2 = new JTextField(6);
        Panel panel3 = new Panel();
        panel3.add(label2, "West");
        panel3.add(jtf2, "East");

        JLabel label3 = new JLabel("运算结果");
        JTextField jtf3 = new JTextField(6);
        Panel panel4 = new Panel();
        panel4.add(label3, "West");
        panel4.add(jtf3, "East");

        JButton add = new JButton("注册");
        JButton sub = new JButton("登录");
        Panel panel5 = new Panel();
        panel5.add(add, "West");
        panel5.add(sub, "East");


        jframe.add(panel1);
        jframe.add(panel2);
        jframe.add(panel3);
        jframe.add(panel4);
        jframe.add(panel5);


        add.addActionListener(e -> {
            Double num1 = Double.parseDouble(jtf1.getText());
            Double num2 = Double.parseDouble(jtf2.getText());
            Double result = num1 + num2;
            jtf3.setText(Double.toString(result));
        });

        sub.addActionListener(e -> {
            Double num1 = Double.parseDouble(jtf1.getText());
            Double num2 = Double.parseDouble(jtf2.getText());
            Double result = num1 - num2;
            jtf3.setText(Double.toString(result));
        });


    }
}
