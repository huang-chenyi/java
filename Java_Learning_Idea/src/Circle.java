public class Circle {
        private double radius = 1;
        public double getArea() {
                return radius * radius * Math.PI;
        }
        public static void main(String[] args) {
                Circle myCircle = new Circle();
                System.out.println("radius is " + myCircle.radius);
                System.out.println("area is " + myCircle.getArea());
        }
}