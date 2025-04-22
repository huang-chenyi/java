package Bilibili.G.MianXiangDuiXiangJinJie.JiCheng.Other3;

public class Student1 extends Person {
    public Student1(){
        this("李四",14);//调用本类其他构造方法
        System.out.println("运行到了Student1类的空参构造");
    }
    public Student1(String name, int age) {
        super("张三",12);//
        this.name = name;
        this.age = age;
        System.out.println("运行到了Student1类的带参构造");
    }


}
