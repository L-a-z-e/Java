import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A','B','C','D'};
        char[] num = {'1','2','3','4','5'};

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result, abc.length,num.length);
        System.out.println(Arrays.toString(result));
    }
}
