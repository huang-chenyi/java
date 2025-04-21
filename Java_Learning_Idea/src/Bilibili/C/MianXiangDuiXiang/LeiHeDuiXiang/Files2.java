package Bilibili.C.MianXiangDuiXiang.LeiHeDuiXiang;

public class Files2 {
    public static void main(String[] args) {
        //第一个Files1
        Files1 study1 = new Files1();

        study1.name = "LiHua";
        study1.age = 18;
        System.out.println(study1.name);
        System.out.println(study1.age);

        study1.Class();
        study1.School();

        //第二个Files1
        Files1 study2 = new Files1();
        study2.name = "ZhangJie";

    }
}
