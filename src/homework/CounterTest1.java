package homework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CounterTest1 {

    private String button0 = "0";
    private String button1 = "1";
    private String button2 = "2";
    private String button3 = "3";
    private String button4 = "4";
    private String button5 = "5";
    private String button6 = "6";
    private String button7 = "7";
    private String button8 = "8";
    private String button9 = "9";
    private String buttonAdd = "+";
    private String buttonSub = "-";
    private String buttonMul = "*";
    private String buttonDiv = "⊹";
    private String buttonDot = ".";
    private String buttonEqu = "=";
    private String buttonDel = "清除";
    private String buttonCge="+/-";
    private String buttonCE="CE";
    private String buttonC="C";
    private String button1x="1/x";
    private String button2x="x^2";
    private String buttonI="2√x";

    String name;
    private double result = 0 ;
    private String stringResult = "";
    //设置文本框的大小为30
    TextField textField = new TextField(30);

    public CounterTest1() {

    }

    public CounterTest1 (String name){
        this.name = name;

    }

    //创建页面
    public void createFrame() {

        JFrame jFrame = new JFrame("计算机");
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.setSize(500,700);   //大小
        jFrame.setLocation(700,300);		//位置
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//关闭按钮


        //设置按钮7,8,9，+
        JPanel jPanel1 = new JPanel(new GridLayout(1,4,5,5));
        jPanel1.add(ActionButtonInputInput(buttonDiv));
        jPanel1.add(ActionButtonInputInput(buttonCE));
        jPanel1.add(ActionButtonInputInput(buttonC));
        jPanel1.add(ActionButtonInputInput(buttonDel));


        //设置按钮4,5,6，-
        JPanel jPanel2 = new JPanel(new GridLayout(1,4,5,5));
        jPanel2.add(ActionButtonInputInput(button1x));
        jPanel2.add(ActionButtonInputInput(button2x));
        jPanel2.add(ActionButtonInputInput(buttonI));
        jPanel2.add(ActionButtonInputInput(buttonDiv));

        //设置按钮1,2,3，*
        JPanel jPanel3 = new JPanel(new GridLayout(1,4,5,5));
        jPanel3.add(ActionButtonInputInput(button7));
        jPanel3.add(ActionButtonInputInput(button8));
        jPanel3.add(ActionButtonInputInput(button9));
        jPanel3.add(ActionButtonInputInput(buttonMul));

        //设置按钮   清除，0，/ =
        JPanel jPanel4 = new JPanel(new GridLayout(1,4,5,5));
        jPanel4.add(ActionButtonInputInput(button4));
        jPanel4.add(ActionButtonInputInput(button5));
        jPanel4.add(ActionButtonInputInput(button6));
        // 设置等于按钮
        jPanel4.add(ActionButtonInputInput(buttonSub));

        //设置删除按钮为一行一列，5个像素点
        JPanel jPanel5 = new JPanel(new GridLayout(1,4,5,5));
        jPanel5.add(ActionButtonInputInput(button1));
        jPanel5.add(ActionButtonInputInput(button2));
        jPanel5.add(ActionButtonInputInput(button3));
        jPanel5.add(ActionButtonInputInput(buttonAdd));
        JPanel jPanel6 = new JPanel(new GridLayout(1,4,5,5));
        jPanel6.add(ActionButtonInputInput(buttonCge));
        jPanel6.add(ActionButtonInputInput(button0));
        jPanel6.add(ActionButtonInputInput(buttonDot));
        jPanel6.add(ActionButtonInputInput(buttonEqu));

        // 创建横向Box布局
        Box box = Box.createVerticalBox();
        //从上到下，将组件添加到box容器中
        box.add(textField);
        box.add(jPanel1);
        box.add(jPanel2);
        box.add(jPanel3);
        box.add(jPanel4);
        box.add(jPanel5);
        box.add(jPanel6);

        //将box布局添加到Frame容器中
        jFrame.setContentPane(box);
        //窗口显示出来
        jFrame.setVisible(true);
    }

    //对于button 的操作
    public JButton ActionButtonInputInput(String buttonName) {
        JButton button = new JButton(buttonName);
        button.setFont(new Font("黑体",Font.BOLD,20));
        return button;
    }
    
    public static void main(String[] args) {

        CounterTest1 test = new CounterTest1();
        test.createFrame();

    }

}

