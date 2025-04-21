package School.Experiment4.Point;
import static School.Experiment4.Point.MyPoint.distance;

public class PointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10 , 30.5);

        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(3.0,2.5));
        System.out.println(distance(point1,point2));

    }
}
