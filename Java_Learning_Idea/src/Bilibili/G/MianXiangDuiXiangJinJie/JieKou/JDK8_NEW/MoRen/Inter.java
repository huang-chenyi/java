package Bilibili.G.MianXiangDuiXiangJinJie.JieKou.JDK8_NEW.MoRen;

public interface Inter {

    public abstract void method1();

    public default void show() {
        System.out.println("Inter接口中的默认方法 ---- show");
    }
}
