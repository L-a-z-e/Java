public class OperatorEx30 {
    static  String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        System.out.println(tmp.length());
        return tmp.substring(tmp.length()-32);
    }
    public static void main(String[] args) {
        int dec = 8;

        System.out.printf("%d >> %d = %4d \t %s%n", dec, 1, dec>>1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t %s%n", dec, 2, dec>>2, toBinaryString(dec >> 2));
        System.out.printf("%d >> %d = %4d \t %s%n", dec, 3, dec>>3, toBinaryString(dec >> 3));
        System.out.printf("%d << %d = %4d \t %s%n", dec, 1, dec<<1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t %s%n", dec, 2, dec<<2, toBinaryString(dec << 2));
        System.out.printf("%d << %d = %4d \t %s%n", dec, 3, dec<<3, toBinaryString(dec << 3));

    }
}
