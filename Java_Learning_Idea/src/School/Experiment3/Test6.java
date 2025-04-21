package School.Experiment3;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    private static int points = 100000; // 用户积分
    private static String[][] cart = new String[50][3]; // 购物车数组
    private static int cartSize = 0; // 购物车中商品的数量
    private static double discountAmount = 0.0; // 折扣金额
    private static String username = ""; // 用户名
    private static String password = ""; // 密码
    private static boolean isLoggedIn = false; // 登录状态

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu(input);  // 引用menu方法开始输出登录菜单
    }

    // 编写登录页面方法
    public static void menu(Scanner input) {
        System.out.println("欢迎登录MyShop购物管理系统！");
        System.out.println("*************************");
        System.out.println("1.登录系统");
        System.out.println("2.注册用户");
        System.out.println("3.退出");
        System.out.println("*************************");
        System.out.println("请选择操作(1,2,3):");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                login(input);
                break;
            case 2:
                register(input);
                break;
            case 3:
                System.out.println("退出系统！");
                break;
            default:
                System.out.println("无效选择，请重试！");
                menu(input);
                break;
        }
    }

    // 用户注册方法
    public static void register(Scanner input) {
        System.out.println("用户注册");
        System.out.println("*************************");
        System.out.println("请输入用户名:");
        String newUsername = input.next();
        System.out.println("请输入密码:");
        String newPassword = input.next();

        // 检查用户名是否已存在
        if (username.equals(newUsername)) {
            System.out.println("用户名已存在，请重新注册！");
            menu(input);
            return;
        }

        // 保存用户信息
        username = newUsername;
        password = newPassword;
        System.out.println("注册成功！");
        menu(input);
    }

    // 用户登录方法
    public static void login(Scanner input) {
        System.out.println("用户登录");
        System.out.println("*************************");
        System.out.println("请输入用户名:");
        String inputUsername = input.next();
        System.out.println("请输入密码:");
        String inputPassword = input.next();

        // 验证用户名和密码
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            // 验证码生成和验证
            String pin = VerificationCode.setRandomPin();
            System.out.println("请输入验证码 (" + pin + "):");
            String userPin = input.next();

            if (VerificationCode.isValidPin(pin, userPin)) {
                isLoggedIn = true;
                System.out.println("登录成功！");
                xiTongGuanLi(input);
            } else {
                System.out.println("验证码错误，请重新登录！");
                login(input);
            }
        } else {
            System.out.println("用户名或密码错误，请重新输入！");
            menu(input);
        }
    }

    // 编写管理系统页面方法
    public static void xiTongGuanLi(Scanner input) {
        if (!isLoggedIn) {
            System.out.println("请先登录！");
            menu(input);
            return;
        }

        System.out.println("欢迎使用MyShop购物管理系统！");
        System.out.println("*************************");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.积分优惠");
        System.out.println("4.注销");
        System.out.println("*************************");
        System.out.println("请选择操作(1,2,3,4):");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                keHuXinXiGuanLi(input);
                break;
            case 2:
                gouWuJieSuan(input);
                break;
            case 3:
                jiFenYouHui(input);
                break;
            case 4:
                isLoggedIn = false;
                System.out.println("已注销！");
                menu(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                xiTongGuanLi(input);
                break;
        }
    }

    // 编写客户信息管理页面方法
    public static void keHuXinXiGuanLi(Scanner input) {
        System.out.println("客户信息管理！");
        System.out.println("*************************");
        System.out.println("1.查看个人信息");
        System.out.println("2.返回");
        System.out.println("*************************");
        System.out.println("请选择操作(1,2):");
        int choice = input.nextInt();
        // 初始化用户信息
        String name = username;
        int money = 10000;
        switch (choice) {
            case 1:
                chaKanGeRenXinxi(input, name, money);
                break;
            case 2:
                xiTongGuanLi(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                menu(input);
                break;
        }
    }

    // 编写查看个人信息页面方法
    public static void chaKanGeRenXinxi(Scanner input, String name, int money) {
        System.out.println("查看个人信息！");
        System.out.println("*************************");
        System.out.println("用户名:" + name);
        System.out.println("余额:" + money);
        System.out.println("*************************");
        keHuXinXiGuanLi(input);
    }

    // 编写购物结算页面方法
    public static void gouWuJieSuan(Scanner input) {
        System.out.println("购物结算！");
        System.out.println("*************************");
        System.out.println("1.添加商品");
        System.out.println("2.查看购物车");
        System.out.println("3.应用折扣");
        System.out.println("4.完成结算");
        System.out.println("5.返回");
        System.out.println("*************************");
        System.out.println("请选择操作(1,2,3,4,5):");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("请输入商品名称:");
                String productName = input.next();
                System.out.println("请输入商品价格:");
                String productPrice = input.next();
                System.out.println("请输入商品数量:");
                String productQuantity = input.next();
                // 将商品信息添加到购物车数组中
                cart[cartSize][0] = productName;
                cart[cartSize][1] = productPrice;
                cart[cartSize][2] = productQuantity;
                cartSize += 1;
                System.out.println(productName + " 已加入购物车！");
                gouWuJieSuan(input);
                break;
            case 2:
                System.out.println("**********购物车**********");
                double total = 0.0;
                for (int i = 0; i < cartSize; i++) {
                    System.out.println("商品名称:" + cart[i][0] + " 单价:" + cart[i][1] + "元 数量:" + cart[i][2] + " 金额:" + (Double.parseDouble(cart[i][1]) * Integer.parseInt(cart[i][2])) + "元");
                    total += Double.parseDouble(cart[i][1]) * Integer.parseInt(cart[i][2]);
                }
                System.out.println("总计：￥" + total);
                gouWuJieSuan(input);
                break;
            case 3:
                System.out.println("请输入要使用的优惠券金额：");
                discountAmount = input.nextDouble();
                System.out.println("已应用 " + discountAmount + " 元折扣！");
                gouWuJieSuan(input);
                break;
            case 4:
                System.out.println("**********购物小票**********");
                double totalAmount = 0.0; // 消费总金额
                for (int i = 0; i < cartSize; i++) {
                    double price = Double.parseDouble(cart[i][1]);
                    int quantity = Integer.parseInt(cart[i][2]);
                    double amount = price * quantity; // 商品金额
                    totalAmount += amount;
                    System.out.println("商品名称:" + cart[i][0] + " 单价:" + price + "元 数量:" + quantity + " 金额:" + amount + "元");
                }
                System.out.println("消费总金额: ￥" + totalAmount);
                System.out.println("总折扣: ￥" + discountAmount);
                double actualPayment = totalAmount - discountAmount;
                System.out.println("实际缴费: ￥" + actualPayment);
                // 计算积分
                int newPoints = (int) (actualPayment / 100) * 3;
                points += newPoints;
                System.out.println("获得积分: " + newPoints);
                System.out.println("当前总积分: " + points);
                System.out.println("结算成功！感谢您的购物！");
                // 清空购物车
                cartSize = 0;
                // 重置折扣
                discountAmount = 0.0;
                xiTongGuanLi(input);
                break;
            case 5:
                xiTongGuanLi(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                gouWuJieSuan(input);
                break;
        }
    }

    // 编写积分优惠页面方法
    public static void jiFenYouHui(Scanner input) {
        System.out.println("积分优惠！");
        System.out.println("*************************");
        System.out.println("1.查看积分余额");
        System.out.println("2.使用积分兑换优惠券");
        System.out.println("3.返回");
        System.out.println("*************************");
        System.out.println("请选择操作(1,2,3):");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("当前积分余额：" + points);
                jiFenYouHui(input);
                break;
            case 2:
                System.out.println("请输入要兑换的优惠券金额：");
                double amount = input.nextDouble();
                // 每100积分可以兑换1元优惠券
                if (points >= amount * 100) {
                    points -= (int) (amount * 100);
                    System.out.println("成功使用 " + (amount * 100) + " 积分兑换 " + amount + " 元优惠券！");
                } else {
                    System.out.println("积分不足，无法兑换！");
                }
                jiFenYouHui(input);
                break;
            case 3:
                xiTongGuanLi(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                jiFenYouHui(input);
                break;
        }
    }
}

// 验证码类
class VerificationCode {
    // 生成随机4位验证码
    public static String setRandomPin() {
        StringBuilder pin = new StringBuilder();
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(chars.length());
            pin.append(chars.charAt(index));
        }
        return pin.toString();
    }

    // 验证用户输入的验证码是否正确
    public static boolean isValidPin(String s1, String s2) {
        return s1.equals(s2);
    }
}