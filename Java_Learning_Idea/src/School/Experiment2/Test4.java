package School.Experiment2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int lines = input.nextInt();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < (lines - 1) * 3 - i * 3; j++)
                System.out.print(" ");//输出每行对应的空格，使整体呈现金字塔形
            //左半边
            for (int k = i + 1; k > 0; k--) {
                if (k > 9)
                    System.out.print(k + " ");
                else
                    System.out.print(k + "  ");
            }
            //右半边
            for (int l = 2; l <= i + 1; l++) {
                if (l > 9)
                    System.out.print(l + " ");
                else
                    System.out.print(l + "  ");
            }
            System.out.println();
        }
    }
}
