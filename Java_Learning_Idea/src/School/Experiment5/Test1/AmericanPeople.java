package School.Experiment5.Test1;
//AmericanPeople.java
public class AmericanPeople extends People{
    @Override
    public void speakHello() {
        System.out.println("How do you do");
    }
    @Override
    public void averageHeight() {
        height=176.0;
        System.out.println("American`s average height:"+height+"cm");
    }
    @Override
    public void averageWeight() {
        weight=75.0;
        System.out.println("American`s average weight:"+weight+"kg");
    }

    public void americanBoxing(){
        System.out.println("直拳、钩拳、组合拳");
    }
}
