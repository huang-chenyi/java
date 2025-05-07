package School.Experiment5.Test5;
//Number.java
import java.util.ArrayList;
import java.util.Scanner;

public class Number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int num = m;
        //找到m的最小因子并统计每个因子出现的次数
        int n = 1;
        //存储因子
        ArrayList<Integer> list_num = new ArrayList<>();
        //存储对应的因子出现的次数
        ArrayList<Integer> list_count = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            //将因子加入数组列表
            list_num.add(i);
            list_count.add(count);
        }
        for (int i = 0; i < list_num.size(); i++) {
            //若因子出现次数为奇数次，则乘到n中
            if (list_count.get(i) % 2 != 0) {
                n *= i + 2;
            }
        }
        //输出结果
        System.out.println("The smallest number n for m*n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }
}
