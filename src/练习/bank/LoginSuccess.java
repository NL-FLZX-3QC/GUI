package 练习.bank;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSuccess extends JFrame {
    private JPanel contentPanel = new JPanel();
    // Label标签存放背景图片
    private JLabel label;
    // 设置按钮组件
    private JButton inquiry = new JButton("查询余额"), takeMoney = new JButton("取款"),makeMoney=new JButton("存款"),
    transfer=new JButton("转账"),exitSystem=new JButton("退出系统");

    public LoginSuccess() {
        this.init();
        this.addListener();
    }

    private void init() {
        this.setTitle("欢迎使用银行管理系统");
        this.setSize(1000, 435);
        this.setLocationRelativeTo(null);
        ImageIcon image1 = new ImageIcon("bankImage.jpg"); // 界面背景图片
        JLabel backLabel = new JLabel();
        backLabel.setIcon(image1);
        label = new JLabel(image1);
        label.setBounds(0, 0, 1000, 400);
        // 在LayeredPane最底层上添加两个带图片的标签，并且label2在label上方
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        // 将内容面板设置为透明，就能够看见添加在LayeredPane上的背景。
        ((JPanel) this.getContentPane()).setOpaque(false);

        /*
         * 添加组件到contentPanel容器中 布局方式为自由布局。
         */
        contentPanel.setLayout(null);
        add(takeMoney);
        add(inquiry);
        add(makeMoney);
        add(transfer);
        add(exitSystem);


        /*
         * 组件绝对位置
         */

        inquiry.setBounds(140, 170, 90, 40);
        takeMoney.setBounds(290, 170, 90, 40);
        makeMoney.setBounds(440, 170, 90, 40);
        transfer.setBounds(590, 170, 90, 40);
        exitSystem.setBounds(740, 170, 90, 40);

        /*
         * 组件透明化
         */
        contentPanel.setOpaque(false);
        getContentPane().add(contentPanel);

        /*
         * 组件边框颜色
         */


        setVisible(true);
        setResizable(false);
    }


    private void addListener() {
        takeMoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        inquiry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }

        });
    }

    public static void main(String[] args) {
        new LoginSuccess();
    }


}
