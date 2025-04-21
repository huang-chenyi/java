package Bilibili.Z.NoteBook;

import java.util.Scanner; // 基础的输入语句前置要求语句（导包）

public class Basic {
//main方法
    public static void main(String[] args) { // 基础的main方法

        System.out.println("请输入a的值: "); // 基础的输出语句

        Scanner input = new Scanner(System.in); // 基础的输入语句前置要求语句

        int a = input.nextInt(); // 基础的输入语句

        fangFaMing(); // 无返回值方法的使用

        System.out.println(sum(1,2)); // 有返回值的方法的使用

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};/*java中数组的定义方式*/int from = 3;int to = 6;

        int[] copyArr = copyOfRange(arr, from, to); // 参数及返回值为数组的方法的使用

    }
//其他方法
    public static void fangFaMing() { // 无返回值方法的定义及编写
        System.out.println("方法的使用");
    }

    public static int sum (int a, int b){ // 有返回值方法的定义及编写
        return a+b;
    }

    public static int[]/*返回值包含数组，需要中括号[]*/ copyOfRange(int[] arr, int from, int to) { // 参数及返回值含数组的方法的定义及编写
        int[] arrNew = new int[to - from + 1]; //java中数组的定义方式
        int k = 0;
        for (int i = from; i < to + 1; i++) {
            arrNew[k++] = arr[i];
        }
        return arrNew; // 返回数组时无需加上[]
    }

}
