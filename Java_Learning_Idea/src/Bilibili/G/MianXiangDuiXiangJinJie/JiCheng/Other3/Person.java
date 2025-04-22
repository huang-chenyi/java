package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Other3;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("运行到了Person类的空参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
