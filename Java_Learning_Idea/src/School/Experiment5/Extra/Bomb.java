package School.Experiment5.Extra;

public class Bomb implements IEquipment {
    public String getName(){
        return "炸弹";
    }
    public void show(){
        System.out.print(this.getName()+"爆炸攻击！");
    }
}
