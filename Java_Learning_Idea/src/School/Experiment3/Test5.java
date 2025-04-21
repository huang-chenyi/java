package School.Experiment3;

import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        String[] words = {"write", "that", "apple", "banana", "orange", "grape", "strawberry", "watermelon", "pineapple", "mango"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            // 随机选择一个单词
            String word = words[random.nextInt(words.length)];
            char[] wordChars = word.toCharArray();
            boolean[] guessedLetters = new boolean[wordChars.length];
            Set<Character> guessedLettersSet = new HashSet<>();
            int incorrectGuesses = 0;
            boolean wordGuessed = false;
            // 游戏主循环
            while (true) {
                // 提示用户输入
                System.out.print("Enter a letter in word ");
                for (int i = 0; i < wordChars.length; i++) {
                    if (guessedLetters[i]) {
                        System.out.print(wordChars[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print(" >");
                String input = scanner.nextLine().trim();
                // 检查输入是否有效
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Please enter a single letter.");
                    continue;
                }

                char guess = Character.toLowerCase(input.charAt(0));

                // 检查是否已经猜过这个字母
                if (guessedLettersSet.contains(guess)) {
                    System.out.println(guess + " is already in the word");
                    continue;
                }

                guessedLettersSet.add(guess);

                // 检查字母是否在单词中
                boolean letterFound = false;
                for (int i = 0; i < wordChars.length; i++) {
                    if (Character.toLowerCase(wordChars[i]) == guess) {
                        guessedLetters[i] = true;
                        letterFound = true;
                    }
                }

                // 如果字母不在单词中，增加错误次数
                if (!letterFound) {
                    System.out.println(guess + " is not in the word");
                    incorrectGuesses++;
                }

                // 检查是否猜完单词
                boolean allGuessed = true;
                for (boolean guessed : guessedLetters) {
                    if (!guessed) {
                        allGuessed = false;
                        break;
                    }
                }

                if (allGuessed) {
                    wordGuessed = true;
                    break;
                }
            }

            // 游戏结束，显示结果
            if (wordGuessed) {
                System.out.println("The word is " + word + ". You missed " + incorrectGuesses + " times.");
            }

            // 询问是否继续游戏
            System.out.print("Do you want to guess another word? Enter y or n > ");
            String continueInput = scanner.nextLine().trim().toLowerCase();
            playAgain = continueInput.equals("y");
        }
        scanner.close();
    }
}
