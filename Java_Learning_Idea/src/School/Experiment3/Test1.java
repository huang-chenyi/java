//习题1：（密码检测）一些网站在用户注册设定密码时需遵循一些规则。编写一个方法，检测字符串是否是一个有效密码。假设密码规则如下：
//（1） 密码必须至少8位字符。 √
//（2） 密码仅能包含字母、数字和下划线。  √
//（3） 密码必须包含至少两个数字。
//编写一个程序，提示用户输入一个密码，如果符合规则，则显示Valid Password，否则显示Invalid Password。
package School.Experiment3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Please enter a password: ");
        Scanner input = new Scanner(System.in);
        // 读取并存储密码
        char[] password = input.nextLine().toCharArray();
        // 调用方法判断
        boolean answer = exam(password);
        // 输出结果语句
        if (answer)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    // 判断方法
    public static boolean exam(char[] password){
        if (password.length < 8){ // 密码必须至少8位字符。
            System.out.println("Please enter at least 8 characters! ");
            return false;
        }
        else{
            int number = 0;
            for (int i = 0; i < password.length; i++){ // 密码仅能包含字母、数字和下划线。
                if (password[i] >= 'A' && password[i] <= 'Z' || password[i] >= 'a' && password[i] <= 'z'|| password[i] >= '0' && password[i] <= '9'|| password[i] == '_'){
                    if ( password[i] >= '0' && password[i] <= '9'){
                        number++; // 密码必须包含至少两个数字。
                    }
                }
                else
                    return false;
            }
            if (number >= 2)
                return true;
            else
                return false;
        }
    }
}
