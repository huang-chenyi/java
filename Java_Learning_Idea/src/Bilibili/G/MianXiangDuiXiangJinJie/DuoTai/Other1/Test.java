package Bilibili.G.MianXiangDuiXiangJinJie.DuoTai.Other1;

public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();
        Administrator a =new Administrator();




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

