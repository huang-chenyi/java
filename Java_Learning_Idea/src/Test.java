import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        int number = 50;
        int runTime = 1000; //运行1000次求平均运行时间
        //直接循环计算
        long startTime = System.nanoTime();
        for (int i = 0; i < runTime; i++) {
            factorial(number);
        }
        long endTime = System.nanoTime();
        long loopTime = (endTime - startTime) / runTime;
        //递归计算
        long startTime2 = System.nanoTime();
        for (int i = 0; i < runTime; i++) {
            factorial2(number);
        }
        long endTime2 = System.nanoTime();
        long recursionTime = (endTime2 - startTime2) / runTime;
        // 输出结果
        System.out.println("直接循环计算50!的结果: " + factorial(number));
        System.out.println("直接循环计算平均耗时: " + loopTime + " 纳秒");

        System.out.println("递归计算50!的结果: " + factorial2(number));
        System.out.println("递归计算平均耗时: " + recursionTime + " 纳秒");
    }
    // 循环计算阶乘
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    // 递归计算阶乘
    public static BigInteger factorial2(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial2(n - 1));
        }
    }
}