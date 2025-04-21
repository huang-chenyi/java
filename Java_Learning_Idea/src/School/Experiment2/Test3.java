package School.Experiment2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String words = input.next();
        //输入数据
        char major = words.charAt(0);
        char grade = words.charAt(1);
        if ((major == 'M' || major == 'C' || major == 'I' || major == 'E') &&
                (grade == '1' || grade == '2' || grade == '3' || grade == '4'))
        {//确定输入数据是否符合规定
            //判断学科
        if(major == 'M')
            System.out.print("Mathematics ");
        else if(major == 'C')
            System.out.print("Computer Science ");
        else if(major == 'I')
            System.out.print("Information Technology ");
        else
            System.out.print("English ");
        //判断年级
        if(grade == '1')
            System.out.println("Freshman");
        else if(grade == '2')
            System.out.println("Sophomore");
        else if(grade == '3')
            System.out.println("Junior");
        else
            System.out.println("Senior");
        }
        else
            System.out.println("Invalid input");
    }
}
