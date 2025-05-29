package School.HomeWork._5;

public class Circle2D extends GeometricObject {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        super();
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        super();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)) < radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt((this.x - circle.x) * (this.x - circle.x) + (this.y - circle.y) * (this.y - circle.y)) + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt((this.x - circle.x) * (this.x - circle.x) + (this.y - circle.y) * (this.y - circle.y));
        return distance < this.radius + circle.radius && distance > Math.abs(this.radius - circle.radius);
    }

    @Override
    public String toString() {
        return "Circle2D[x=" + x + ", y=" + y + ", radius=" + radius + ", " + super.toString() + "]";
    }
}
