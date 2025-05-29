package School.Experiment6.Test1;

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            throw new DangerException();
        }
        System.out.println(goods.getName() + "不是危险品！");
    }
}