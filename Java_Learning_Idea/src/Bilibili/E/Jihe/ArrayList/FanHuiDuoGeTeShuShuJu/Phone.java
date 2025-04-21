package Bilibili.E.Jihe.ArrayList.FanHuiDuoGeTeShuShuJu;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "品牌: " + brand + ", 价格: " + price + "元";
    }
    //为什么你的代码没有显式调用 toString，却能正确输出结果？
    //这是因为 System.out.println 会自动调用 toString 方法。具体来说：
    //当你将一个对象传递给 System.out.println 时，println 方法会尝试将对象转换为字符串。
    //Java 会自动调用对象的 toString 方法来获取字符串表示。
    //如果你重写了 toString 方法，就会输出你定义的内容；否则会输出默认的内存地址。
}
