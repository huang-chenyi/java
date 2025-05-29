package School.HomeWork._5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D(0, 0, 5);
        Circle2D circle2 = new Circle2D(3, 3, 2);
        Circle2D circle3 = new Circle2D(10, 10, 1);
        Triangle triangle = new Triangle(3, 4, 5);

        ArrayList<GeometricObject> list = new ArrayList<>();
        list.add(circle1);
        list.add(circle2);
        list.add(circle3);
        list.add(triangle);

        // 判断圆之间的关系
        System.out.println("Circle1包含Circle2: " + circle1.contains(circle2));
        System.out.println("Circle1与Circle2重合: " + circle1.overlaps(circle2));
        System.out.println("Circle2包含Circle3: " + circle2.contains(circle3));
        System.out.println("Circle2与Circle3重合: " + circle2.overlaps(circle3));
        System.out.println();
        // 按面积从小到大排序
        Collections.sort(list, new Comparator<GeometricObject>() {
            @Override
            public int compare(GeometricObject o1, GeometricObject o2) {
                return Double.compare(o1.getArea(), o2.getArea());
            }
        });

        // 输出各几何图形的属性信息
        for (GeometricObject obj : list) {
            System.out.println(obj.toString());
            System.out.println("Area: " + obj.getArea());
            System.out.println("Perimeter: " + obj.getPerimeter());
            System.out.println("Color: " + obj.getColor());
            System.out.println("Filled: " + obj.isFilled());
            System.out.println("Date Created: " + obj.getDateCreated());
            System.out.println();
        }
    }
}