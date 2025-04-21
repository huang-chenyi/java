//习题2：（搜索最大块） 给定一个元素为0或1的方阵，编写一个程序，找到一个元素都为1的最大的子方阵。
// 程序提示用户输入矩阵的行数。然后显示最大的子方阵的第一个元素位置，以及该子方阵的行数。
// 运行示例如下，其中绿色字体为用户输入。
package School.Experiment3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the square matrix: ");
        int rows = input.nextInt();
        System.out.println("Enter the matrix row by row: ");
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                int lines = 0;
                if (matrix[i][j] == 1) {
                    lines++;
                }

            }
        }

        int[][] dp = new int[rows][rows];
        int sizeMax = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }
                    else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    }
                    if (dp[i][j] > sizeMax) {
                        sizeMax = dp[i][j];
                        row = i;
                        col = j;
                    }
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        //计算左上角坐标位置
        int startRow = row - sizeMax + 1;
        int startCol = col - sizeMax + 1;
        System.out.println("The maximum square submatrix is at (" + startRow + ", " + startCol + ") with size " + sizeMax);
        
    }
}

//import java.util.Scanner;
//
//public class Test2 {
//    public static void main([] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of rows in the square matrix: ");
//        int rows = input.nextInt();
//        System.out.println("Enter Stringthe matrix row by row: ");
//        int[][] matrix = new int[rows][rows];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows; j++) {
//                matrix[i][j] = input.nextInt();
//            }
//        }
//
//        // 动态规划求解最大正方形子矩阵
//        int[][] dp = new int[rows][rows];
//        int maxSize = 0;
//        int maxRow = 0;
//        int maxCol = 0;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows; j++) {
//                if (matrix[i][j] == 1) {
//                    if (i == 0 || j == 0) {
//                        dp[i][j] = 1;
//                    } else {
//                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
//                    }
//                    if (dp[i][j] > maxSize) {
//                        maxSize = dp[i][j];
//                        maxRow = i;
//                        maxCol = j;
//                    }
//                } else {
//                    dp[i][j] = 0;
//                }
//            }
//        }
//
//        // 计算左上角位置
//        int startRow = maxRow - maxSize + 1;
//        int startCol = maxCol - maxSize + 1;
//        System.out.println("The maximum square submatrix is at (" + startRow + ", " + startCol + ") with size " + maxSize);
//    }
//}
