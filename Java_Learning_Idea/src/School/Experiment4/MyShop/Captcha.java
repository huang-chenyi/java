package School.Experiment4.MyShop;

import java.util.Random;

public class Captcha {
    public static String setRandomPin() {
        StringBuilder pin = new StringBuilder();
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(chars.length());
            pin.append(chars.charAt(index));
        }
        return pin.toString();
    }
    public static boolean isValidPin(String s1, String s2) {
        return s1.equals(s2);
    }
}
