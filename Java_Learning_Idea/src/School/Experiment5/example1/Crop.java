package School.Experiment5.example1;
import java.time.LocalDateTime;

public class Crop {
    private String name;          //名称
    private int maturity;         //成熟期
    private int numsOfFruits;     //果实数量
    private int harvestTime;      //采摘期
    private LocalDateTime plantDate;       //记录种植时间
    public Crop(){
        this.name = "默认";
    }
    public Crop(String name, int maturity, int numsOfFruits, int harvestTime){
        this.name = name;
        this.maturity = maturity;
        this.numsOfFruits = numsOfFruits;
        this.harvestTime = harvestTime;
        this.plantDate = LocalDateTime.now();
    }
    
    public void print(){
        System.out.println("*****作物特性*****");
        System.out.println(this.name);
        System.out.println("每季成熟期"+ this.maturity + "天,"
                +"采摘期"+ this.harvestTime + "天, "
                +"每季产量为" + this.numsOfFruits);
    }

    public void grow(int days){
        System.out.println("作物生长"+days+"天");
    }

    public void printGrowReport(int days){
        System.out.println("输出作物生长报告...");
    }

    public String getName() {
        return name;
    }

    public int getMaturity() {
        return maturity;
    }

    public int getNumsOfFruits() {
        return numsOfFruits;
    }

    public int getHarvestTime() {
        return harvestTime;
    }

    public LocalDateTime getPlantDate() {
        return plantDate;
    }
}
