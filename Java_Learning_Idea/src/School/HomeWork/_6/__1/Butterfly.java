package School.HomeWork._6.__1;
//蝴蝶类
public class Butterfly extends Insect implements Flyable {
    private String color; //蝴蝶颜色
    //带参构造方法
    public Butterfly(String color) {
        super(2, 3); //蝴蝶有2对翅膀、3对足
        this.color = color;
    }
    //实现飞行接口的fly方法
    @Override
    public void fly() {
        System.out.println(color + "蝴蝶：正在空中飞行。");
    }
    //实现昆虫类的eat方法
    @Override
    public void eat() {
        System.out.println(color + "蝴蝶：吃花蜜。");
    }
    //输出蝴蝶特征
    public void display() {
        System.out.println(color + "蝴蝶：有" + wings + "对翅膀、" + legs + "对足。");
    }
}
