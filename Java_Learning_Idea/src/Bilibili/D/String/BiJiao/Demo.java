package Bilibili.D.String.BiJiao;

public class Demo {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "abc";

        //2.==号比较
        //基本数据类型(数字:1,2):比较数据
        //引用数据类型(字符串):比较地址值
        System.out.println(s1 == s2);//false

        //3.比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);//严格比较s1和s2
        boolean result2 = s1.equalsIgnoreCase(s2);//不区分大小写(英文)对s1和s2进行比较
        System.out.println(result1);
        System.out.println(result2);

    }
}
