package 练习;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//代码优化(利用内部类优化)
public class TestCalc03 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.loadFrame();
    }
}
//计算器类
class Calculator extends Frame {
    TextField num1,num2,num3;
    public void loadFrame(){
        //3个文本框
        num1=new TextField(10);//10代表最大能填多少个字符数
        num2=new TextField(10);//10代表最大能填多少个字符数
        num3=new TextField(20);//20代表最大能填多少个字符数

        //一个按钮

        Button button = new Button("=");
        button.addActionListener(new MyCalculator());

        //1个标签
        Label label = new Label("+");

        //流式布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        setVisible(true);
        pack();
    }
    //监听器类
    //内部类最大的好处，就是可以畅通无阻的访问外部的属性和方法
   private class MyCalculator implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //1.获得加数和被加数
            int i = Integer.parseInt(num1.getText());
            int i1 = Integer.parseInt(num2.getText());
            //2.将这个值加法运算后，放到第三个框
            num3.setText(""+(i+i1));
            //3.清除前两个框
            num1.setText("");
            num2.setText("");
        }
    }
}
