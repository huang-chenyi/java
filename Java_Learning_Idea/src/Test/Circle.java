package Test;

public class Circle {
        public static void main(String[] args) {
                // Display the header of the table
                System.out.printf("%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine");

                // Display values for 30, 45, 60, 90 degrees
                for (int degrees = 30; degrees <= 90; degrees += 15) {
                        double radians = Math.toRadians(degrees);
                        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians));
                }
        }
}