package School.Experiment5.Test1;

public class Test {
    public static void main(String[] args) {
        ChinaPeople CP = new ChinaPeople();
        AmericanPeople AP = new AmericanPeople();
        BeijingPeople BP = new BeijingPeople();
        // 输出共有行为和属性结果
        CP.speakHello();
        AP.speakHello();
        BP.speakHello();

        CP.averageHeight();
        AP.averageHeight();
        BP.averageHeight();

        CP.averageWeight();
        AP.averageWeight();
        BP.averageWeight();
        // 输出各类特有行为和属性的输出结果
        CP.chinaGongfu();
        AP.americanBoxing();
        BP.beijingOpera();
    }
}