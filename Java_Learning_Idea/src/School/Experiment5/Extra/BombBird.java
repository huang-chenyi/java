package School.Experiment5.Extra;

public class BombBird extends Bird{
    public BombBird(){
        super(new Bomb());
    }
    public void attack(){
        System.out.print("炸弹鸟攻击：");
        //this.getEquipment().show();
    }

}
