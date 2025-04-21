package School.Experiment3;

import java.util.Scanner;
//要求按照升序排序
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //读取数组
        System.out.println("Enter the size of the list:");
        int size = input.nextInt();
        System.out.println("Enter the contents of the list:");
        int [] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        //调用判断方法
        boolean result = isSorted(list);
        //输出结果
        System.out.print("The list has " + size + " integers ");
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();
        if (result) {
            System.out.println("The list is already Sorted");
        }
        else {
            System.out.println("The list is not Sorted");
        }
    }
    public static boolean isSorted(int[] list){
        int min = list[0];
        for (int i:list) {
            if(min > i) {
                return false;
            }
            min = i;
        }
        //未发现排序不对的部分
        return true;
    }
}


