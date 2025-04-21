package School.Experiment2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入数据
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        char ch = month.charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            int month_number;
            int February_number;
            //判断是闰年还是平年，并为2月赋值
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                February_number = 28;
            else
                February_number = 27;
            //switch语句判断月份
            month_number = switch (month) {
                case "January", "March", "May", "July", "August", "October", "December" -> 31;
                case "April", "June", "September", "November" -> 30;
                case "February" -> February_number;
                default -> 0;
            };
            if (month_number != 0)
                System.out.println(month + " " + year + " has " + month_number + " days");
            else
                System.out.println(month + " is not a correct month name");
        }
        else
            System.out.println(month + " is not a correct month name");
    }
}
