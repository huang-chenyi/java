package School.Experiment6.Test1;

public class Goods {
    private String name;
    private boolean isDanger;

    public Goods(String name, boolean isDanger) {
        this.name = name;
        this.isDanger = isDanger;
    }

    public String getName() {
        return name;
    }

    public boolean isDanger() {
        return isDanger;
    }
}