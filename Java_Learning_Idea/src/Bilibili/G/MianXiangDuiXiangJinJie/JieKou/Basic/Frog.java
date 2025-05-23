package Bilibili.G.MianXiangDuiXiangJinJie.JieKou.Basic;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }

    @Override
    public String toString() {
        return getName() + ", " + getAge();
    }

}
