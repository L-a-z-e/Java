public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After Change d.x");
        System.out.println("main() : x = " + d.x);
    }

        static void change(Data d){
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    } // 간단히 처리하고자 할 때는 Data 의 int 를 배열로 선언해서 주소값을 매개변수로 이용하는 방법도 있다.
}