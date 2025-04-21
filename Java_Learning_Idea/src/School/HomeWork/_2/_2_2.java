package School.HomeWork._2;

public class _2_2 {
    public static void main(String[] args) {
        System.out.println("当i=5时，e的值为：" + EValue(5));
        System.out.println("当i=10时，e的值为：" + EValue(10));
        System.out.println("当i=20时，e的值为：" + EValue(20));

//        System.out.println("当i=30时，e的值为：" + EValue(30));
//        System.out.println("当i=100时，e的值为：" + EValue(100));
    }
        // 当累加项数未知，仅满足加数达到1e-7值时精度
//        double eValue = 0;
//        double term = 1;
//        int i = 0;
//        while (term >= 1e-7) {
//            eValue += term;
//            i++;
//            term = 1.0 / factorial(i);
//        }
//        System.out.println("当加数达到1e-7值时精度，e的值为：" + eValue + "，此时i的值为：" + i);
//    }
    public static double EValue(int n) {
        double e = 1.0;
        for (int i = 1; i <= n; i++) {
            e += 1.0 / factorial(i);
        }
        return e;
    }
    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
//i在一定范围内时，i越大，e越大，越精准
//若i的值为30，100时e的值不能更精确,仍为2.718281828459046
//当加数达到1e-7值时精度，e的值为：2.718281801146385，此时i的值为：11