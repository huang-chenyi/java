package School.Examination;

class A {
    void operate(int c[]) {
        int i;
        for (i = 0; i < c.length; i++) c[i] = 3 * c[i];
    }
}
public class test2 {
        public static void main(String[] args) {
            A a = new A();
            int b[] = {1, 2, 3, 4};
            a.operate(b);
            for (int i = 0; i < b.length; i++)
                System.out.println(b[i]);
        }
    }