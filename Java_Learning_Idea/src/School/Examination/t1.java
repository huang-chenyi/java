package School.Examination;

import java.util.Scanner;

public class t1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入矩阵大小
        System.out.println("Please input n: ");
        int n = scanner.nextInt();

        // 检查输入是否在有效范围内
        if (n < 3 || n > 10) {
            System.out.println("Invalid input. Please ensure 3 <= n <= 10.");
            return;
        }

        // 初始化矩阵
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (i * n) + j + 1;
            }
        }

        // 输出原始矩阵
        System.out.println("An original matrix (" + n + "*" + n + ") is: ");
        printMatrix(matrix);

        // 旋转矩阵90度顺时针
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("The rotated matrix (" + n + "*" + n + ") is: ");
        printMatrix(rotatedMatrix);

        // 只保留最外层一圈元素
        int[][] outerLayerMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 保留最外层一圈元素
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    outerLayerMatrix[i][j] = rotatedMatrix[i][j];
                }
            }
        }

        System.out.println("The final matrix (" + n + "*" + n + ") is: " );
        printMatrix(outerLayerMatrix);
    }
    // 打印矩阵
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0) {
                    System.out.print(element + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}


