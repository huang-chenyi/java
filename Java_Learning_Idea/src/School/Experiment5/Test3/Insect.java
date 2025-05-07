package School.Experiment5.Test3;
//昆虫类
public class Insect extends Animal {
    private int Legs; //特有属性：腿的数量

    public Insect(String type, int Legs) {
        super(new StringBuilder("Insect"), type);
        this.Legs = Legs;
    }

    public int getLegs() {
        return Legs;
    }

    public void setLegs(int Legs) {
        this.Legs = Legs;
    }

    @Override
    public void showTalent() {
        System.out.println("天赋：有" + getLegs() + "条腿");
    }

    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("腿的数量: " + getLegs());
    }
}