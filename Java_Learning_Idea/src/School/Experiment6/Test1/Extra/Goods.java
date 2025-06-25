package School.Experiment6.Test1.Extra;

public class Goods {
    private String name; // 商品名称
    private boolean isDanger; // 是否是危险品
    private boolean isExplorsive; // 是否是爆炸品

    // 构造方法
    public Goods(String name, boolean isDanger, boolean isExplorsive) {
        this.name = name;
        this.isDanger = isDanger;
        this.isExplorsive = isExplorsive;
    }

    // 获取商品名称
    public String getName() {
        return name;
    }

    // 判断是否是危险品
    public boolean isDanger() {
        return isDanger;
    }

    // 判断是否是爆炸品
    public boolean isExplorsive() {
        return isExplorsive;
    }
}