package School.HomeWork._1;

import java.util.Scanner;
public class _1_1 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
