package Bilibili.B.BianLiangHeFangFa;

public class BianLiang {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        int b = 20;
        System.out.println(a + b);
        a = 20;
        System.out.println(a);

        //练习
        System.out.println("开始练习：");
        //一开始没有乘客
        int count = 0;
        //第一站上去一位乘客
        count = count + 1;
        //第二站上去两位乘客，下去一位乘客
        count = count + 2 - 1;
        //第三站上2下1
        count = count + 2 - 1;
        //终点站乘客数量
        System.out.println("车上的乘客数量:" + count);
    }
}
