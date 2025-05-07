# 包和Final

---

---

## 包

---

### 什么是包

包就是文件夹。用来管理各种不同功能的Java类，方便后期代码维护。

包名的规则：公司域名反写+包的作用，需要全部英文小写，见名知意。

例子：com.itheima.domain

### 使用其他类的规则

1. 使用同一个包中的类时，不需要导包。

2. 使用java.lang包中的类时，不需要导包。

3. 其他情况都需要导包

4. 如果同时使用两个包中的同名类，需要用全类名。

5. 使用其他类时，需要使用全类名。

```
public class Test.Test {
    public static void main(String[] args) {
        com.itheima.domain.Student s = new com.itheima.domain.Student();
    }
}
```

6. 为了方便，可以使用import关键字进行导包

```
import com.itheima.domain.Student;  <--导包
public class Test.Test {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
```


















