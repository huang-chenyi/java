package School.Experiment5.example1;

public class AppleTree extends MultiSeasonsCrop {
    private String brand;
    public AppleTree(String brand){
        super("苹果树",10,100,2,3);
        this.brand = brand;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("作物品种："+this.brand);
    }
}
