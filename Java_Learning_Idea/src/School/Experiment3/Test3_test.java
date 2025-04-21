package School.Experiment3;

import java.util.Random;
import java.util.Scanner;

public class Test3_test {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                Random random = new Random();

                // 测试不同的数组规模
                int[] sizes = {1000, 10000, 100000};

                for (int size : sizes) {
                        // 生成随机数组
                        int[] list = new int[size];
                        for (int i = 0; i < size; i++) {
                                list[i] = random.nextInt(1000000); // 随机生成0到999999之间的整数
                        }

                        // 测试已排序数组
                        System.out.println("\nTesting with size: " + size);
                        System.out.println("Testing sorted list...");
                        int[] sortedList = list.clone();
                        java.util.Arrays.sort(sortedList); // 对数组进行排序
                        testExecutionTime(sortedList);

                        // 测试未排序数组
                        System.out.println("Testing unsorted list...");
                        testExecutionTime(list);
                }
        }

        // 测试执行时间的方法
        public static void testExecutionTime(int[] list) {
                long startTime = System.nanoTime(); // 开始时间
                boolean result = isSorted(list);
                long endTime = System.nanoTime(); // 结束时间

                // 输出结果
                System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
                if (result) {
                        System.out.println("The list is already Sorted");
                } else {
                        System.out.println("The list is not Sorted");
                }
        }

        // 判断数组是否已排序的方法
        public static boolean isSorted(int[] list) {
                int min = list[0];
                for (int i : list) {
                        if (min > i) {
                                return false;
                        }
                        min = i;
                }
                return true;
        }
}