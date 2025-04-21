package Bilibili.E.Jihe.ArrayList.TianJiaZiDingYiLeiXing;

import java.util.ArrayList;
import java.util.Scanner;

//添加学生对象并遍历
//要求：定义一个集合，添加一些学生对象，并进行遍历
//学生类的属性为：姓名，年龄
public class demo {
    public static void main(String[] args) {
        //创建集合,初始长度为0
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("zzhangsan",12);
        Student s2 = new Student("lisi",34);
        Student s3 = new Student("wangwu",13);
        //添加元素至集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //键盘录入学生信息
        Scanner input = new Scanner(System.in);
        for (int i = 3; i < 6; i++) {
            Student s = new Student();
            //如果创建对象放在循环外面，对象无法更新，每次都会覆盖前一个录入的对象，并放入集合
            System.out.println("请输入学生姓名:");
            String name = input.next();
            System.out.println("请输入学生年龄:");
            int age = input.nextInt();
            //将name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);
            //把学生对象添加到集合
            list.add(s);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //自己创建的类,使用.get()无法直接获得内容,而是先获得一个地址值
            //System.out.println(list.get(i));//输出地址
            Student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());//输出内容

        }

    }

}
