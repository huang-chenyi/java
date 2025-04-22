package Bilibili.G.MianXiangDuiXiangJinJie.Static.FangFa;

public class ArrayUtil {
    //私有化构造方法
    //目的：不让外界创建它的对象
    private ArrayUtil() {

    }
    //定义为静态的，方便直接类名调用

    //打印数组方法
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }
            else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //返回平均值方法
    public static double getAverage(double[] arr){
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum / arr.length;
    }

}
