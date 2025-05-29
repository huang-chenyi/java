package School.Experiment6.Test1;

public class Test {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Goods apple = new Goods("苹果", false);
        Goods bomb = new Goods("炸药", true);
        Goods suit = new Goods("西服", false);
        Goods sulfuricAcid = new Goods("硫酸", true);
        Goods watch = new Goods("手表", false);
        Goods mercury = new Goods("硫磺", true);

        try {
            machine.checkBag(apple);
            machine.checkBag(bomb);
            machine.checkBag(suit);
            machine.checkBag(sulfuricAcid);
            machine.checkBag(watch);
            machine.checkBag(mercury);
        } catch (DangerException e) {
            System.out.println(e);
        }
    }
}