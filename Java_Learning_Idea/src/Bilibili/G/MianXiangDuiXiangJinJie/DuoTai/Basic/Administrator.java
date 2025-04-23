package Bilibili.G.MianXiangDuiXiangJinJie.DuoTai.Basic;

import Bilibili.Z.NoteBook.Basic;

public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + ", " + getAge());
    }
}
