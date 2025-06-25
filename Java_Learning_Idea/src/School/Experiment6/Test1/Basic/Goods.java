package School.Experiment6.Test1.Basic;

public class Goods {
    private String name; // 商品名称
    private boolean isDanger; // 是否是危险品

    // 构造方法
    public Goods(String name, boolean isDanger) {
        this.name = name;
        this.isDanger = isDanger;

    }

    // 获取商品名称
    public String getName() {
        return name;
    }

    // 判断是否是危险品
    public boolean isDanger() {
        return isDanger;
    }
}