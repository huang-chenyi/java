package Bilibili.D.String.StringBuilder;

public class demo2 {
    public static void main(String[] args) {
        //初始化
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        //添加字符串
        sb1.append("aaa");
        sb1.append("bbb");
        sb1.append("ccc");
        sb1.append("ddd");
        //链式编程
        sb2.append("aaa").append("bbb").append("ccc").append("ddd");

        //输出结果
        System.out.println(sb1);
        System.out.println(sb2);

        //将StringBuilder类型转化为String类型
        String str = sb1.toString();
        System.out.println(str);

    }
}
