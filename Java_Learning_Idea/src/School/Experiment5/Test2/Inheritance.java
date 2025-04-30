package School.Experiment5.Test2;

class SuperClass {
    int x;
    SuperClass(){
        x = 4;
    }
    void doSomething() {
        System.out.println("in SuperClass.doSomething:");
        System.out.println("x="+x);
    }
}

class SubClass extends SuperClass {
    int x;
    SubClass(){
        super();//类被实例化时的第一句话
        x = 5;
        System.out.println("in SubClass:");
        System.out.println("x="+x);
    }
    void doSomething( ) {
        super.doSomething(); //super调用父类的方法
        System.out.println("in SubClass.doSomething:");
        System.out.println("super.x="+super.x+" sub.x="+x);
    }
}

public class Inheritance {
    public static void main(String[] args){
//        SuperClass superA = new SubClass();       //第30行
//        superA.doSomething();                  //第31行

        SubClass subC=new SubClass();
        subC.doSomething();
    }
}
