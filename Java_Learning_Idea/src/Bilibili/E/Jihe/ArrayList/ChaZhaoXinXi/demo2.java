package Bilibili.E.Jihe.ArrayList.ChaZhaoXinXi;


import java.util.ArrayList;
import java.util.Scanner;

//在main方法里创建一个集合，存入三个用户对象:id username password
//要求：定义一个方法，根据id查找对应的用户信息
//存在返回信息索引,否则返回-1
public class demo2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<User> list = new ArrayList<>();
        //创建用户对象
        User u1 = new User("4146","zhangsan","123456");
        User u2 = new User("5234","askzx","1234567");
        User u3 = new User("4167","lisi","12345678");
        //把对象添加到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //查找id并输出结果
        System.out.println("请输入要查找的id(四位数字):");
        Scanner input = new Scanner(System.in);
        String id = input.next();
        int result = contains(list, id);
        if(result != -1) {
            User user = list.get(result);
            System.out.println("索引:" + result);
            System.out.print("个人信息:" + user.getId() + " " + user.getUsername() + " " + user.getPassword());
        }
        else {
            System.out.println("查找的信息不存在！");
        }

    }
    public static int contains(ArrayList<User> list, String id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
