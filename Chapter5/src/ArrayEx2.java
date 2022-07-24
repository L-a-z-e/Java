import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[] {1,2,3,4};
        int[] iArr4 =  {1,2,3,4};
        char[] chArr = {'a','b','c','d'};

        for( int i=0; i< iArr1.length ; i++ ){
            iArr1[i] = i +1;
        }

        for (int i=0 ; i<iArr2.length ; i++){
            iArr2[i] = (int)(Math.random() * 10);
        }

        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(iArr4));
        System.out.println(Arrays.toString(chArr));

        System.out.println();
        System.out.println(iArr4);
        System.out.println(chArr);

    }
}
