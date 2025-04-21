package School.Experiment3;

import java.util.Scanner;

public class Test_other1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入文本
        System.out.println("请输入文本（不超过100个单词）:");
        String text = input.nextLine();
        //输入需要替换的单词
        System.out.println("请输入需要被替换的单词:");
        String oldWord = input.next();
        //输入替换的单词
        System.out.println("请输入替换的单词:");
        String newWord = input.next();
        //替换文本中的单词
        String replacedText = replaceWord(text, oldWord, newWord);
        //输出结果
        System.out.println("替换结果是:");
        System.out.println(replacedText);
    }
    //替换文本中的单词
    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }
}