package Test;

public class Test {
            public static void main(String [] args) {
                String s1 = "abc";
                String s2 = s1;
                s2 += "def";
                s1.concat("def");
                System.out.println("s1=" + s1 + " s2=" + s2);
            }
}