package School.HomeWork._1;

import java.util.Scanner;

public class _1_3 {
    public static void main(String[] args){
        System.out.println("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        if (Math.abs(x) <= 5 && Math.abs(y) <= 2.5)
            System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        else
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
    }
}
