package School.Experiment2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份: ");
        int year = scanner.nextInt();
        System.out.print("请输入该年第一天是星期几的数字: ");
        int firstDay = scanner.nextInt();
        // 每个月的天数
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 判断是否是闰年,并对闰年是的二月进行单独处理
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            monthDays[1] = 29;
        }
        // 打印每个月的日历
        for (int i = 0; i < 12; i++) {
            String[] months = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            System.out.println("\n" + "      " + months[i] + " " + year);
            System.out.println("———————————————————————————");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            // 计算每个月的第一天是星期几
            int usingDay = (firstDay + monthSumDays(i, monthDays)) % 7;
            // 打印前面的空格
            for (int j = 0; j < usingDay; j++) {
                System.out.print("\t");
            }
            // 打印日期
            for (int day = 1; day <= monthDays[i]; day++) {
                System.out.print(day + "\t");
                if ((usingDay + day) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    // 计算前几个月的总天数
    public static int monthSumDays(int monthIndex, int[] daysInMonth) {
        int sum = 0;
        for (int i = 0; i < monthIndex; i++) {
            sum += daysInMonth[i];
        }
        return sum;
    }
}
