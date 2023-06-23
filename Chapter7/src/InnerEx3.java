public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner{
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner{
        //int siv = outerIv; Static 클래스는 외부 클래스의 Instance 멤버에 접근할 수 없다.
        static int scv = outerCv;

    }

    void myMethod(){
        int lv = 0;
        final int LV = 0;

        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;


        }
    }
}
