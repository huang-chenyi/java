package Bilibili.G.MianXiangDuiXiangJinJie.JieKou.Basic;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 1);
        System.out.println(f);

        f.eat();
        f.swim();


        Rabbit r = new Rabbit("兔兔", 2);
        System.out.println(r);

        r.eat();


        Dog d = new Dog("狗",4);
        System.out.println(d);

        d.eat();
        d.swim();

    }
}
