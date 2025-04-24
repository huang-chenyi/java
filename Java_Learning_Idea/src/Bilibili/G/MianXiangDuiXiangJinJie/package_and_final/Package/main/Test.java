package Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Package.main;

import Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Package.Test.Teacher; //使用import关键字进行导包

public class Test {
    public static void main(String[] args) {

        //使用同一个包中的类时，不需要导包。
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getName() + ", " + s.getAge());

        Teacher t = new Teacher(); //使用import关键字进行导包

        //同时使用两个包中的同名类，需要用全类名。
        Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Package.Test.Teacher t1 = new Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Package.Test.Teacher();
        Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Package.Test2.Teacher t2 = new Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Package.Test2.Teacher();
    }
}
