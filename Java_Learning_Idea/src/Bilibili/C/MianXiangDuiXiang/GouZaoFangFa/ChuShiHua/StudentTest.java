package Bilibili.C.MianXiangDuiXiang.GouZaoFangFa.ChuShiHua;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象

        //空参构造
        Student s1 = new Student();
        //带参构造（在定义变量创建对象时进行初始化）
        Student s2 = new Student("ZangSan",26);
        s2.setAge(26);
        System.out.println(s2.getAge());
        s2.setName("LiHua");
        System.out.println(s2.getName());

    }
}
