package School.Experiment5.example1;

public class Test {
    public static void main(String[] args) {
        //种植苹果
        Land land1  = new Land();
        Crop crop1 = new AppleTree("金帅");
        land1.plant(crop1);
        System.out.println("-------------------------");
        //种植玉米
        Land land2 = new Land();
        Crop crop2 = new Corn();
        land2.plant(crop2);
    }
}
