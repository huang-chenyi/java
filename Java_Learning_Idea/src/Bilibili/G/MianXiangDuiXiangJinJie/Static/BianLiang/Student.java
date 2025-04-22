package Bilibili.G.MianXiangDuiXiangJinJie.Static.BianLiang;

public class Student {
    //属性：姓名，年龄
    //新增：老师的姓名
    private String name;
    private int age;
    private String gender;
    public static String teacherName;
    //静态变量被该类的所有对象所共享，可以用类名或者对象名进行调用

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //行为
    public void study(){
        System.out.println(name + "正在学习");
    }
    //打印结果
    public void show(){
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }

}
