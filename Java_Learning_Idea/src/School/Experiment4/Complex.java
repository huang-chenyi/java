package School.Experiment4;

public class Complex {
    //重写toString方法
    @Override
    public String toString() {
        if (imaginaryPart == 0) {
            return realPart + "";
        }
        else if (realPart == 0) {
            return imaginaryPart + "i";
        }
        else if (imaginaryPart > 0) {
            return realPart + " + " + imaginaryPart + "i";
        }
        else {
            return realPart + " - " + Math.abs(imaginaryPart) + "i";
        }
    }
    //主方法
    public static void main(String[] args) {
        Complex c1 = new Complex(3.0,4.0);
        Complex c2 = new Complex(4.0,5.0);
        //加法运算（复数加复数）
        Complex number1 = c1.plus(c2);
        System.out.println(number1);
        //减法运算（复数减复数）
        Complex number2 = c1.minus(c2);
        System.out.println(number2);
        //加法运算（实数加复数）
        Complex number3 = c1.plus(5.0);
        System.out.println(number3);
        //减法运算（实数减复数）
        Complex number4 = c1.minus(5.0);
        System.out.println(number4);

    }
    private double realPart; //实部
    private double imaginaryPart;//虚部
    //构造方法
    public Complex() {
    }
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart() {
        return realPart;
    }
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    //加法运算（复数加复数）
    public Complex plus(Complex num) {
        Complex num1 = new Complex();
        num1.setRealPart(this.realPart + num.realPart);
        num1.setImaginaryPart(this.imaginaryPart + num.imaginaryPart);
        return num1;
    }
    //减法运算（复数减复数）
    public Complex minus(Complex num) {
        Complex num1 = new Complex();
        num1.setRealPart(this.realPart - num.realPart);
        num1.setImaginaryPart(this.imaginaryPart - num.imaginaryPart);
        return num1;
    }
    //加法运算（实数加复数）
    public Complex plus(double num) {
        Complex num1 = new Complex();
        num1.setRealPart(this.realPart + num);
        num1.setImaginaryPart(this.imaginaryPart);
        return num1;
    }
    //减法运算（实数减复数）
    public Complex minus(double num) {
        Complex num1 = new Complex();
        num1.setRealPart(this.realPart - num);
        num1.setImaginaryPart(this.imaginaryPart);
        return num1;
    }
}