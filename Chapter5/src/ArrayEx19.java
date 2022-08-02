public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                ,{ 20, 20, 20}
                ,{ 30, 30, 30}
                ,{ 40, 40, 40}
                ,{ 50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        for ( int i = 0; i < score.length ; i++){
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for( int j = 0 ; j < score[i].length ; j++){
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            System.out.println();
            avg = sum / (float)score[i].length;
            System.out.println(sum);
            System.out.println(avg);
        }

        System.out.println("kor"+korTotal + "eng" + engTotal + "math" + mathTotal);
    }
}
