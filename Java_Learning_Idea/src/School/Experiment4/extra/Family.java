package School.Experiment4.extra;

public class Family {
    TV homeTV;

    void buyTV(TV tv) {
        homeTV = tv;
        /*代码1*/  //将参数tv赋值给homeTV
    }

    void remoteControl(int m) {
        homeTV.setChannel(m);
    }

    void seeTV() {
        homeTV.showProgram(); //homeTV调用 showProgram()方法
    }
}
