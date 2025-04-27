package Bilibili.G.MianXiangDuiXiangJinJie.QuanXian_and_DaiMaKuai.DaiMaKuai.CodeBlockDemo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        {
            int b = 20;
        }
        int a = 10;
        System.out.println(a);
        //System.out.println(b);  报错，b只存在于{}里
    }
}
