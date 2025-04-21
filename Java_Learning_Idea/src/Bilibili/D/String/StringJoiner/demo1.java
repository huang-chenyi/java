package Bilibili.D.String.StringJoiner;

import java.util.StringJoiner;

public class demo1 {
    public static void main(String[] args) {
        //构造方法

        //只带一个参数，参数为间隔符号
        StringJoiner sj1 = new StringJoiner("---");
        //带三个参数，参数一为间隔符号，参数二为开始符号，参数三为结束符号
        StringJoiner sj2 = new StringJoiner(", ","[","]");

        //添加元素
        sj1.add("aaa").add("bbb").add("ccc").add("ddd");
        sj2.add("aaa").add("bbb").add("ccc").add("ddd");

        //打印结果
        System.out.println(sj1);
        System.out.println(sj2);

        //.length()方法返回的是输出结果的总长度
        int len1 = sj1.length();
        int len2 = sj2.length();
        System.out.println(len1);
        System.out.println(len2);

        //将StringJoiner类型转化为String类型
        String str = sj1.toString();
        System.out.println(str);
    }
}
