package School.Experiment2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        int lottery = (int)(Math.random() * 1000);
        //int lottery = 345;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick(three digits): ");
        int guess = input.nextInt();
        //拆分随机数
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery / 10 % 10;
        int lotteryDigit3 = lottery % 10;
        //拆分输入数据
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess / 10 % 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is: " + lottery);
        //判断输入数据和随机数对应上的数字位数
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
                (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
                (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
            System.out.println("Match all digits: you win $3,000");
        else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 ||
                guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
                guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 ||
                guessDigit3 == lotteryDigit3)
            System.out.println("Match one or two digits: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
