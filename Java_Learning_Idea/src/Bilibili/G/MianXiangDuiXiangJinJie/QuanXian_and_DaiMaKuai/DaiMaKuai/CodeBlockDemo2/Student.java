package Bilibili.G.MianXiangDuiXiangJinJie.QuanXian_and_DaiMaKuai.DaiMaKuai.CodeBlockDemo2;

public class Student {
    private String name;
    private int age;

    {
        System.out.println("开始执行构造方法");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
