package Bilibili.G.MianXiangDuiXiangJinJie.DuoTai.Other1;

public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();
        Administrator a =new Administrator();
        s.show();
        t.show();
        a.show();
        s.study();
        //多态的使用
        Person s1 = new Student();
        s1.show();
        //s1.study();  -->本行会报错，因为使用多态定义的成员变量无法使用自己独有的方法
        Student s2 = (Student) s1;
        s2.show();
        s2.study();


    }
}
class Person{
    String name = "人";
    public void show(){
        System.out.println("人");
    }
}
class Student extends Person{
    String name = "学生张三";
    @Override
    public void show(){
        System.out.println("学生");
    }
    //Student类特有方法
    public void study(){
        System.out.println("学习");
    }
}
class Teacher extends Person{
    String name = "老师李四";
    @Override
    public void show(){
        System.out.println("老师");
    }
}
class Administrator extends Person{
    String name = "管理员王五";
    @Override
    public void show(){
        System.out.println("管理员");
    }
}

