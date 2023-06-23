public class InnerEx2 {
    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod(){
        //InstanceInner obj1 = new InstanceInner(); 스태틱 멤버에서는 인스턴스 멤버 호출 안됨
        StaticInner cv = new StaticInner();

        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner(); // 외부 클래스를 먼저 생성해야지 접근가능
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // LocalInner lv = new LocalInner(); 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
    }

    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
