public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d); // d2 에 tmp의 주소 연결
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    }

    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp; // 반환 타입이 참조형이라는 것은 메서드가 객체의 주소를 반환한다는 의미
    }
}
