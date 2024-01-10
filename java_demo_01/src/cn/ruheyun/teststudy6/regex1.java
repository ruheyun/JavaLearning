package cn.ruheyun.teststudy6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    private static Pattern FIND_PATTERN = Pattern.compile("Java\\d{0,2}");
    public static void main(String[] args) {
        String str = "对于Java初学者，经常会听到同事，或看到网上Java版本和JDK版本不一的叫法，" +
                "不明白这两者到底什么关系？其实博主当年初学Java时也有这样的困惑，" +
                "今天我们就来好好探讨一下，如有不对之处，请加以指正，不喜勿喷，谢谢！" +
                "Java6、Java8、Java11、Java13 (当前最新版本Java17) 等这一类 “Java X” 的Java版本名称";
        Matcher m = FIND_PATTERN.matcher(str);
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
