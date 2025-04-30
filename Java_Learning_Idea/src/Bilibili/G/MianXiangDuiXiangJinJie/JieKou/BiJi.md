# 接口

(**异于**抽象类和抽象方法的拓展)

## 定义和使用

1. 接口用关键字**interface**来定义

    public interface 接口名 {}

2. 接口不能实例化

3. 接口和类之间是实现关系，通过implements关键字表示

    public class 类名 implements 接口名 {}

4. 接口的子类（实现类）

    要么重写接口中的所有抽象方法

    要么是抽象类

5. 注意1：接口和类的实现关系，可以单实现，也可以多实现。

    public class 类名 implements 接口名1，接口名2 {}

6. 注意2：实现类还可以在继承一个类的同时实现多个接口。

    public class 类名 extends 父类 implements 接口名1，接口名2 {}






