package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Other3;

public class Student2 extends Person {
    public Student2(){
        //super();//IDEA会自动生成这行代码--引用父类的空参构造
        System.out.println("运行到了Student2类的空参构造");
    }
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("运行到了Student2类的带参构造");
    }
}
