
class TvTest {
    public static void main(String[] args) {
        // Tv 클래스 타입의 참조변수 t 선언, 메모리에 참조변수 t를 위한 공간 마련, 아직 인스턴스 생성전이므로 아무것도 할 수 없음
        Tv t ;
        // 연산자 new 에 의해 Tv 클래스의 인스턴스가 메모리의 빈 공간에 생성 power = false, color = null, channel = 0 (각 자료형의 default)
        // 생성된 객체의 주소값이 대입연산자에 의해 t에 저장되고 t를 통해 Tv 인스턴스에 접근 가능하다.
        t = new Tv();
        // 인스턴스의 멤버변수를 사용하려면 참조변수.멤버변수
        t.channel = 7;
        // t가 참조하고있는 Tv 인스턴스의 메서드를 호출한다.
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 번 입니다.");
    }
}
