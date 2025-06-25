package School.HomeWork._6.__2;

//长方体类
public class Cuboid extends Rectangle implements Comparable<Cuboid> {
    private double height; //高

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    //获取表面积方法
    public double getSurfaceArea() {
        return 2 * (super.getArea() + getLength() * height + getWidth() * height);
    }

    //获取体积方法
    public double getVolume() {
        return getLength() * getWidth() * height;
    }

    //显示所有成员变量的值
    public void display() {
        System.out.println("Color: " + getFrColor() + ", " + getBgColor());
        System.out.println("Filled: " + isFilled());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + height);
        System.out.println("Area: " + super.getArea());
        System.out.println("Perimeter: " + super.getPerimeter());
        System.out.println("Surface Area: " + getSurfaceArea());
        System.out.println("Volume: " + getVolume());
    }

    //实现Comparable接口的compareTo方法
    @Override
    public int compareTo(Cuboid other) {
        return Double.compare(this.getVolume(), other.getVolume());
    }
}
