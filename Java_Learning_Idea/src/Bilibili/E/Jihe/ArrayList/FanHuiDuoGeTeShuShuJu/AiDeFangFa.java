package Bilibili.E.Jihe.ArrayList.FanHuiDuoGeTeShuShuJu;

import java.util.ArrayList;

public class AiDeFangFa {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Phone> list = new ArrayList<>();
        // 创建手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        // 添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // 调用筛选方法
        ArrayList<Phone> result = back(list);

        // 打印结果
        System.out.println("价格低于3000元的手机：");
        for (Phone phone : result) {
            System.out.println(phone);
        }
    }

    // 筛选价格低于3000的手机
    public static ArrayList<Phone> back(ArrayList<Phone> list1) {
        ArrayList<Phone> listResult = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getPrice() < 3000) {
                listResult.add(list1.get(i));
            }
        }
        return listResult;
    }
}
