package School.Experiment4.MyShop;

import java.util.Scanner;

public class MyShop {
    private static User currentUser;
    private static Cart cart = new Cart();
    private static double discountAmount = 0.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu(input);
    }

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
    public static void register(Scanner input) {
        System.out.println("用户注册");
        System.out.println("*************************");
        System.out.println("请输入用户名:");
        String newUsername = input.next();
        System.out.println("请输入密码:");
        String newPassword = input.next();

        // 检查用户名是否已存在
        if (currentUser != null && currentUser.getUsername().equals(newUsername)) {
            System.out.println("用户名已存在，请重新注册！");
            menu(input);
            return;
        }

        // 保存用户信息
        currentUser = new User(newUsername, newPassword);
        System.out.println("注册成功！");
        menu(input);
    }

    public static void login(Scanner input) {
        System.out.println("用户登录");
        System.out.println("*************************");
        System.out.println("请输入用户名:");
        String inputUsername = input.next();
        System.out.println("请输入密码:");
        String inputPassword = input.next();

        // 验证用户名和密码
        if (currentUser != null && currentUser.getUsername().equals(inputUsername) && currentUser.getPassword().equals(inputPassword)) {
            // 验证码生成和验证
            String pin = Captcha.setRandomPin();
            System.out.println("请输入验证码 (" + pin + "):");
            String userPin = input.next();

            if (Captcha.isValidPin(pin, userPin)) {
                System.out.println("登录成功！");
                systemManagement(input);
            } else {
                System.out.println("验证码错误，请重新登录！");
                login(input);
            }
        } else {
            System.out.println("用户名或密码错误，请重新输入！");
            menu(input);
        }
    }

    public static void systemManagement(Scanner input) {
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
                customerInformationManagement(input);
                break;
            case 2:
                shoppingSettlement(input);
                break;
            case 3:
                pointsDiscount(input);
                break;
            case 4:
                currentUser = null;
                System.out.println("已注销！");
                menu(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                systemManagement(input);
                break;
        }
    }

    public static void customerInformationManagement(Scanner input) {
        System.out.println("客户信息管理！");
        System.out.println("*************************");
        System.out.println("1.查看个人信息");
        System.out.println("2.返回");
        System.out.println("*************************");
        System.out.println("请选择操作(1,2):");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                viewPersonalInformation(input);
                break;
            case 2:
                systemManagement(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                customerInformationManagement(input);
                break;
        }
    }

    public static void viewPersonalInformation(Scanner input) {
        System.out.println("查看个人信息！");
        System.out.println("*************************");
        System.out.println("用户名:" + currentUser.getUsername());
        System.out.println("余额:" + currentUser.getBalance());
        System.out.println("积分:" + currentUser.getPoints());
        System.out.println("*************************");
        customerInformationManagement(input);
    }

    public static void shoppingSettlement(Scanner input) {
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
                double productPrice = input.nextDouble();
                System.out.println("请输入商品数量:");
                int productQuantity = input.nextInt();
                cart.addProduct(new Product(productName, productPrice, productQuantity));
                System.out.println(productName + " 已加入购物车！");
                shoppingSettlement(input);
                break;
            case 2:
                System.out.println("**********购物车**********");
                double total = cart.getTotalAmount();
                for (Product product : cart.getProducts()) {
                    System.out.println("商品名称:" + product.getName() + " 单价:" + product.getPrice() + "元 数量:" + product.getQuantity() + " 金额:" + (product.getPrice() * product.getQuantity()) + "元");
                }
                System.out.println("总计：￥" + total);
                shoppingSettlement(input);
                break;
            case 3:
                System.out.println("请输入要使用的优惠券金额：");
                discountAmount = input.nextDouble();
                System.out.println("已应用 " + discountAmount + " 元折扣！");
                shoppingSettlement(input);
                break;
            case 4:
                double totalAmount = cart.getTotalAmount();
                double actualPayment = totalAmount - discountAmount;
                if (actualPayment > currentUser.getBalance()) {
                    System.out.println("余额不足，无法完成结算！");
                } else {
                    System.out.println("**********购物小票**********");
                    for (Product product : cart.getProducts()) {
                        System.out.println("商品名称:" + product.getName() + " 单价:" + product.getPrice() + "元 数量:" + product.getQuantity() + " 金额:" + (product.getPrice() * product.getQuantity()) + "元");
                    }
                    System.out.println("消费总金额: ￥" + totalAmount);
                    System.out.println("总折扣: ￥" + discountAmount);
                    System.out.println("实际缴费: ￥" + actualPayment);
                    currentUser.setBalance(currentUser.getBalance() - actualPayment);
                    int newPoints = (int) (actualPayment / 100) * 3;
                    currentUser.setPoints(currentUser.getPoints() + newPoints);
                    System.out.println("获得积分: " + newPoints);
                    System.out.println("当前总积分: " + currentUser.getPoints());
                    System.out.println("结算成功！感谢您的购物！");
                    cart.clearCart();
                    discountAmount = 0.0;
                }
                systemManagement(input);
                break;
            case 5:
                systemManagement(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                shoppingSettlement(input);
                break;
        }
    }

    public static void pointsDiscount(Scanner input) {
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
                System.out.println("当前积分余额：" + currentUser.getPoints());
                pointsDiscount(input);
                break;
            case 2:
                System.out.println("请输入要兑换的优惠券金额：");
                double amount = input.nextDouble();
                if (currentUser.getPoints() >= amount * 100) {
                    currentUser.setPoints(currentUser.getPoints() - (int) (amount * 100));
                    System.out.println("成功使用 " + (amount * 100) + " 积分兑换 " + amount + " 元优惠券！");
                } else {
                    System.out.println("积分不足，无法兑换！");
                }
                pointsDiscount(input);
                break;
            case 3:
                systemManagement(input);
                break;
            default:
                System.out.println("无效选择，请重试！");
                pointsDiscount(input);
                break;
        }
    }
}
