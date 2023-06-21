class MyMath2{
    long a,b;
    long add() { return a+b; }
    long substract() {  return a-b; }
    long multiply() { return a*b; }
    double divide() { return a/b; }

    static long add(long a, long b) {return a+b;}
    static long substract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divide(double a, double b) {return a/b;}
}
public class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(300,200));
        System.out.println(MyMath2.substract(300,200));
        System.out.println(MyMath2.multiply(300,200));
        System.out.println(MyMath2.divide(300,200));

        MyMath2 mm = new MyMath2();
        mm.a = 300L;
        mm.b = 200L;
        System.out.println(mm.add());
        System.out.println(mm.substract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
// divide 가 static 메서드에서는 1.5 인스턴스 메서드에서는 1.0으로 나오는 이유는 형변환이 매개변수로 들어갈때 일어나는 static 메서드
// <-> 인스턴스 메서드에서는 return (a/b) 에서 이미 1이 나오고 이 다음에 형변환이 일어남
// 해결방법은 ? return (double)a/b 로 이쪽에서 명시적 형변환을 먼저 해주면 됨
}
