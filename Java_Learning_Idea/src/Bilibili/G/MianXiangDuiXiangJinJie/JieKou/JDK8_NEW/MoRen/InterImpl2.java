package Bilibili.G.MianXiangDuiXiangJinJie.JieKou.JDK8_NEW.MoRen;

public class InterImpl2 implements Inter, Inter2 {
    @Override
    public void method1() {

    }
    //此show方法必须重写
    @Override
    public void show() {
        System.out.println("重写默认方法 ---- show");
    }
}
