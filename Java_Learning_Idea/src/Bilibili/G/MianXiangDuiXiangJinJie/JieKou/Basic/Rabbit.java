package Bilibili.G.MianXiangDuiXiangJinJie.JieKou.Basic;

public class Rabbit extends Animal{

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

    @Override
    public String toString() {
        return getName() + ", " + getAge();
    }
}
