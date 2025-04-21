package School.Experiment2;

//问题：本实验中的测试数据前缀0和后缀0怎样处理比较好？

import java.math.BigDecimal;
import java.util.Scanner;

public class Test7 {
    private static final String[] CHINESE_NUMBERS = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private static final String[] CHINESE_UNITS = {"", "拾", "佰", "仟", "万", "亿"};
    private static final String YUAN = "元";
    private static final String JIAO = "角";
    private static final String FEN = "分";
    private static final String ZHENG = "整";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额：");
        String input = scanner.nextLine();
        try {
            BigDecimal amount = new BigDecimal(input);
            String chineseAmount = convertToChinese(amount);
            System.out.println(chineseAmount);
        } catch (NumberFormatException e) {
            System.out.println("输入数据错误！");
        }
    }

    private static String convertToChinese(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            return "负" + convertToChinese(amount.abs());
        }

        String[] parts = amount.toString().split("\\.");
        String integerPart = parts[0];
        String fractionPart = parts.length > 1 ? parts[1] : "00";

        // 处理前缀0
        integerPart = integerPart.replaceFirst("^0+", "");

        if (integerPart.isEmpty()) {
            integerPart = "0";
        }

        String chineseInteger = convertIntegerPart(integerPart);
        String chineseFraction = convertFractionPart(fractionPart);

        return chineseInteger + YUAN + chineseFraction + (chineseFraction.isEmpty() ? ZHENG : "");
    }

    private static String convertIntegerPart(String integerPart) {
        StringBuilder result = new StringBuilder();
        int length = integerPart.length();

        for (int i = 0; i < length; i++) {
            char c = integerPart.charAt(i);
            int digit = c - '0';
            int position = length - i - 1;
            int unitPosition = position % 4;
            int sectionIndex = (position / 4) - 1;

            if (digit == 0) {
                if (result.length() > 0 && !result.substring(result.length() - 1).equals(CHINESE_NUMBERS[0])) {
                    result.append(CHINESE_NUMBERS[0]);
                }
                continue;
            }

            if (unitPosition > 0 || sectionIndex >= 0) {
                if (unitPosition == 1 && digit == 1 && sectionIndex == -1) {
                    // 处理十位的1，如10元，应为“拾元”而非“壹拾元”
                    result.append(CHINESE_UNITS[unitPosition]);
                } else {
                    result.append(CHINESE_NUMBERS[digit]);
                    if (unitPosition > 0) {
                        result.append(CHINESE_UNITS[unitPosition]);
                    }
                }
            } else {
                result.append(CHINESE_NUMBERS[digit]);
            }

            // 添加节单位（万、亿等）
            if (unitPosition == 0 && sectionIndex >= 0) {
                result.append(CHINESE_UNITS[4 + sectionIndex]);
            }
        }

        String res = result.toString()
                .replaceAll("零+", "零")
                .replaceAll("零(佰|仟|万|亿)", "$1")
                .replaceAll("零$", "");
        return res;
    }

    private static String convertFractionPart(String fractionPart) {
        StringBuilder result = new StringBuilder();
        int jiao = 0;
        int fen = 0;

        if (fractionPart.length() > 0) {
            jiao = Integer.parseInt(fractionPart.charAt(0) + "");
        }
        if (fractionPart.length() > 1) {
            fen = Integer.parseInt(fractionPart.charAt(1) + "");
        }

        if (jiao > 0) {
            result.append(CHINESE_NUMBERS[jiao]).append(JIAO);
        }
        if (fen > 0) {
            result.append(CHINESE_NUMBERS[fen]).append(FEN);
        }

        return result.toString();
    }
}
//import java.util.Scanner;
//
//public class Test7 {
//    private static final String[] CHINESE_NUMBERS = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
//    private static final String[] CHINESE_UNITS = {"", "拾", "佰", "仟", "万", "亿"};
//    private static final String YUAN = "元";
//    private static final String JIAO = "角";
//    private static final String FEN = "分";
//    private static final String ZHENG = "整";
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入金额：");
//        String input = scanner.nextLine();
//        if (!isValid(input)) {
//            System.out.println("输入数据错误！");
//            return;
//        }
//
//        boolean isNegative = input.startsWith("-");
//        if (isNegative) input = input.substring(1);
//
//        String[] parts = input.split("\\.");
//        String integerPart = parts[0].replaceAll("^0+", "");
//        if (integerPart.isEmpty()) integerPart = "0";
//
//        String fractionPart = parts.length > 1 ? parts[1] : "00";
//        if (fractionPart.length() < 2) {
//            fractionPart = fractionPart.length() == 0 ? "00" : fractionPart + "0".repeat(2 - fractionPart.length());
//        } else {
//            fractionPart = fractionPart.substring(0, 2);
//        }
//
//        String chineseInteger = convertIntegerPart(integerPart);
//        String chineseFraction = convertFractionPart(fractionPart);
//
//        String result = (isNegative ? "负" : "") + chineseInteger + YUAN
//                + (chineseFraction.isEmpty() ? ZHENG : chineseFraction);
//        System.out.println(result);
//    }
//
//    private static boolean isValid(String input) {
//        if (input.isEmpty() || input.startsWith(".") || input.endsWith(".")) return false;
//        String[] parts = input.split("\\.");
//        if (parts.length > 2) return false;
//        for (char c : input.replace(".", "").replace("-", "").toCharArray()) {
//            if (!Character.isDigit(c)) return false;
//        }
//        return true;
//    }
//
//    private static String convertIntegerPart(String integerPart) {
//        StringBuilder sb = new StringBuilder();
//        int length = integerPart.length();
//
//        for (int i = 0; i < length; i++) {
//            char c = integerPart.charAt(i);
//            int digit = c - '0';
//            int position = length - i - 1;
//            int unitPos = position % 4;
//            int section = (position / 4) - 1;
//
//            if (digit == 0) {
//                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '零') {
//                    sb.append(CHINESE_NUMBERS[0]);
//                }
//                continue;
//            }
//
//            sb.append(CHINESE_NUMBERS[digit]);
//
//            if (unitPos > 0) {
//                if (unitPos == 1 && digit == 1 && section == -1) {
//                    sb.append(CHINESE_UNITS[unitPos]);
//                } else {
//                    sb.append(CHINESE_UNITS[unitPos]);
//                }
//            }
//
//            if (unitPos == 0 && section >= 0) {
//                sb.append(CHINESE_UNITS[4 + section]);
//            }
//        }
//
//        String result = sb.toString();
//        result = result.replaceAll("零+", "零")
//                .replaceAll("零(佰|仟|万|亿)", "$1")
//                .replaceAll("零$", "");
//        return result.isEmpty() ? CHINESE_NUMBERS[0] : result;
//    }
//
//    private static String convertFractionPart(String fractionPart) {
//        StringBuilder sb = new StringBuilder();
//        int jiao = Character.getNumericValue(fractionPart.charAt(0));
//        int fen = Character.getNumericValue(fractionPart.charAt(1));
//
//        if (jiao > 0) sb.append(CHINESE_NUMBERS[jiao]).append(JIAO);
//        if (fen > 0) sb.append(CHINESE_NUMBERS[fen]).append(FEN);
//
//        return sb.toString();
//    }
//}