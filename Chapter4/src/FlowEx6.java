import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력 :");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
                System.out.println("가을");
            case 11:
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
            default:
                System.out.println("제대로 입력할것");
        }
    }
}
