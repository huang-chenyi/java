package School.Experiment4.Game;

public class Zues {
    //数据成员Energy
    private int Energy;
    private int Experience;
    //无参构造
    public Zues() {
        this.Energy = 1200;
        this.Experience = 0;
    }
    //带参构造
    public Zues(int Energy) {
        this.Energy = Energy;
        this.Experience = 0;
    }
    //Energy的设置器和读取器
    public int getEnergy() {
        return Energy;
    }
    public void setEnergy(int energy) {
        Energy = energy;
    }
    //Experience的设置器和读取器
    public int getExperience() {
        return Experience;
    }
    public void setExperience(int experience) {
        Experience = experience;
    }
    //成员方法fight
    public Titan fight(Titan t){
        int harm = (int) (Math.random() * 71);
        t.setEnergy(t.getEnergy() - harm);
        this.setExperience(t.getExperience() + harm * 3);//zues造成1点攻击，获得3点经验
        while (this.getExperience() >= 50) { //经验值每增加50时,生命值＋1
            this.setEnergy(this.getEnergy() + 1);
            this.setExperience(this.getExperience() - 50);
        }
        //if (t.getEnergy() >= 0)
        System.out.println("Zues攻击Titan，产生:" + harm + "点攻击值，Titan当前Energy值为" + t.getEnergy());
        return t;
    }
}
