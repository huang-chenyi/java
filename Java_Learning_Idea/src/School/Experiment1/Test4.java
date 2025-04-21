package School.Experiment1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱体的半径和高:");
        double length = input.nextDouble();
        double high = input.nextDouble();
        double S = 3.14159265359 * length * length;
        double V = S * high;
        System.out.println("圆柱的底面积是:" + S );
        System.out.println("圆柱的体积是:" + V);
    }
}
