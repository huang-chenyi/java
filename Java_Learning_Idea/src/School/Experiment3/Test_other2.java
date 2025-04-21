package School.Experiment3;

public class Test_other2 {
    public static void main(String[] args) {
        int maxNumber = 99999;
        System.out.println("满足自身，自身的平方，自身的三次方均是回文数条件的数字如下：");
        for (int i = 1; i <= maxNumber; i++) {
            long square = (long) Math.pow(i, 2);
            long cube = (long) Math.pow(i, 3);
            if (isPalindrome(i) && isPalindrome(square) && isPalindrome(cube)) {
                System.out.print(i + " ");
            }
        }
    }
    //返回一个整数的逆序值，例如 reverse(456) 返回 654
    public static long reverse(long number) {
        long reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
    //判断一个整数是否是回文数
    public static boolean isPalindrome(long number) {
        return number == reverse(number);
    }
}