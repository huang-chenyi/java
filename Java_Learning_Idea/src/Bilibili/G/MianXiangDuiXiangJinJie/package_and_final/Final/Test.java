package Bilibili.G.MianXiangDuiXiangJinJie.package_and_final.Final;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*final*//*取消对final的注释后会报错*/ int a = 10;
        a = 12;

        final int b ;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        //b = 12;
        System.out.println(b);

        //final修饰的变量是基本类型：那么变量存储的数据值不能发生改变。
        //final修饰的变量是引用类型(javaBean类型的变量)：那么变量存储的地址值不能发生改变，对象内部的可以改变。
        final TestJavaBean t/*引用类型*/ = new TestJavaBean("name",12);
        t.setName("name2");
        t.setAge(14);
        System.out.println(t.getName() + ", " + t.getAge());
        //t = new TestJavaBean(); //会报错，无法对t之中存储的引用进行改变

        final int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[1]);
        arr[1] = 0;
        System.out.println(arr[1]);
        //arr = new int[10]; //会报错，无法对arr之中存储的引用进行改变
    }
}

/*final*//*取消对final的注释后会报错*/ class Fu{
    public /*final*//*取消对final的注释后会报错*/ void show(){
        System.out.println("Fu类的show方法");
    }
}
class Zi extends Fu{
    @Override
    public void show(){
        System.out.println("Zi类的shou方法");
    }
}