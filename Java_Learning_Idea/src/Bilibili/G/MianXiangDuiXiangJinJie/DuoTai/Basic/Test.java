package Bilibili.G.MianXiangDuiXiangJinJie.DuoTai.Basic;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(25);

        Administrator a =new Administrator();
        a.setName("王五");
        a.setAge(34);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p){
        p.show();
    }
}
