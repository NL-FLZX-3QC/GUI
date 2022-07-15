package 练习.bank;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminRegister extends JFrame {
    private JPanel contentPanel = new JPanel();
    // Label标签存放背景图片
    private JLabel label;
    // 设置按钮组件
    private JButton registerTrue = new JButton("确定注册"), ReLogin = new JButton("返回登录");

    private JLabel jlb1 = new JLabel("用户名:"), jlb2 = new JLabel("密码:"), jlbtitle = new JLabel("注册界面");
    // 设置文本框组件
    private JTextField admin = new JTextField(), password = new JTextField();

    public AdminRegister() {
        this.init();
        this.addListener();
    }

    private void init() {
        this.setTitle("管理员注册界面");
        this.setSize(500, 435);
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
        add(admin);
        add(password);
        add(ReLogin);
        add(registerTrue);
        add(jlb1);
        add(jlb2);
        add(jlbtitle);

        /*
         * 组件绝对位置
         */
        jlb1.setBounds(60, 130, 90, 25);
        jlb1.setForeground(Color.white);
        admin.setBounds(105, 130, 300, 25);
        password.setBounds(105, 200, 300, 25);
        jlb2.setBounds(60, 200, 90, 25);
        jlb2.setForeground(Color.WHITE);
        ReLogin.setBounds(100, 255, 90, 40);
        registerTrue.setBounds(315, 255, 90, 40);
        jlbtitle.setBounds(175, 45, 200, 50);
        Font f = new Font("微软雅黑", Font.BOLD, 30);
        jlbtitle.setFont(f);
        jlbtitle.setForeground(Color.BLUE);

        /*
         * 组件透明化
         */
        admin.setOpaque(true);
        password.setOpaque(true);
        contentPanel.setOpaque(false);
        getContentPane().add(contentPanel);

        /*
         * 组件边框颜色
         */
        textSet(admin);
        textSet(password);

        setVisible(true);
        setResizable(false);
    }

    /*
     * JTextField文本框设置方法.
     */
    private void textSet(JTextField field) {
        field.setBackground(new Color(255, 255, 255));
        field.setPreferredSize(new Dimension(250, 28));
        MatteBorder border = new MatteBorder(0, 0, 2, 0, new Color(192, 192, 192));
        field.setBorder(border);
    }

    private void addListener() {
        ReLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminLogin();
                setVisible(false);
            }

        });
        registerTrue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }

        });
    }

    // 实现注册账户方法
    public void setRegister(String admin, String pwd) {
    }
    public static void main(String[] args) {
        new AdminRegister();
    }


}
