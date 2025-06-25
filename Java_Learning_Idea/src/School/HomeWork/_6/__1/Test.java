package School.HomeWork._6.__1;
//测试类
public class Test {
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly("蓝色"); //创建一只蓝蝴蝶
        butterfly.display(); //输出蝴蝶特征
        butterfly.fly(); //蝴蝶飞行
        butterfly.eat(); //蝴蝶觅食

        Airplane airplane = new Airplane("广州"); //创建一架飞机
        airplane.fly(); //飞机飞行
    }
}
