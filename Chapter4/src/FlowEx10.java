import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수 입력>");
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score / 10){
            case 10 :
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("학점은 " + grade);
    }
}
