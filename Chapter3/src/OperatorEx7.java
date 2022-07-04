public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b);
        System.out.println(c); // -128~127 이므로 손실 발생
    }
}
