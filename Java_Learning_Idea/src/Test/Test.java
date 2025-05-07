package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数 m: ");
        int m = scanner.nextInt();

        if (m <= 0) {
            System.out.println("输入的数字必须是正整数。");
        } else {
            List<Integer> factors = findAllFactors(m);
            System.out.println("数 " + m + " 的所有因子是: " + factors);
        }
    }

    // 方法：找到数 m 的所有因子
    public static List<Integer> findAllFactors(int m) {
        List<Integer> factors = new ArrayList<>();
        // 遍历从1到sqrt(m)的所有数字
        for (int i = 1; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                factors.add(i); // 添加因子 i
                if (i != m / i) {
                    factors.add(m / i); // 添加对应的另一个因子
                }
            }
        }
        // 对因子列表进行排序
        factors.sort(Integer::compareTo);
        return factors;
    }
}