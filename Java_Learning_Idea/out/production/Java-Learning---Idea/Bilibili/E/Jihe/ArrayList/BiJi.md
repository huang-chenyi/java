# 集合笔记
**集合不可直接存储基本数据类型**
## 1. 创建集合的对象

泛型：限定集合中存储数据的类型(可以自定义（创建类）)

---

各个数据类型对应的包装类--泛型

- byte---Byte    
- short---Short    
- long---Long
- float---Float    
- double---Double   
- boolean---Boolean
- **int---Integer**
- **char---Character**

---

**ArrayList<String> list = new ArrayList< String--可以省略 >();**

---

打印对象不是地址值，而是集合中存储数据内容

在输出时会用[]将所有数据进行包裹

System.out.println(list);

---

添加元素的返回值

boolean result1 = list.add("aaa");

在集合中.add方法始终返回一个true类型的布尔变量

System.out.println(result1);

---

## 2. 添加元素

list.add("bbb");

list.add("ccc");

输出集合元素

System.out.println(list);


---

## 3. 删除元素

boolean result2 = list.remove("aaa");

删除成功返回true，删除失败返回false

boolean result3 = list.remove("ddd");

System.out.println(result2);

System.out.println(result3);

根据索引删除

String str = list.remove(0);

删除成功返回删除的元素,不可删除不存在的元素

System.out.println(str);

输出集合元素

System.out.println(list);

---

## 4. 修改元素

String str1 = list.set(0, "ggg");

修改成功返回被覆盖的元素
   
System.out.println(str1);
   
输出集合元素
   
System.out.println(list);

---

## 5. 查询元素
   
String str2 = list.get(0);
   
结果不被包含在[]中
   
System.out.println(str2);

---

## 6. 获取长度

int a = list.size();
   
System.out.println(a);