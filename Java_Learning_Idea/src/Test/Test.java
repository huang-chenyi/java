package Test;

class T {
    void f(int x) {
        System.out.println("int in T: " + x);
    }

    void f(double x) {
        System.out.println("double in T: " + x);
    }

    void f(Object x) {
        System.out.println("Object in T: " + x);
    }
}
class S extends T {
    void f(int x) {
        System.out.println("int in S: " + x);
    }
}
class Test {
    public static void main(String[] args) {
        T t = new S();
        t.f(20);
        t.f(20L);
        t.f(3.5f);
        t.f(3.5);
        t.f("abcdef");
    }
}