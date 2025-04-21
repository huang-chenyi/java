package School.HomeWork._4._1;

public class Person_demo {
    public static void main(String[] args) {
        Person p = new Person("Jack",12);
        p.speak();
        p.setAge(21);
        System.out.println(p.getAge());
    }
}
