package School.HomeWork._6.__2;

//几何对象类
public class GeometricObject {
    private String frColor; //前景色
    private String bgColor; //背景色
    private boolean isFilled; //是否填充
    private static int numberOfCreatedObjects = 0; //对象个数

    public GeometricObject() {
        this.frColor = "black";
        this.bgColor = "white";
        this.isFilled = false;
        numberOfCreatedObjects++;
    }

    public void setFrColor(String frColor) {
        this.frColor = frColor;
    }

    public String getFrColor() {
        return frColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
        this.isFilled = true;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public static int getNumberOfCreatedObjects() {
        return numberOfCreatedObjects;
    }
}