package Bilibili.C.MianXiangDuiXiang.GouZaoFangFa.ChuShiHua;

public class Student {
    private String name;
    private int age;

    //注意 !!!请同时编写有参和空参构造方法!!!
    //空参构造方法(如果我们自己没有任何构造方法，虚拟机会自动生成一个空参方法)
    public Student() {
        //成员变量均取默认值
    }
    //带参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    //age
    public void setAge(int age) {
            this.age = age;
    }
    public int getAge () {
        return age;
    }

}
