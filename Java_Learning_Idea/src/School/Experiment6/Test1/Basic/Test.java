package School.Experiment6.Test1.Basic;

public class Test {
    public static void main(String[] args) {
        // 创建Machine类的实例
        Machine machine = new Machine();

        // 创建多个Goods对象
        Goods[] goodsList = {
                new Goods("苹果", false),
                new Goods("炸药", true),
                new Goods("西服", false),
                new Goods("硫酸", true),
                new Goods("手表", false),
                new Goods("硫磺", true)
        };

        // 使用try-catch语句处理异常
        for (Goods goods : goodsList) {
            try {
                machine.checkBag(goods);
            } catch (DangerException e) {
                // 捕获DangerException异常，记录危险品名称
                e.toShow();
                System.out.println(e.getName() + "被禁止!");
            }
        }
    }
}

//苹果不是危险品！苹果检查通过
//危险品！炸药被禁止!
//西服不是危险品！西服检查通过
//危险品！硫酸被禁止!
//手表不是危险品！手表检查通过
//危险品！硫磺被禁止