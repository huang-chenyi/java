package School.Experiment4.extra;

public class MainClass {
    public static void main(String args[]) {
        TV haierTV = new TV();
        haierTV.setChannel(5);/*代码2*///haierTV调用 setChannel(int m),并向参数m传递5
        System.out.println("haierTV 的频道是"+haierTV.getChannel());
        Family zhangSanFamily = new Family();
        zhangSanFamily.buyTV(haierTV);/*代码3*///zhangSanFamily调用void buyTV(TVtv)方法,并将haierTV传递给参数 TV
        System.out.println("zhangSanFamily 开始看电视节目");
        zhangSanFamily.seeTV();
        int m=2;
        System.out.println("zhangSanFamily将电视更换到"+m+"频道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV 的频道是"+haierTV.getChannel());
        System.out.println("zhangSanFamily 再看电视节目");
        zhangSanFamily.seeTV();
    }
}
