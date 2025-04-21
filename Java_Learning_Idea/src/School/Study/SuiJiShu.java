package School.Study;

public class SuiJiShu {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        System.out.println(number1);
        System.out.println(number2);
    }
}
