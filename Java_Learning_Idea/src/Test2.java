public class Test2 {
    public static void main(String[] args) {
        int iterations = 1000; // 运行次数

        // 测试String的性能
        long startTimeString = System.nanoTime();
        String resultString = "";
        for (int i = 0; i < iterations; i++) {
            resultString += "a";
        }
        long endTimeString = System.nanoTime();
        long stringTime = endTimeString - startTimeString;

        // 测试StringBuffer的性能
        long startTimeStringBuffer = System.nanoTime();
        StringBuffer resultStringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            resultStringBuffer.append("a");
        }
        long endTimeStringBuffer = System.nanoTime();
        long stringBufferTime = endTimeStringBuffer - startTimeStringBuffer;

        // 测试StringBuilder的性能
        long startTimeStringBuilder = System.nanoTime();
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            resultStringBuilder.append("a");
        }
        long endTimeStringBuilder = System.nanoTime();
        long stringBuilderTime = endTimeStringBuilder - startTimeStringBuilder;

        // 输出结果
        System.out.println("String性能: " + stringTime + "纳秒");
        System.out.println("StringBuffer性能: " + stringBufferTime + "纳秒");
        System.out.println("StringBuilder性能: " + stringBuilderTime + "纳秒");
    }
}