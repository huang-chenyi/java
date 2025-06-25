package School.Experiment6.Test1.Extra;

public class ExplorDangerException extends DangerException {
    public ExplorDangerException(String name) {
        super(name);
    }
    @Override
    public void toShow() {
        System.out.print("易爆危险品！");
    }
}
