import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                ,{"computer", "컴퓨터"}
                ,{"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for( int i = 0 ; i < words.length ; i++ ){
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if( tmp.equals(words[i][1]))
                System.out.println("정답");
            else
                System.out.println("오답");

        }
    }
}
