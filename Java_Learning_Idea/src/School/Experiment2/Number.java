package School.Experiment2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int number = 0, d5, d4, d3, d2, d1;
        Scanner reader = new Scanner(System.in);
        System.out.println("输入一个1至99999之间的数");
        number = reader.nextInt();
        if( number >= 1 && number <= 99999/*代码1*/){
            d5 = number / 10000;// 代码2
            d4 = number / 1000 % 10;// 代码3
            d3 = number / 100 % 10;// 代码4
            d2 = number % 100 / 10;
            d1 = number % 10;
            if( d5 != 0/*代码5*/){
                System.out.println(number + "是5位数");
                if( d5 == d1 && d4 == d2/*代码6*/)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d4 != 0/*代码7*/){
                System.out.println(number + "是4位数");
                if( d4 == d1 && d3 == d2/*代码8*/)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d3 != 0/*代码9*/){
                System.out.println(number + "是3位数");
                if(d3 == d1/*代码10*/)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d2 != 0){
                System.out.println(number + "是2位数");
                if( d1 == d2)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d1 != 0){
                System.out.println(number + "是1位数");
                System.out.println(number + "是回文数");
            }
        }
        else
            System.out.printf("\n%d不在1至99999之间",number);
    }
}
