public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
       // char c2 = c1+1; 컴파일에러 c1 + 1 에서 int로 자동 형변환이 되므로 결과값 int 대입 type char -> error
        char c2 = 'a' +1;

        System.out.println(c2);

        char c3 = 'ㅁ';
        System.out.printf("%d",(int)c3);

    }

}
