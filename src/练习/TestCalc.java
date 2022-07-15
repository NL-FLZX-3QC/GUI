//package 练习;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
////简易计算器
//public class TestCalc {
//
//
//}
////计算器类
//class Calculator extends Frame {
//    public Calculator() {
//        //3个文本框
//        TextField num1=new TextField(10);//10代表最大能填多少个字符数
//        TextField num2=new TextField(10);//10代表最大能填多少个字符数
//        TextField num3=new TextField(20);//20代表最大能填多少个字符数
//
//        //一个按钮
//
//        Button button = new Button("=");
//        button.addActionListener(new MyCalculator(num1,num2,num3));
//
//        //1个标签
//        Label label = new Label("+");
//
//        //流式布局
//        setLayout(new FlowLayout());
//        add(num1);
//        add(label);
//        add(num2);
//        add(button);
//        add(num3);
//
//        setVisible(true);
//        pack();
//    }
//
//}
////监听器类
//class MyCalculator implements ActionListener{
//    //获取三个变量
//    private TextField num1,num2,num3;
//    public MyCalculator(TextField num1,TextField num2,TextField num3) {
//        this.num1=num1;
//        this.num2=num2;
//        this.num3=num3;
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //1.获得加数和被加数
//        int i = Integer.parseInt(num1.getText());
//        int i1 = Integer.parseInt(num2.getText());
//        //2.将这个值加法运算后，放到第三个框
//        num3.setText(""+(i+i1));
//        //3.清除前两个框
//        num1.setText("");
//        num2.setText("");
//    }
//}