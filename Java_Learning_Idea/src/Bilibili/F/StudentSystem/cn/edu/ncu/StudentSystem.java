package Bilibili.F.StudentSystem.cn.edu.ncu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            Scanner input = new Scanner(System.in);
            String choose = input.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //System.exit(0);//(直接退出虚拟机，结束所有代码)
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }
    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Student student = new Student();

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("请输入学生的id:");
            String id = input.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已经存在，请重新录入");
            }
            else {
                student.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        String name = input.next();
        student.setName(name);

        System.out.println("请输入学生的年龄:");
        int age = input.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的家庭住址:");
        String address = input.next();
        student.setAddress(address);

        list.add(student);
        System.out.println("学生信息添加成功");

    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = input.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        }
        else {
            System.out.println("id不存在,删除失败");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要修改学生的id:");
        String id = input.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的id" + id +"不存在，请重新输入");
            return;
        }
        Student stu = list.get(index);
        System.out.println("请输入要修改的学生姓名");
        stu.setName(input.next());
        System.out.println("请输入要修改的学生年龄");
        stu.setAge(input.nextInt());
        System.out.println("请输入要修改的学生家庭住址");
        stu.setAddress(input.next());
        System.out.println("学生信息修改成功");

    }
    //查询学生 7
    public static void queryStudent(ArrayList<Student> list) {
        if(list.isEmpty()/*list.size() == 0*/){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (Student stu : list/*int i = 0; i < list.size(); i++*/) {
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }
    //判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
//        for (Student stu : list) {
//            //for (int i = 0; i < list.size(); i++) {
//            //  Student stu = list.get(i);
//            if (stu.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        return getIndex(list, id) >= 0;

    }
    //通过id获得索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
