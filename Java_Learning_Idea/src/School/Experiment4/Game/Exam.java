package School.Experiment4.Game;

public class Exam {
    public static void main(String[] args) {
        Titan titan = new Titan();
        Zues zues = new Zues();
        int fight_time = 0;
        while(titan.getEnergy() >= 0 && zues.getEnergy() >= 0){
            fight_time++;
            zues = titan.fight(zues);//titan攻击zues
            if (zues.getEnergy() < 0) {
                break;
            }
            titan = zues.fight(titan);//zues攻击titan
        }
        //结果
        if(zues.getEnergy() < 0){
            System.out.println("Zues的Energy值为" + zues.getEnergy() + "，已经失败，获胜者是Titan！");
        }
        else{
            System.out.println("Titan的Energy值为" + titan.getEnergy() + "，已经失败，获胜者是Zues！");
        }
        System.out.println("交手次数：" + fight_time);

    }

}
//2、 两游戏角色决斗。习题2中扩展部分规则参考：
//    角色1（Titan）交手次数＋1，生命值－1,经验值＋2；
//   角色2（Zue）交手次数＋1,生命值－2,经验值＋3。经验值每增加50时,生命值＋1；
// 生命值<0判为负。生命值初始为1000,经验值初始为0。
//3、给定二个不同的角色，判定交手的胜负关系。
//4、实验报告给出决斗结果和交手次数
//扩展要求（Version2.0）：在类中添加游戏角色的交手次数、经验值、生命值之间的关系，并断定角色决斗的胜负，游戏若能采用GUI界面设计更佳。
