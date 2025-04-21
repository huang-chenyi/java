package School.Experiment4.Game;

public class Titan {
    //数据成员
    private int Energy;
    private int Experience;
    //无参构造
    public Titan() {
        this.Energy = 800;
        this.Experience = 0;
    }
    //带参构造
    public Titan(int Energy) {
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
    public Zues fight(Zues z){
        int harm = (int) (Math.random() * 91) + 10;
        z.setEnergy(z.getEnergy() - harm);
        this.setExperience(z.getExperience() + harm * 2);//titan造成1点攻击，获得2点经验
        while (this.getExperience() >= 50) { //经验值每增加50时,生命值＋1
            this.setEnergy(this.getEnergy() + 1);
            this.setExperience(this.getExperience() - 50);
        }
        //if (z.getEnergy() >= 0)
        System.out.println("Titan攻击Zues，产生:" + harm + "点攻击值，Zues当前Energy值为" + z.getEnergy());
        return z;
    }
}
