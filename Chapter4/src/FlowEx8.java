import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요. (900101-1234567");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);
        System.out.println(gender);

        switch (gender){
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("사람이 아님");
                break;
        }
    }
}
