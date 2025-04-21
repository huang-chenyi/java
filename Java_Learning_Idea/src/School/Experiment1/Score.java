package School.Experiment1;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        float scoreA, scoreB, scoreC, scoreD, scoreE, scoreF;
        System.out.println("请输入学生A和学生B的成绩:");
        Scanner number = new Scanner(System.in);
        scoreA = number.nextFloat();
        scoreB = number.nextFloat();
        scoreC = number.nextFloat();
        scoreD = number.nextFloat();
        scoreE = number.nextFloat();
        scoreF = number.nextFloat();
        float cha1, cha2, cha3, cha4, cha5, cha6;
        cha1 = scoreA - scoreB;
        cha2 = scoreB - scoreC;
        cha3 = scoreC - scoreA;
        cha4 = scoreD - scoreE;
        cha5 = scoreE - scoreF;
        cha6 = scoreF - scoreD;
        float sum1, sum2;
        sum1 = scoreA + scoreB + scoreC;
        sum2 = scoreD + scoreE + scoreF;
        System.out.println("成绩差A:" + Math.abs(cha1) + " " + Math.abs(cha2) + " " + Math.abs(cha3));
        System.out.println("成绩差B:" + Math.abs(cha4) + " " + Math.abs(cha5) + " " + Math.abs(cha6));
        System.out.println("A比B的成绩差吗?");
        if(sum1 < sum2)
            System.out.println("Ture");
        else
            System.out.println("False");
    }
}
