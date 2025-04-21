package Bilibili.D.String.moneyChange;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //录入金额
        Scanner input = new Scanner(System.in);
        int money;
        while(true){
            System.out.println("请录入一个金额:");
            money = input.nextInt();
            if(money >= 0){
                break;
            }
            else {
                System.out.println("金额无效!");
            }
        }
        String chineseNumber = "";
        //获取money中每一位的数字
        do {
            int num = money % 10;
            String str = changeNumber(num);
            //依次拼接
            chineseNumber = str + chineseNumber;
            //chineseNumber = chineseNumber + str;
            money = money / 10;
        } while (money != 0);
        System.out.println(chineseNumber);

        String finalChineseNumber = "";
        int zero = 0;
        String[] danWei = {"万","仟","佰","拾","万","仟","佰","拾","元"};
        int j = 9 - chineseNumber.length();
        for(int i = 0; i < chineseNumber.length(); i++,j++){
            char ch = chineseNumber.charAt(i);
            //避免 零 的重复出现   ！！！100100100无法处理！！！
            if(ch == '零'){
                zero++;
                if(zero <= 1){
                    finalChineseNumber = finalChineseNumber + danWei[j] + ch;
                }
                else {
                    continue;
                }
            }
            //正常情况
            else {
                finalChineseNumber = finalChineseNumber + ch + danWei[j];
            }
            if(ch == ' '){
                break;
            }
        }
        System.out.println(finalChineseNumber);
    }
    public static String changeNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
