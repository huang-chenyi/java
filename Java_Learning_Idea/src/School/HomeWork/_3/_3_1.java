package School.HomeWork._3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //随机点名
        System.out.print("请输入学生人数（2<=N<=10）：");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n < 2 || n > 10) {
            System.out.println("输入人数不符合要求！");
            return;
        }
        List<String> names = new ArrayList<>();
        System.out.println("请输入学生姓名：");
        for (int i = 0; i < n; i++) {
            names.add(scanner.nextLine());
        }
        //随机点名
        Random random = new Random();
        int randomIndex = random.nextInt(n);
        System.out.println("随机点名结果： " + names.get(randomIndex));
        //分组
        System.out.println("\n随机分组");
        System.out.print("请输入每组人数（1<=M<N）：");
        int m = scanner.nextInt();
        scanner.nextLine();
        if (m < 1 || m >= n) {
            System.out.println("输入每组人数不符合要求！");
            return;
        }
        //按字典序排序
        Collections.sort(names);
        List<List<String>> groups = new ArrayList<>();
        //分组
        for (int i = 0; i < n; i += m) {
            groups.add(new ArrayList<>(names.subList(i, Math.min(i + m, n))));
        }
        //输出分组结果
        System.out.println("分组结果：");
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("组 " + (i + 1) + "：" + groups.get(i));
        }
    }
}