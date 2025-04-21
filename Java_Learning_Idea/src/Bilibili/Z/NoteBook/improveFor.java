package Bilibili.Z.NoteBook;

import java.util.ArrayList;
import java.util.List;

//不能直接修改集合：在增强型for循环中，不能直接修改集合的结构（如添加或删除元素），否则会抛出ConcurrentModificationException异常。
//不能获取索引：增强型for循环不提供元素的索引，如果需要索引，需要使用传统for循环。
//适用于只读操作：增强型for循环主要用于遍历和读取元素，如果需要对元素进行修改，可以结合传统for循环使用。
/*  for (元素类型 元素变量 : 遍历的目标) { 操作元素变量  }  */
/*元素类型：遍历的目标中元素的数据类型。
元素变量：用于存储当前遍历到的元素。
遍历的目标：可以是数组或实现了Iterable接口的集合。*/

public class improveFor {
    // 增强型for循环：语法简洁，适用于只需遍历元素值的场景
    public static void main(String[] args) {

        // 使用增强型for循环遍历数组
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }

        // 使用增强型for循环遍历集合
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        for (String fruit : list) {
            System.out.println(fruit);
        }

    }

}
