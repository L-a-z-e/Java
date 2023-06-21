public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long result1 = myMath.add(5,3);
        long result2 = myMath.subtract(5L, 3);
        long result3 = myMath.add (5L, 3L);
        double result4 = myMath.divide(5,3);
        double result5 = myMath.divide(5L,3L); // MyMath.divide 에서 매개변수는 double 이지만 Long 형으로 인수를 입력 -> 자동 형변환 된다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
    }
}

class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}