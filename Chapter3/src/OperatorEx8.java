public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a*b;
        System.out.println(c);

         c = (long)(a*b);
        System.out.println(c); // 이미 값이 손실이 일어난 뒤에 long으로 형변환

        c = a * (long)b;
        System.out.println(c);



    }
}
