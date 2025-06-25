package School.Experiment6.Test2;

import java.io.*;
import java.util.*;

public class ScoreQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查询的同学姓名：");
        String name = scanner.nextLine().trim(); // 去除输入的前后空格

        try {
            String result = queryScore(name);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println("查询失败，未找到该同学的成绩。");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String queryScore(String name) throws IOException, NameNotFoundException {
        String inputFilePath = "D:\\CodeRepository\\java\\Java_Learning_Idea\\src\\School\\Experiment6\\Test2\\ScoreAnalysis.txt"; // 输入文件路径

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("姓名:" + name)) { // 检查姓名是否匹配
                    // 移除"姓名:"前缀，然后按逗号分割
                    String[] parts = line.replaceFirst("姓名:", "").split("，");
                    int mathScore = 0, physicsScore = 0, englishScore = 0;
                    int totalScore = 0;

                    // 提取各科成绩
                    for (String part : parts) {
                        part = part.trim();
                        if (part.contains("数学")) {
                            mathScore = extractScore(part);
                        } else if (part.contains("物理")) {
                            physicsScore = extractScore(part);
                        } else if (part.contains("英语")) {
                            englishScore = extractScore(part);
                        } else if (part.contains("总成绩")) {
                            // 提取总成绩
                            totalScore = extractScore(part);
                        }
                    }

                    return "数学成绩：" + mathScore + " 分\n" +
                            "物理成绩：" + physicsScore + " 分\n" +
                            "英语成绩：" + englishScore + " 分\n" +
                            "总成绩：" + totalScore + " 分";
                }
            }
            throw new NameNotFoundException("未找到姓名为 " + name + " 的同学成绩。");
        }
    }

    private static int extractScore(String text) {
        // 提取数字部分，适用于"数学72 分"或"总成绩：209 分"等格式
        String scoreStr = text.replaceAll("[^0-9]", "");
        return Integer.parseInt(scoreStr);
    }

    static class NameNotFoundException extends Exception {
        public NameNotFoundException(String message) {
            super(message);
        }
    }
}