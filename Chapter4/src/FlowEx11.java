import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.println("주민번호 (111111-2222222");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                switch (gender) {
                    case '1':
                        System.out.println("2000년 이전 출생 남성");
                        break;
                    case '3':
                        System.out.println("2000년 이후 출생 여성");
                        break;
                }
                break;
            case '2':
            case '4':
                switch (gender) {
                    case '2':
                        System.out.println("2000년 이전 출생 여성");
                        break;
                    case '4':
                        System.out.println("2000년 이후 출생 여성");
                        break;
                }
                break;
            default:
                System.out.println("사람이 아님");
                break;

        }
    }
}
