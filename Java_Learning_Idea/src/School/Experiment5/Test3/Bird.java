package School.Experiment5.Test3;
//鸟类
public class Bird extends Animal {
    private String flightSpeed; // 特有属性：飞行速度

    public Bird( String type, String flightSpeed) {
        super(new StringBuilder("Bird"), type);
        this.flightSpeed = flightSpeed;
    }

    public String getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(String flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void showTalent() {
        System.out.println("天赋：飞行速度为" + getFlightSpeed() + "km/h");
    }

    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("飞行速度: " + getFlightSpeed());
    }
}
