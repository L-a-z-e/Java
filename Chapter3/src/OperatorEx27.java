public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'C';

        System.out.printf("b = %b %n", b);
        System.out.printf("!b = %b %n", !b);
        System.out.printf("!!b = %b %n", !!b);

        System.out.println();
        System.out.printf("c = %c%n", c);
        System.out.printf("('a'<=c && c <='z')  = %b%n",  'a' <= c && c <= 'z');
        System.out.printf("!('a'<=c && c <='z' ) = %b%n",  !('a' <= c && c <= 'z'));
    }
}
