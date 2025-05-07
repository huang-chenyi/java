package School.Experiment5.Test1;
//ChinaPeople.java
public class ChinaPeople extends People{

    @Override
    public void speakHello() {
        super.speakHello();
    }
    @Override
    public void averageHeight() {
        height=168.78;
        System.out.println("中国人的平均身高:"+height+"厘米");
    }
    @Override
    public void averageWeight() {
        weight=65.0;
        System.out.println("中国人的平均体重:"+weight+"千克");
    }

    public void chinaGongfu(){
        System.out.println("坐如钟、站如松、睡如弓");
    }
}
