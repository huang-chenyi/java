package School.HomeWork._6.__1;
//飞机类
public class Airplane implements Flyable {
    private String destination; // 目的地
    //带参构造方法
    public Airplane(String destination) {
        this.destination = destination;
    }
    //实现飞行接口的fly方法
    @Override
    public void fly() {
        System.out.println("飞机正在飞往" + destination + "。");
    }
}