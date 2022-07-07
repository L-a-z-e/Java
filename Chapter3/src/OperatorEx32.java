public class OperatorEx32 {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;

        int absX, absY;

        absX = x>=0 ? x : -x;
        absY = y>0 ? y:-y;

        System.out.println(absX);
        System.out.println(absY);
    }
}
