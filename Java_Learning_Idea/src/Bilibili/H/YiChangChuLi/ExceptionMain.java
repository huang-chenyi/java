package Bilibili.H.YiChangChuLi;

public class ExceptionMain {
    public static void main(String[] args) {

        Demo demo = null;

        try{

            System.out.println(demo.getName());

            System.out.println("Try is going on");

        }catch(Exception e){//Exception全能异常处理器

            demo = new Demo();
            //e.printStackTrace();
            System.out.println("Catch is going on");

        }finally{

            System.out.println("Finally is going on");

        }

        int a = 1;

        System.out.println(a);

        demo.setName("yourName");

        System.out.println(demo.getName());
    }
}
