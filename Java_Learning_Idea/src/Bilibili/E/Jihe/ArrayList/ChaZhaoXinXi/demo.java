package Bilibili.E.Jihe.ArrayList.ChaZhaoXinXi;


import java.util.ArrayList;
import java.util.Scanner;

//在main方法里创建一个集合，存入三个用户对象:id username password
//要求：定义一个方法，根据id查找对应的用户信息
//存在返回true,否则返回false
public class demo {
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
        //查找id
        System.out.println("请输入要查找的id(四位数字):");
        Scanner input = new Scanner(System.in);
        String id = input.next();
        boolean result = contains(list, id);
        System.out.println(result);
    }
    public static boolean contains(ArrayList<User> list, String id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
