public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;
        float avg2 = 0f;
        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length ; i++){
            sum += score[i];
        }
        avg = sum / (float)score.length;
        avg2 = (float)sum / score.length;

        System.out.println(avg);
        System.out.println(avg2);
    }
}
