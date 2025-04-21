package School.Experiment2;

public class Print {
    public static void main(String[] args) {
        String specialChar = "\uD834\uDF07";
        System.out.println("特殊字符“”打印 10 次：");
        for (int i = 0; i < 10; i++) {
            System.out.print(specialChar);
        }
    }
}
