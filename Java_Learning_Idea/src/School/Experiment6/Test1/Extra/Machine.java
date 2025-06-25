package School.Experiment6.Test1.Extra;

public class Machine {
    // 检查商品方法
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            // 如果是危险品，抛出DangerException异常
            throw new DangerException(goods.getName());
        } else {
            // 如果不是危险品，输出检查通过信息
            System.out.println(goods.getName() + "不是危险品！" + goods.getName() + "检查通过");
        }
    }
}