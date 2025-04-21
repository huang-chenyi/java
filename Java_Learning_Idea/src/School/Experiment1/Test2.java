package School.Experiment1;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        System.out.println("Please input your name:");
        Scanner input = new Scanner(System.in);
        String yourName = input.next();
        System.out.println("Hello," + yourName + "!");
    }
}