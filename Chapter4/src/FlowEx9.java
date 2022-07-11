import java.util.Scanner;

public class FlowEx9 {
    public static void main(String[] args) {
        char grade = ' ';
        System.out.println("점수 입력 (1~100)>");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch (score){
            case 100: case 99: case 98: case 97: case 96: case 95:
                System.out.println("A+");
                break;
            case 94: case 93: case 92:
                System.out.println("A0");
                break;
            case 91: case 90:
                System.out.println("A-");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
