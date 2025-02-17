package CH_05;

public class IntroCH05{
    public static void xMethod(double x, double y) {
        System.out.println(x + y);

    }
    public static void main(String[] args) {
        long total = 0;
        for (int i =1; i <= 365; i++){
            total +=i;
        }
        System.out.println(total);
    }
}
