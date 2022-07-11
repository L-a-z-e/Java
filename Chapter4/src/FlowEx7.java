import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("가위(1), 바위(2), 보(3) 중 하나 입력 :");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random()*3)+1;

        System.out.println("당신은 "+ user);
        System.out.println("상대방은 " + com);

        switch (user-com){
            case 0:
                System.out.println("비김");
                break;
            case 1:
            case -2:
                System.out.println("이김");
                break;
            case -1:
            case 2:
                System.out.println("짐");
                break;

        };
    }
}
