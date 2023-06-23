public class InnerEx1 {
    class InstanceInner{
        int iv = 100;
        // static int cv = 100;  instance inner class 안에 static X
        final static int CONST = 100;
    }

    static class StaticInner{
        int iv = 200; // 생성안하면 static 클래스여도 사용 불가
        static int cv = 200;
    }

    void myMethod(){
        class LocalInner {
            int iv = 100;
            // static int cv = 300; static을 local class 에서 사용할 수 없음
            final static int CONST = 300; // final static 은 상수라서 가능
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        StaticInner st = new StaticInner();
        System.out.println(st.iv);
    }
}
