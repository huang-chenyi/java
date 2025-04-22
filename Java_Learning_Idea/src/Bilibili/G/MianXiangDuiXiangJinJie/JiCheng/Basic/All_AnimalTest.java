package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Basic;

public class All_AnimalTest {
    public static void main(String[] args) {
        BuOuMao a1 = new BuOuMao();
        a1.eat();
        a1.catchMouse();
        a1.setAge(13);
        System.out.println(a1.getAge());

        LiHuaMao a2 = new LiHuaMao();
        a2.eat();
        a2.catchMouse();

        HaShiQi a3 = new HaShiQi();
        a3.eat();
        a3.ChaiHouse();
        a3.lookHouse();

        TaiDi a4 = new TaiDi();
        a4.drink();
        a4.Ceng();
    }
}
