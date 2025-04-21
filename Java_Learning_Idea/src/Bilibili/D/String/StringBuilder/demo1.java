package Bilibili.D.String.StringBuilder;

public class demo1 {
    public static void main(String[] args) {
        //初始化
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("try");
        StringBuilder sb3 = new StringBuilder("1");
        StringBuilder sb4 = new StringBuilder("abc");
        StringBuilder sb5 = new StringBuilder("abcdefg");


        //添加元素
        sb3.append(2);
        sb3.append(3);
        //反转变量所有数据
        sb4.reverse();
        //获取长度
        int a = sb5.length();


        //输出
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
        System.out.println(sb5);
    }
}
