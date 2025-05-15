package Bilibili.G.MianXiangDuiXiangJinJie.JieKou.JDK8_NEW.SiYou;

public interface Inter {

    public default void show1() {
        System.out.println("show1方法开始了");
        //System.out.println("记录程序运行");
        show3();
    }
    public static void show2() {
        System.out.println("show2方法开始了");
        //System.out.println("记录程序运行");
        show4();
    }

    //普通的私有方法，给默认方法服务
    private void show3() {
        System.out.println("记录程序运行");
    }
    //静态的私有方法，给静态方法服务
    private static void show4() {
        System.out.println("记录程序运行");
    }
}
