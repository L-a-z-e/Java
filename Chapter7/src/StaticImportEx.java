import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx {
    public static void main(String[] args) {
        out.println(random()); //static 멤버를 사용할 때 편리
        out.println(PI);
    }
}
