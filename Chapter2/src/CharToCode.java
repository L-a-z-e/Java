public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.println(ch);
        System.out.println(code);

        char ch2 = '가';
        System.out.println((int)ch2);
        System.out.printf("%X",(int)ch2);
    }
}
