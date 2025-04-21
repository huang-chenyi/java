package School.HomeWork._2;

import java.util.Scanner;

public class _2_1 {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int max = number;
//        int min = number;
        int count = 1;
        while(true){
            if(number == 0)
                break;
            if(number > max) {
                max = number;
                count = 1;
            }
            else if(number == max) {
                count++;
            }
//            if(number < min) {
//                min = number;
//            }
            number = input.nextInt();
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
//        System.out.println("The smallest number is " + min);
    }
}
