import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("(1)");
            System.out.println("(2)");
            System.out.println("(3)");
            System.out.println("선택 >");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0){
                System.out.println("종료");
                break;
            } else if (! ( 1 <= menu && menu <= 3)){
                System.out.println("종료는 0");
            }
            System.out.println("선택" + menu);
        }
    }
}
