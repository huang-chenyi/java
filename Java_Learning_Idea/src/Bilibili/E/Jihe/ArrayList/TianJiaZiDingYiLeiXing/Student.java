package Bilibili.E.Jihe.ArrayList.TianJiaZiDingYiLeiXing;
//link to C.MianXiangDuiXiang.JavaBean
public class Student {
    //私有化成员变量
    private String name;
    private int age;
    //空参构造
    public Student() {
    }
    //全参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get and set
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
