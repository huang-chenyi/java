package Bilibili.B.BianLiangHeFangFa;

public class ExcercizeAndShuZu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int from = 3;
        int to = 6;
        int[] copyArr = copyOfRange(arr, from, to);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
        for (int j : copyArr) {
            System.out.println(j);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int num = to - from + 1;
        int[] arrNew = new int[num];
        int k = 0;
        for (int i = from; i < to + 1; i++) {
            arrNew[k++] = arr[i];
        }
        return arrNew;
    }

}
