package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Other2;

public class OverseasStudent extends Person {
    @Override
    public void eat(){
        System.out.println("吃面条");
    }
    @Override
    public void sleep(){
        System.out.println("睡大觉");
    }
    public void show(){
        this.eat();
        this.sleep();

        super.eat();
        super.sleep();
        super.drink();
    }
}
