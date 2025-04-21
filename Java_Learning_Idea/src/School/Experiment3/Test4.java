package School.Experiment3;

public class Test4 {
    public static void main(String[] args) {
        //创建柜子模型
        boolean[] cupboard = new boolean[100];
        //第一个学生
        first(cupboard);
        //其他剩下的学生
        for (int i=2;i<=100;i++) {
            other(cupboard,i);
        }
        for (int i=1;i<=100;i++) {
            if (cupboard[i - 1]) {
                System.out.print(i + " ");
            }
        }
    }
    //S1打开所有柜门
    public static void first(boolean[] cupboardTest) {
        for(int j=0;j<100;j++){
            cupboardTest[j] = true;
        }
    }
    //后续学生对编号后的柜门进行操作
    public static void other(boolean[] cupboardTest, int num) {
        for(int j = num - 1;j<100;j+=num){
            cupboardTest[j] = !cupboardTest[j];
        }
    }
}
