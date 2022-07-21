import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer:
        while(true){
            System.out.println("(1)메뉴");
            System.out.println("(2)메뉴");
            System.out.println("(3)메뉴");
            System.out.println("메뉴선택 >>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0){
                System.out.println("종료");
                break;
            } else if (! (1<= menu && menu <= 3)) {
                System.out.println("잘못선택함");
                continue;
            }
            for(;;){
                System.out.println("계산할 값 입력 (종료 0 , 전체종료 99) >>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if(num==0)
                    break;
                if(num==99)
                    break outer;

                switch (menu){
                    case 1:
                        System.out.println("1메뉴");
                        break;
                    case 2:
                        System.out.println("2메뉴");
                        break ;
                    case 3:
                        System.out.println("3메뉴");
                        break ;
                }
            }
        }
    }
}
