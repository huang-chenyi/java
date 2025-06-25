package School.HomeWork._6.__1;
//昆虫类
public abstract class Insect {
    protected int wings; //翅膀数量
    protected int legs; //足数量

    //带参构造方法
    public Insect(int wings, int legs) {
        this.wings = wings;
        this.legs = legs;
    }

    //觅食方法
    public abstract void eat();
}
