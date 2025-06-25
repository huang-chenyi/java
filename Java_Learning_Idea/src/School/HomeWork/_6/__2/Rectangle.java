package School.HomeWork._6.__2;

//矩形类
public class Rectangle extends GeometricObject {
    private double length; //长
    private double width; //宽

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //重写获取面积方法
    @Override
    public double getArea() {
        return length * width;
    }

    //重写获取周长方法
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
