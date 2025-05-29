package Test;

import java.util.Scanner;

public class Circle {
        public static void main(String[] args) {
                double u;
                Scanner sc = new Scanner(System.in);
                u = sc.nextDouble();
                double d = 3.496 + 3.320;
                double k = 836.00583;
                double pi = 3.14159265358979;
                double a = u / (k * pi * d);
                double f = u / k;
                System.out.println(f);
                System.out.println(a);

        }
}