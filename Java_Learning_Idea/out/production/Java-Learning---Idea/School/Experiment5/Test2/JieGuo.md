# 运行结果

## 第一次直接运行

in SubClass:

x=5

in SuperClass.doSomething:

x=4

in SubClass.doSomething:

super.x=4 sub.x=5

## 第二次删除 int x; 和 x = 5 后的运行结果

in SubClass:

**x=4**

in SuperClass.doSomething:

x=4

in SubClass.doSomething:

super.x=4 **sub.x=4**

## 第三次 多行注释 doSomthing 后的运行结果

in SubClass:

x=5

in SuperClass.doSomething:

x=4

## 第四次替换后运行结果

in SubClass:

x=5

in SuperClass.doSomething:

x=4

in SubClass.doSomething:

super.x=4 sub.x=5

# 答案

**问题1**

结果变化：

第一个输出x的语句中x的值从5变成了4

原因： 

删除语句后，x未初始化，又因为super()引用了SuperClass类中的构造方法，将x赋值为4

**问题2**

能

结果：

in SubClass:

x=5

in SuperClass.doSomething:

x=4

原因：





