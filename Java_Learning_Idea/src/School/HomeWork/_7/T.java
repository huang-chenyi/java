package School.HomeWork._7;

import java.util.*;

public class T {
    public static void main(String[] args) {
        // 创建若干个Square对象和RightTriangle对象
        List<A> shapes = new ArrayList<>();
        shapes.add(new Square(5.0));
        shapes.add(new Square(3.0));
        shapes.add(new RightTriangle(4.0, 3.0));
        shapes.add(new RightTriangle(6.0, 8.0));

        // 按面积排序并打印
        System.out.println("按面积排序：");
        shapes.sort(Comparator.comparingDouble(A::getArea));
        shapes.forEach(System.out::println);

        // 按周长排序并打印
        System.out.println("\n按周长排序：");
        shapes.sort(Comparator.comparingDouble(A::getPerimeter));
        shapes.forEach(System.out::println);
    }
}