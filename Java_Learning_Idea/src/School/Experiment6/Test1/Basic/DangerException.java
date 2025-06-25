package School.Experiment6.Test1.Basic;

import java.lang.Exception;

public class DangerException extends Exception {
    private String name; // 记录危险品的名称

    // 构造方法
    public DangerException(String name) {
        super("危险品！");
        this.name = name;
    }

    // 定义toShow方法，输出“危险品！”
    public void toShow() {
        System.out.print("危险品！");
    }

    // 获取危险品的名称
    public String getName() {
        return name;
    }
}
