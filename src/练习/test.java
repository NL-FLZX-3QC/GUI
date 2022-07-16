package 练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String args[]) {
        String str = "";
        String pattern = "^\\d+(\\.\\d+)?$";
        System.out.println("hello--hot-fix");
        System.out.println("hello--master:test");
        System.out.println("hello--master:test2");
        System.out.println("hello--hot-fix:test");
      

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
