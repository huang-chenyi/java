package School.Experiment6.Extra;

import java.util.*;
import java.util.regex.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英文文本：");

        // 读取所有输入直到EOF
        StringBuilder textBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            textBuilder.append(scanner.nextLine()).append(" ");
        }
        scanner.close();

        // 使用正则表达式匹配单词
        String text = textBuilder.toString();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            uniqueWords.add(word);
        }

        int totalWords = wordCountMap.values().stream().mapToInt(count -> count).sum();

        System.out.println("\n共有" + totalWords + "个英文单词");
        System.out.println("有" + uniqueWords.size() + "个互不相同英文单词");
        System.out.println("按出现频率排列：");

        // 按频率排序
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((e1, e2) -> Double.compare((double) e2.getValue() / totalWords, (double) e1.getValue() / totalWords));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            double frequency = (double) entry.getValue() / totalWords;
            System.out.printf("%s:%.3f ", entry.getKey(), frequency);
        }
    }
}
