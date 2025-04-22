package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Basic;

public class animal {
    private int age;
    public animal() {
    }
    public animal(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }
    public void drink() {
        System.out.println("喝水");
    }
}
