package School.HomeWork._6;

import java.util.Random;
import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:"); //输入矩阵的大小
        int n = input.nextInt(); //读取输入的矩阵大小
        int[][] matrix = generateMatrix(n);
        displayMatrix(matrix, n); //显示生成的矩阵
        countOnes(matrix, n); //统计每行每列以及对角线上1的个数
    }
    //生成一个nxn的矩阵
    public static int[][] generateMatrix(int n) {
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2); //生成0或1
            }
        }
        return matrix;
    }
    //显示矩阵
    public static void displayMatrix(int[][] matrix, int n) {
        System.out.println("The matrix (" + n + " * " + n + ") is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); //打印矩阵的每个元素
            }
            System.out.println();
        }
    }

    //统计每行每列以及对角线上1的个数
    public static void countOnes(int[][] matrix, int n) {
        int[] rowCounts = new int[n]; //每行1的个数
        int[] colCounts = new int[n]; //每列1的个数
        int diagonalCount = 0; //主对角线1的个数
        int backDiagonalCount = 0; //副对角线1的个数

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rowCounts[i]++;
                    colCounts[j]++;
                    if (i == j) {
                        diagonalCount++;
                    }
                    if (i + j == n - 1) {
                        backDiagonalCount++;
                    }
                }
            }
        }

        System.out.println("Each row counts(only 1):   ");
        for (int count : rowCounts) {
            System.out.print(count + " "); //打印每行1的个数
        }
        System.out.println();

        System.out.println("Each column counts(only 1): ");
        for (int count : colCounts) {
            System.out.print(count + " "); //打印每列1的个数
        }
        System.out.println();

        System.out.println("Is the number of 1's on the diagonal of the matrix equal to " + n + "?");
        System.out.println(diagonalCount == n); //检查主对角线上1的个数是否等于n

        System.out.println("Is the number of 1's on the back diagonal of the matrix equal to " + n + "?");
        System.out.println(backDiagonalCount == n); //检查副对角线上1的个数是否等于n
    }
}