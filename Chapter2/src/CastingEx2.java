public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.printf("int -> byte %d , %d%n", i, b);


        i= 300;
        b = (byte)i;
        System.out.printf("int -> byte %d , %d %n", i, b);

        b=10;
        i = (int)b;
        System.out.printf("byte -> int %d , %d%n",b, i);

        b=-2;
        i = (int)b;
        System.out.printf("byte -> int %d , %d%n",b, i);

        System.out.println("i = " + Integer.toBinaryString(i));


    }
}
