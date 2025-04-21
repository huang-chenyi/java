package School.Study;

public class TryToStudy {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        float num = x=!(( x>=--y&&y++<=z--)||(y==z))?y:z ;
        System.out.println(num);
    }
}
