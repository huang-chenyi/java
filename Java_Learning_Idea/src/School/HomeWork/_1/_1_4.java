package School.HomeWork._1;

import java.util.Scanner;

public class _1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int b = input.nextInt();
        System.out.println("Enter a denominator: ");
        int c = input.nextInt();
        int a = 0;
        if(b == c)
            System.out.println(b + " / " + c + " is an improper fraction and it can be reduced to 1");
         else if (b > c) {
            System.out.print(b + " / " + c + " is an improper fraction ");
            while(b >= c){
                b -= c;
                a++;
            }
            if(b != 0)
                System.out.println("and its mixed fraction is " + a + " + " + b + " / " + c);
            else
                System.out.println("and it can be reduced to " + a);
        }
        else
            System.out.println(b + " / " + c + " is a proper fraction");
    }
}


//编写程序，提示用户输入分数的分子和分母，判断它是真分数还是假分数。对于假分数，当b % c不为零时，以a + b / c的形式显示其带分数;否则，只显示整数。举例如下：

//Sample 1:
//Enter a numerator: 16
//Enter a denominator: 3
//16 / 3 is an improper fraction and its mixed fraction is 5 + 1 / 3.

//Sample 2:
//Enter a numerator: 6
//Enter a denominator: 7
//6 / 7 is a proper fraction

//Sample 3:
//Enter a numerator: 6
//Enter a denominator: 2
//6 / 2 is an improper fraction and it can be reduced to 3