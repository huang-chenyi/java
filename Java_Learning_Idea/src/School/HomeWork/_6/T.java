package School.HomeWork._6;

import java.util.*;

public class T {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a String:");
        String str = input.nextLine(); //代码1
        String result = removeDupChars(str);
        System.out.println("After duplicate characters are deleted, the new string is");
        System.out.println(result); //代码2
    }

    public static String removeDupChars(String str) {
        StringBuffer buffer = new StringBuffer();
        char[] charArray = str.toCharArray(); //代码3
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length;) {
            buffer.append(charArray[i]);
            int j = i;
            for (; j < charArray.length && charArray[i] == charArray[j]; j++);
            i = j; //代码4
        }
        return buffer.toString(); //代码5
    }
}