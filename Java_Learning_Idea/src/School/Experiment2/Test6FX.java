package School.Experiment2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Test6FX extends Application {

    private int points = 100000; // 用户积分
    private String[][] cart = new String[50][3]; // 购物车数组
    private int cartSize = 0; // 购物车中商品的数量
    private double discountAmount = 0.0; // 折扣金额
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showLoginMenu();
    }

    // 显示登录菜单
    private void showLoginMenu() {
        primaryStage.setTitle("欢迎登录MyShop购物管理系统！");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("欢迎登录MyShop购物管理系统！");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Button loginButton = new Button("1. 登录系统");
        Button exitButton = new Button("2. 退出");

        loginButton.setOnAction(e -> showSystemManagement());
        exitButton.setOnAction(e -> primaryStage.close());

        vbox.getChildren().addAll(titleLabel, loginButton, exitButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 显示系统管理菜单
    private void showSystemManagement() {
        primaryStage.setTitle("欢迎使用MyShop购物管理系统！");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("欢迎使用MyShop购物管理系统！");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Button customerInfoButton = new Button("1. 客户信息管理");
        Button checkoutButton = new Button("2. 购物结算");
        Button pointsDiscountButton = new Button("3. 积分优惠");
        Button logoutButton = new Button("4. 注销");

        customerInfoButton.setOnAction(e -> showCustomerInfoManagement());
        checkoutButton.setOnAction(e -> showCheckout());
        pointsDiscountButton.setOnAction(e -> showPointsDiscount());
        logoutButton.setOnAction(e -> showLoginMenu());

        vbox.getChildren().addAll(titleLabel, customerInfoButton, checkoutButton, pointsDiscountButton, logoutButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 显示客户信息管理
    private void showCustomerInfoManagement() {
        primaryStage.setTitle("客户信息管理");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("客户信息管理！");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Button viewInfoButton = new Button("1. 查看个人信息");
        Button backButton = new Button("2. 返回");

        viewInfoButton.setOnAction(e -> showPersonalInfo());
        backButton.setOnAction(e -> showSystemManagement());

        vbox.getChildren().addAll(titleLabel, viewInfoButton, backButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 显示个人信息
    private void showPersonalInfo() {
        primaryStage.setTitle("查看个人信息");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("查看个人信息！");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Label nameLabel = new Label("用户名: Zhang San");
        Label moneyLabel = new Label("余额: 10000");

        Button backButton = new Button("返回");
        backButton.setOnAction(e -> showCustomerInfoManagement());

        vbox.getChildren().addAll(titleLabel, nameLabel, moneyLabel, backButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 显示购物结算
    private void showCheckout() {
        primaryStage.setTitle("购物结算");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("购物结算！");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Button addButton = new Button("1. 添加商品");
        Button viewCartButton = new Button("2. 查看购物车");
        Button applyDiscountButton = new Button("3. 应用折扣");
        Button completeCheckoutButton = new Button("4. 完成结算");
        Button backButton = new Button("5. 返回");

        addButton.setOnAction(e -> addProduct());
        viewCartButton.setOnAction(e -> viewShoppingCart());
        applyDiscountButton.setOnAction(e -> applyDiscount());
        completeCheckoutButton.setOnAction(e -> completeCheckout());
        backButton.setOnAction(e -> showSystemManagement());

        vbox.getChildren().addAll(titleLabel, addButton, viewCartButton, applyDiscountButton, completeCheckoutButton, backButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 添加商品
    private void addProduct() {
        primaryStage.setTitle("添加商品");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("添加商品");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Label nameLabel = new Label("商品名称:");
        TextField nameField = new TextField();

        Label priceLabel = new Label("商品价格:");
        TextField priceField = new TextField();

        Label quantityLabel = new Label("商品数量:");
        TextField quantityField = new TextField();

        Button addButton = new Button("添加");
        addButton.setOnAction(e -> {
            String productName = nameField.getText();
            String productPrice = priceField.getText();
            String productQuantity = quantityField.getText();

            if (!productName.isEmpty() && !productPrice.isEmpty() && !productQuantity.isEmpty()) {
                cart[cartSize][0] = productName;
                cart[cartSize][1] = productPrice;
                cart[cartSize][2] = productQuantity;
                cartSize++;
                showAlert("成功", productName + " 已加入购物车！");
                showCheckout();
            } else {
                showAlert("错误", "请输入所有商品信息！");
            }
        });

        gridPane.add(titleLabel, 0, 0, 2, 1);
        gridPane.add(nameLabel, 0, 1);
        gridPane.add(nameField, 1, 1);
        gridPane.add(priceLabel, 0, 2);
        gridPane.add(priceField, 1, 2);
        gridPane.add(quantityLabel, 0, 3);
        gridPane.add(quantityField, 1, 3);
        gridPane.add(addButton, 0, 4, 2, 1);

        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setScene(scene);
    }

    // 查看购物车
    private void viewShoppingCart() {
        primaryStage.setTitle("查看购物车");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("**********购物车**********");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefRowCount(10);

        double total = 0.0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cartSize; i++) {
            String name = cart[i][0];
            String priceStr = cart[i][1];
            String quantityStr = cart[i][2];
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);
            double amount = price * quantity;
            sb.append("商品名称: ").append(name).append(" 单价: ").append(price).append("元 数量: ").append(quantity).append(" 金额: ").append(amount).append("元\n");
            total += amount;
        }
        sb.append("总计：￥").append(total);
        textArea.setText(sb.toString());

        Button backButton = new Button("返回");
        backButton.setOnAction(e -> showCheckout());

        vbox.getChildren().addAll(titleLabel, textArea, backButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 应用折扣
    private void applyDiscount() {
        primaryStage.setTitle("应用折扣");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("应用折扣");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Label discountLabel = new Label("请输入要使用的优惠券金额：");
        TextField discountField = new TextField();

        Button applyButton = new Button("应用");
        applyButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(discountField.getText());
                discountAmount = amount;
                showAlert("成功", "已应用 " + amount + " 元折扣！");
                showCheckout();
            } catch (NumberFormatException ex) {
                showAlert("错误", "请输入有效的数字！");
            }
        });

        vbox.getChildren().addAll(titleLabel, discountLabel, discountField, applyButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 完成结算
    private void completeCheckout() {
        primaryStage.setTitle("购物结算完成");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("**********购物小票**********");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefRowCount(10);

        double totalAmount = 0.0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cartSize; i++) {
            String name = cart[i][0];
            String priceStr = cart[i][1];
            String quantityStr = cart[i][2];
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);
            double amount = price * quantity;
            sb.append("商品名称: ").append(name).append(" 单价: ").append(price).append("元 数量: ").append(quantity).append(" 金额: ").append(amount).append("元\n");
            totalAmount += amount;
        }
        sb.append("消费总金额: ￥").append(totalAmount).append("\n");
        sb.append("总折扣: ￥").append(discountAmount).append("\n");
        double actualPayment = totalAmount - discountAmount;
        sb.append("实际缴费: ￥").append(actualPayment).append("\n");

        int newPoints = (int) (actualPayment / 100) * 3;
        points += newPoints;
        sb.append("获得积分: ").append(newPoints).append("\n");
        sb.append("当前总积分: ").append(points).append("\n");
        sb.append("结算成功！感谢您的购物！");

        textArea.setText(sb.toString());

        Button backButton = new Button("返回");
        backButton.setOnAction(e -> {
            cartSize = 0;
            discountAmount = 0.0;
            showSystemManagement();
        });

        vbox.getChildren().addAll(titleLabel, textArea, backButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 显示积分优惠
    private void showPointsDiscount() {
        primaryStage.setTitle("积分优惠");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("积分优惠！");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Button viewPointsButton = new Button("1. 查看积分余额");
        Button redeemButton = new Button("2. 使用积分兑换优惠券");
        Button backButton = new Button("3. 返回");

        viewPointsButton.setOnAction(e -> showAlert("积分余额", "当前积分余额：" + points));
        redeemButton.setOnAction(e -> redeemPoints());
        backButton.setOnAction(e -> showSystemManagement());

        vbox.getChildren().addAll(titleLabel, viewPointsButton, redeemButton, backButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 兑换积分
    private void redeemPoints() {
        primaryStage.setTitle("使用积分兑换优惠券");
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("使用积分兑换优惠券");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Label amountLabel = new Label("请输入要兑换的优惠券金额：");
        TextField amountField = new TextField();

        Button redeemButton = new Button("兑换");
        redeemButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                int requiredPoints = (int) (amount * 100);
                if (points >= requiredPoints) {
                    points -= requiredPoints;
                    discountAmount += amount;
                    showAlert("成功", "成功使用 " + requiredPoints + " 积分兑换 " + amount + " 元优惠券！");
                    showPointsDiscount();
                } else {
                    showAlert("错误", "积分不足，无法兑换！");
                }
            } catch (NumberFormatException ex) {
                showAlert("错误", "请输入有效的数字！");
            }
        });

        vbox.getChildren().addAll(titleLabel, amountLabel, amountField, redeemButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
    }

    // 显示提示信息
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}