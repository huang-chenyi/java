package School.HomeWork._1;

import java.util.Scanner;

public class _1_2 {
    public static void main(String[] args) {
        System.out.print("Enter the monthly saving amount:");
        Scanner input = new Scanner(System.in);
        float money = input.nextFloat();
        float savings = (money * (1 + 0.00417f));
        savings = Math.round(savings * 1000) / 1000.0f;
        savings = (money + savings) * (1 + 0.00417f);
        savings = Math.round(savings * 1000) / 1000.0f;
        savings = (money + savings) * (1 + 0.00417f);
        savings = Math.round(savings * 1000) / 1000.0f;
        savings = (money + savings) * (1 + 0.00417f);
        savings = Math.round(savings * 1000) / 1000.0f;
        savings = (money + savings) * (1 + 0.00417f);
        savings = Math.round(savings * 1000) / 1000.0f;
        savings = (money + savings) * (1 + 0.00417f);
        savings = Math.round(savings * 100) / 100.0f;
        System.out.println("After the six month, the account value is $"
                + savings);
        //System.out.println("After the six month, the account value is $" + savings);
        //System.out.print("Enter the monthly saving amount: ");
        //Scanner input = new Scanner(System.in);
        //float money = input.nextFloat();
        //float savings = (float) (money * (1 + 0.00417));
        //savings = (float) ((money + savings) * (1 + 0.00417));
        //System.out.println(savings);
        //savings = (float) ((money + savings) * (1 + 0.00417));
        //savings = (float) ((money + savings) * (1 + 0.00417));
        //savings = (float) ((money + savings) * (1 + 0.00417));
        //savings = (float) ((money + savings) * (1 + 0.00417));
        //savings = Math.round(savings * 100) / 100;
        //System.out.println("After the six month, the account value is $" + savings);
    }
}
