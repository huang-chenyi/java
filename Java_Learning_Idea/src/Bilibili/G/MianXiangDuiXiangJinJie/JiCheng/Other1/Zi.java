package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Other1;

public class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);//如果本类中没有第4行和第6行，则打印父类Fu中的name
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
