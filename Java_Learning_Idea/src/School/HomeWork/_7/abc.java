package School.HomeWork._7;

// 正方形类
class Square implements A {
    private double sideLength; // 边长

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength; // 周长 = 4 × 边长
    }

    @Override
    public double getArea() {
        return sideLength * sideLength; // 面积 = 边长 × 边长
    }

    @Override
    public String toString() {
        return "Square(sideLength=" + sideLength + ", perimeter=" + getPerimeter() + ", area=" + getArea() + ")";
    }
}

// 直角三角形类
class RightTriangle implements A {
    private double base; // 底
    private double height; // 高

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height); // 斜边长度
        return base + height + hypotenuse; // 周长 = 底 + 高 + 斜边
    }

    @Override
    public double getArea() {
        return 0.5 * base * height; // 面积 = 0.5 × 底 × 高
    }

    @Override
    public String toString() {
        return "RightTriangle(base=" + base + ", height=" + height + ", perimeter=" + getPerimeter() + ", area=" + getArea() + ")";
    }
}
