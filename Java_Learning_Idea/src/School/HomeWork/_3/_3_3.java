package School.HomeWork._3;

import java.util.Arrays;
import java.util.Scanner;

public class _3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入 n
        System.out.print("Enter n: ");
        int n = input.nextInt();
        //输入矩阵 m1
        System.out.println("Enter m1 (a " + n + " by " + n + " matrix) row by row:");
        int[][] m1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        //输入矩阵 m2
        System.out.println("Enter m2 (a " + n + " by " + n + " matrix) row by row:");
        int[][] m2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = input.nextInt();
            }
        }
        //判断并输出结果
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
        input.close();
    }
    //判断两个二维数组是否相同
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        //逐个元素比较
        m1 = Sort(m1);
        m2 = Sort(m2);
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    //二维数组排序
    public static int[][] Sort(int [][] n) {
        //展开成一维数组
        int[] number = new int[n.length * n[0].length];
        int num = 0;
        for (int[] row : n) {
            for (int line : row) {
                number [num++] = line;
            }
        }
        //排序一维数组
        Arrays.sort(number );
        //重新构造成二维数组
        int[][] newnumber = new int[n.length][n[0].length];
        num = 0;
        for (int i = 0; i < newnumber.length; i++) {
            for (int j = 0; j < newnumber[i].length; j++) {
                newnumber[i][j] = number [num++];
            }
        }
        return newnumber;
    }

}
