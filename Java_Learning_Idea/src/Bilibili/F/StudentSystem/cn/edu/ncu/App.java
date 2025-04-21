package Bilibili.F.StudentSystem.cn.edu.ncu;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码");
            String choose = input.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }

        }

    }


    //登录
    private static void login(ArrayList<User> list) {

    }


    //注册
    private static void register(ArrayList<User> list) {
        Scanner input = new Scanner(System.in);
        String userName;
        String password;
        String personId;
        String phoneNumber;
        while(true){
            System.out.println("请输入用户名：");
            userName = input.next();
            boolean flag1 = checkUserName(userName);
            if (!flag1) {
                System.out.println("用户名格式错误，请重新输入");
                continue;
            }
            int flag2 = contains(list,userName);
            if (flag2 != -1) {
                System.out.println("用户名" + userName + "已存在，请重新输入");
            }
            else {
                System.out.println("当前用户名" + userName + "可用");
                break;
            }
        }
        while(true){
            System.out.println("请输入要注册的密码");
            password = input.next();
            System.out.println("请再次输入要注册的密码");
            String againPassword = input.next();
            if(!password.equals(againPassword)){
                System.out.println("两次输入的密码不一致，请重新输入");
            }
            else{
                System.out.println("密码录入成功");
                break;
            }
        }
        while(true){
            System.out.println("请输入身份证号码");
            personId = input.next();
            boolean flag = checkPersonId(personId);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            }
            else {
                System.out.println("身份证号码有误，请重新输入");
            }
        }
        while(true){
            System.out.println("请输入手机号码");
            phoneNumber = input.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            }
            else {
                System.out.println("手机号码格式错误，请重新输入");
            }
        }
        User u = new User(userName,password,personId,phoneNumber);
        list.add(u);
        System.out.println("注册成功");
    }
    //检验用户名是否符合规则
    private static boolean checkUserName(String userName) {
        int len = userName.length();
        if(len < 3 || len > 15){
            return false;
        }
        for(int i = 0; i < len; i++){
            char ch = userName.charAt(i);
            if(!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ||
                    ch >= '0' && ch <= '9')){
                return false;
            }
        }
        int count = 0;
        for(int i = 0; i < len; i++){
            char ch = userName.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                count++;
                break;
            }
        }
        return count > 0;
    }
    //检验用户名是否唯一
    private static int contains(ArrayList<User> list, String userName) {
        for(int i = 0; i < list.size(); i++){
            User user = list.get(i);
            String rightUserName = user.getUsername();
            if(rightUserName.equals(userName)){
                return i;
            }
        }
        return -1;
    }
    //检验身份证号码是否符合规则
    private static boolean checkPersonId(String personId) {
        if(personId.length() != 18){
            return false;
        }
        boolean flag = personId.startsWith("0");
        if(flag){
            return false;
        }
//        char c = personId.charAt(0);
//        if(c == '0'){
//            return false;
//        }
        for (int i = 0; i < personId.length() - 1; i++) {
            char ch = personId.charAt(i);
            if(!(ch >= '0' && ch <= '9')){
                return false;
            }
        }
        char endChar = personId.charAt(personId.length() - 1);
//        if((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')){
//            return true;
//        }
//        else{
//            return false;
//        }
        return (endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X');
    }
    //检验手机号是否符合规则
    private static boolean checkPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 11){
            return false;
        }
        if(phoneNumber.startsWith("0")){
            return false;
        }
        for(int i = 0; i < phoneNumber.length(); i++){
            char ch = phoneNumber.charAt(i);
            if(!(ch >= '0' && ch <= '9')){
                return false;
            }
        }
        return true;
    }


    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {

    }
}
