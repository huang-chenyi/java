package School.Experiment5.Test3;
//鱼类
public class Fish extends Animal {
    private String waterType; // 特有属性：生活水域类型（淡水或咸水）

    public Fish(String type, String waterType) {
        super(new StringBuilder("Fish"), type);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public void showTalent() {
        System.out.println("天赋：生活在" + getWaterType() + "水域");
    }

    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("生活水域: " + getWaterType());
    }
}