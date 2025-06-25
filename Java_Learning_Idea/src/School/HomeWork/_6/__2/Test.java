package School.HomeWork._6.__2;

//测试类
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Cuboid> cuboids = new ArrayList<>();
        Random random = new Random();

        //构造若干个长方体对象并对各成员变量随机初始化
        for (int i = 0; i < 5; i++) {
            try {
                double length = random.nextDouble() * 10;
                double width = random.nextDouble() * 10;
                double height = random.nextDouble() * 10;
                Cuboid cuboid = new Cuboid(length, width, height);
                cuboids.add(cuboid);
            } catch (Exception e) {
                System.out.println("Error creating Cuboid: " + e.getMessage());
            }
        }

        //调用display方法输出各对象所有成员变量的值
        for (Cuboid cuboid : cuboids) {
            cuboid.display();
            System.out.println();
        }

        //按照体积从小到大输出对应长方体的体积和表面积
        Collections.sort(cuboids);
        System.out.println("Cuboids sorted by volume:");
        for (Cuboid cuboid : cuboids) {
            System.out.println("Volume: " + cuboid.getVolume() + ", Surface Area: " + cuboid.getSurfaceArea());
        }

        //输出成功创建对象的个数
        System.out.println("Number of created Cuboid objects: " + Cuboid.getNumberOfCreatedObjects());
    }
}
