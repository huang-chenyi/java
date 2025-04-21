package Bilibili.E.Jihe.ArrayList.BianLiJiHe;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Character> list = new ArrayList<>();

        //添加元素(字符)
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

        System.out.println(list);
        //遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            }
            else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
