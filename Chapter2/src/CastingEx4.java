public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float) i;
        int i2 = (int)f;

        double d = (double)i;
        int i3 = (int)d;

        float f2 = 1.666f;
        int i4 = (int)f2;

        System.out.println(i);
        System.out.println(f);
        System.out.println(i2);

        System.out.println(d);
        System.out.println(i3);
        System.out.println(f2);
        System.out.println(i4);
    }
}
