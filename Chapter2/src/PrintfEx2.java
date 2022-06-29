public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.github.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1 = %f | %e | %g %n", f1, f1, f1);
        System.out.printf("f2 = %f | %e | %g %n", f2, f2, f2);
        System.out.printf("f3 = %f | %e | %g %n", f3, f3, f3); // %g 값 간략하게 표시할때 사용

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n",d); // 전체 14자리, 소수 10자리
        System.out.printf("url = %s %n" , url );
        System.out.printf("[%20s]%n",url); // 전체 20자리
        System.out.printf("[%-20s]%n",url); // 왼쪽 정렬
        System.out.printf("[%-8s]%n",url); // 왼쪽 정렬인데 글자수보다 적으면? -> 다나옴
        System.out.printf("[%.8s]%n",url); // 왼쪽에서 8글자만 출력

    }
}
