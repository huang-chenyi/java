package School.Examination;

import java.util.Random;

class Animal {
    private String habitat;
    protected String sound;
    public Animal(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
}
class Cat extends Animal {
    private String name;
    private double weight;
    private String food;
    public Cat(String name, double weight) {
        super("House");
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public void eatFood() {
        String[] foods = {"小鱼", "红萝卜", "老鼠", "骨头"};
        Random random = new Random();
        int foodIndex = random.nextInt(foods.length);
        this.food = foods[foodIndex];

        System.out.println(name + "吃" + food);

        //只有吃Fish时体重增加，其他食物体重减少
        if (food.equals("小鱼") || food.equals("老鼠")) {
            System.out.println("吃饱了，我变胖了！原体重为"+ getWeight() + " kg,");
            setWeight(weight + 0.1);
            System.out.println("现体重变为为" + getWeight() + "kg");
        }
        else {
            System.out.println("没吃饱，我都饿瘦了！原体重为"+ getWeight() + " kg,");
            setWeight(weight - 0.1);
            System.out.println("现体重变为为" + getWeight() + "kg");
        }
    }
}
public class test3 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[20];
        Random random = new Random();
        //创建20只猫，随机设置名字和初始体重
        for (int i = 0; i < 20; i++) {
            cats[i] = new Cat("Cat" + (i + 1), 3.0 + random.nextDouble());
        }
        //喂食每只猫
        for (Cat cat : cats) {
            cat.getSound();
            cat.eatFood();
        }
    }
}