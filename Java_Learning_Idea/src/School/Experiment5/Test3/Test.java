package School.Experiment5.Test3;
//Test.java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Random random = new Random();
        //循环生成100个动物
        int bi = 1;
        int in = 1;
        int re = 1;
        int fi = 1;
        for (int i = 0; i < 100; i++) {
            //生成属性成员编号
            //4个一循环
            int Index = random.nextInt(4);
            switch (Index) {
                case 0:
                    Animal bird = new Bird("鸟类", random.nextInt(100) + 10 + " km/h");
                    bird.setId(bird.getId().append(bi++));
                    animals.add(bird);
                    break;
                case 1:
                    Animal insect = new Insect("昆虫类", random.nextInt(6) + 2);
                    insect.setId(insect.getId().append(in++));
                    animals.add(insect);
                    break;
                case 2:
                    Animal reptile = new Reptile("爬行类", random.nextBoolean());
                    reptile.setId(reptile.getId().append(re++));
                    animals.add(reptile);
                    break;
                case 3:
                    Animal fish = new Fish("鱼类", random.nextBoolean() ? "淡水" : "咸水");
                    fish.setId(fish.getId().append(fi++));
                    animals.add(fish);
                    break;
            }
        }
        //报告动物的类别和天赋
        for (Animal animal : animals) {
            animal.showMessage();
            animal.showTalent();
            System.out.println();
        }
    }
}
