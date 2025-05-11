package School.Examination;

import java.util.Scanner;


public class test1{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please input n: ");

        int n = input.nextInt();



        if(n < 3 || n > 10){

            System.out.println("3<=N<=10");

            return;

        }

        //生成矩阵

        int[][] matrix = new int[n][n];

        for(int i = 0; i <n; i++){

            for(int j = 0; j < n; j++){

                matrix[i][j] = (i * n) + j + 1;

            }

        }



        //输出初始矩阵

        System.out.println("An original matrix (" + n + "*" + n + ") is: ");

        printMatrix(matrix);



        //旋转矩阵

        int[][] matrix2 = new int[n][n];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                matrix2[j][n - 1 - j] = matrix[i][j];

            }

        }

        //输出

        System.out.println("The rotated matrix (" + n + "*" + n + ") is: ");

        printMatrix(matrix2);



        //去除中心元素

        int[][] matrix3 = new int[n][n];

        for(int i = 0; i < n; i++){

           for(int j = 0; j < n;j++){

               if(i == 0 || i == n -1 || j == 0 || j == n - 1){

                    matrix3[i][j] = matrix2[i][j];

                }
           }

        }

        //输出

        System.out.println("The final matrix (" + n + "*" + n + ") is: " );

        printMatrix(matrix3);

    }

    //打印矩阵方法

            public static void printMatrix(int[][] matrix){

        for(int[] row : matrix){

            for(int element : row){

               if(element != 0){

                   System.out.print(element + " ");

               }

                else
                        System.out.println("  ");

            }

            System.out.println();

        }

    }

}
