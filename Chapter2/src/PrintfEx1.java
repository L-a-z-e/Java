public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int i = 10;
        long l = 100_000_000_000L;
        long l2 = 0xFFFF_FFFF_FFFF_FFFFL;
        int bin = 0b10;
        int oct = 010;
        int hex = 0x10;

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n ", s);
        System.out.printf("c=%c%n ", c);
        System.out.printf("i=[%5d]%n ", i);
        System.out.printf("i=[%-5d]%n ", i);
        System.out.printf("i=[%05d]%n ", i);
        System.out.printf("l=%d%n", l);
        System.out.printf("l2=%x%n", l2);
        System.out.printf("l2=%#x%n", l2);
        System.out.printf("bin = %s , %d%n", Integer.toBinaryString(bin), bin);
        System.out.printf("oct = %o , %d%n", oct, oct);
        System.out.printf("hex = %x , %d%n", hex, hex);






    }
}
