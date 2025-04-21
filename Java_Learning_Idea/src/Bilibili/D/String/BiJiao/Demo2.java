package Bilibili.D.String.BiJiao;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        //串池中无"abac",s1被创建在串池中
        //创建s2时，串池中存在"abc",s2直接引用s1的内容，地址值相同

        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s4 == s3);//false
        //s3记录的是堆里的地址
        //s4记录的是串池里的地址

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = input.next();//abc
        String str2 = "abc";
        System.out.println(str1 == str2);//false
        

    }
}
