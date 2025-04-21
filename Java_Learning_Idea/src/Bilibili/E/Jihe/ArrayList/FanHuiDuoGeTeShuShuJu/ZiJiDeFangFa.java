package Bilibili.E.Jihe.ArrayList.FanHuiDuoGeTeShuShuJu;
//添加手机对象并返回要求的数据
//需求：
//定义Javabean类：Phone
//Phone属性：品牌，价格。
//main方法中定义一个集合，存入三个手机对象。
//分别为：小米，1000。苹果，8000。锤子2999。
//定义一个方法，将价格低于3000的手机信息返回。
import java.util.ArrayList;

public class ZiJiDeFangFa {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Phone> list = new ArrayList<>();
        //创建手机对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);
        //添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> result = back(list);

        System.out.println(result);


    }

    public static ArrayList<Phone> back(ArrayList<Phone> list1 ){
        ArrayList<Phone> listResult = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i).getPrice()<3000){
                listResult.add(list1.get(i));
            }
        }
        return listResult;
    }


}
