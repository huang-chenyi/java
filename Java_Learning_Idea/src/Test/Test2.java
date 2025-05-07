package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int num = m;
        //找到m的最小因子并统计每个因子出现的次数
        int n = 1;
        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            // 如果因子出现次数为奇数次，则乘到n中
            if (count % 2 != 0) {
                n *= i;
            }
        }

        // 输出结果
        System.out.println("The smallest number n for m*n to be a perfect square is " + n);
        System.out.println("m*n is " + (m * n));
    }
}