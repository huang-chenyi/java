package School.Experiment6.Test1.Extra;

public class ArtificialMachine extends Machine {
    @Override
    public void checkBag(Goods goods) throws ExplorDangerException {
        if (goods.isDanger()) {
            // 如果是爆炸品，抛出ExplorDangerException异常
            throw new ExplorDangerException(goods.getName());
        } else {
            // 如果不是危险品，输出检查通过信息
            System.out.println(goods.getName() + "不是爆炸品！" + goods.getName() + "检查通过");
        }
    }
}

