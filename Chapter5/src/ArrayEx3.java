import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for ( int i = 0; i<arr.length ; i++)
            arr[i] = i;

        System.out.println(arr);

        int[] tmp = new int[arr.length*2];

        for (int i = 0 ; i < arr.length ; i++)
            tmp[i] =  arr[i];

        arr = tmp;

        System.out.println(arr);
        System.out.println(tmp);

        for (int i = 0 ; i < arr.length ; i++)
            System.out.println(arr[i]);
    }
}
