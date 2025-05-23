# 抽象类和抽象方法

## 抽象方法

1. 抽象方法：将共性的行为（方法）抽取到父类之后。

    由于每一个子类执行的内容是不一样，所以在父类中不能确定具体的方法体

    该方法就可以定义为抽象方法。

2. 抽象类：如果一个类中存在抽象方法，那么该类就必须声明为抽象类

## 定义格式

1. 抽象方法的定义格式

    public abstract 返回值类型 方法名(参数列表);

2. 抽象类的定义格式：

    public abstract class 类名{}

## 注意事项

1. 抽象类不能实例化

2. 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类

3. 可以有构造方法

4. 抽象类的子类

    - 要么重写抽象类中的所有抽象方法

    - 要么是抽象类

## 意义

强制子类按照父类的形参和返回值的格式进行重写






