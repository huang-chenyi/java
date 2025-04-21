package School.HomeWork._3;

public class _3_2 {

    public static void main(String[] args) {
        int[] array1 = {16, 13, 15, 18, 12, 23};
        int[] array2 = {29, 36, 100, 34, 234};
        //调用合并方法
        int[] mergedArray = arrayMerge(array1, array2);
        //输出合并后的数组
        System.out.print("合并后的数组: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    //合并两个数组的方法
    public static int[] arrayMerge(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];
        //将第一个数组的元素复制到新数组
        System.arraycopy(a, 0, mergedArray, 0, a.length);
        //将第二个数组的元素复制到新数组
        System.arraycopy(b, 0, mergedArray, a.length, b.length);
        return mergedArray;
    }
}
