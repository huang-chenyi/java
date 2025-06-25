package School.HomeWork._7;

import java.io.*;

public class CalculateAverage {
    public static void main(String[] args) {
        // 定义输入文件和输出文件的路径
        String inputFilePath = "D:\\CodeRepository\\java\\Java_Learning_Idea\\src\\School\\HomeWork\\_7\\in.dat";
        String outputFilePath = "D:\\CodeRepository\\java\\Java_Learning_Idea\\src\\School\\HomeWork\\_7\\out.dat";

        // 使用try-with-resources语句确保文件流在操作完成后自动关闭
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) { // 逐行读取文件
                String[] parts = line.split("\\s+"); // 使用正则表达式分割每行数据，获取总成绩和考试科目数
                int totalScore = Integer.parseInt(parts[0]); // 将总成绩转换为整数
                int numSubjects = Integer.parseInt(parts[1]); // 将考试科目数转换为整数

                // 计算平均成绩
                if (numSubjects == 0) {
                    writer.write(totalScore + "/" + numSubjects + " = 数据异常\n"); // 如果考试科目数为0，写入“数据异常”
                } else {
                    int averageScore = totalScore / numSubjects; // 计算平均成绩
                    writer.write(totalScore + "/" + numSubjects + " = " + averageScore + "\n"); // 写入平均成绩
                }
            }

        } catch (IOException e) {
            e.printStackTrace(); // 捕获并打印异常信息
        }
    }
}
