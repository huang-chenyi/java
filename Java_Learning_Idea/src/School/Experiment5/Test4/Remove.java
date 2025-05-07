package School.Experiment5.Test4;
//Remove.java
import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        removeDuplicate(list);

        System.out.println("The distinct integers are ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    //向前检测数字是否已经出现，是则移除
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}


//优化代码，实现不再处理已处理过的重复数字

/*
import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        // 调用去重方法
        removeDuplicate(list);

        System.out.println("The distinct integers are: ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        // 使用一个布尔数组来标记是否已经处理过该元素
        boolean[] marked = new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if (marked[i]) {
                continue; // 如果已经标记为重复，则跳过
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    marked[j] = true; // 标记重复元素
                }
            }
        }
        // 创建一个新列表存储非重复元素
        ArrayList<Integer> distinctList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!marked[i]) {
                distinctList.add(list.get(i));
            }
        }
        // 清空原列表并添加去重后的元素
        list.clear();
        list.addAll(distinctList);
    }
}
*/
