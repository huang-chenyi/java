package School.Experiment6.Test2;

import java.io.*;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        String inputFilePath = "D:\\CodeRepository\\java\\Java_Learning_Idea\\src\\School\\Experiment6\\Test2\\score.txt"; // 输入文件路径
        String outputFilePath = "D:\\CodeRepository\\java\\Java_Learning_Idea\\src\\School\\Experiment6\\Test2\\scoreAnalysis.txt"; // 输出文件路径

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                // 处理每一行的成绩数据
                String analyzedLine = analyzeLine(line);
                // 将处理后的行写入到输出文件
                writer.write(analyzedLine);
                writer.newLine(); // 写入换行符
            }
            System.out.println("成绩分析完成，结果已写入到 " + outputFilePath);
        } catch (IOException e) {
            System.err.println("发生错误：" + e.getMessage());
        }
    }

    private static String analyzeLine(String line) {
        // 分割行以提取成绩
        String[] parts = line.split("，");
        int mathScore = 0, physicsScore = 0, englishScore = 0;
        int totalScore = 0;

        for (String part : parts) {
            if (part.contains("数学")) {
                mathScore = extractScore(part, "数学");
            } else if (part.contains("物理")) {
                physicsScore = extractScore(part, "物理");
            } else if (part.contains("英语")) {
                englishScore = extractScore(part, "英语");
            }
        }

        // 计算总成绩
        totalScore = mathScore + physicsScore + englishScore;

        // 在原始行的末尾添加总成绩
        return line + " 总成绩：" + totalScore + " 分";
    }

    private static int extractScore(String text, String subject) {
        try {
            String scoreStr = text.replaceAll(subject, "").replaceAll("[^\\d]", "");
            return Integer.parseInt(scoreStr);
        } catch (Exception e) {
            System.err.println("无法解析分数：" + text);
            return 0; // 返回0作为默认值
        }
    }
}