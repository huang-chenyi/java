package School.Experiment5.Test3;
//爬行类
public class Reptile extends Animal {
    private boolean Scales; // 特有属性：是否有鳞片

    public Reptile(String type, boolean hasScales) {
        super(new StringBuilder("Reptile"), type);
        this.Scales = hasScales;
    }

    public boolean isScales() {
        return Scales;
    }

    public void setHasScales(boolean Scales) {
        this.Scales = Scales;
    }

    @Override
    public void showTalent() {
        System.out.println("天赋：是否具有鳞片：" + (isScales() ? "是" : "否"));
    }

    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("是否有鳞片：" + (isScales() ? "是" : "否"));
    }
}
