//package 练习;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
////代码优化（面向对象）
//public class TestCalc02 {
//    public static void main(String[] args) {
//        Calculator calculator=new Calculator();
//        calculator.loadFrame();
//    }
//}
////计算器类
//class Calculator extends Frame {
//    TextField num1,num2,num3;
//    public void loadFrame(){
//        //3个文本框
//        num1=new TextField(10);//10代表最大能填多少个字符数
//        num2=new TextField(10);//10代表最大能填多少个字符数
//        num3=new TextField(20);//20代表最大能填多少个字符数
//
//        //一个按钮
//
//        Button button = new Button("=");
//        button.addActionListener(new MyCalculator(this));
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
//    //获取计算机对象，在一个对象中组合另外一个类;
//    private Calculator calculator;
//    public MyCalculator(Calculator calculator) {
//        this.calculator=calculator;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //1.获得加数和被加数
//        int i = Integer.parseInt(calculator.num1.getText());
//        int i1 = Integer.parseInt(calculator.num2.getText());
//        //2.将这个值加法运算后，放到第三个框
//        calculator.num3.setText(""+(i+i1));
//        //3.清除前两个框
//        calculator.num1.setText("");
//        calculator.num2.setText("");
//    }
//}