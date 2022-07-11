import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        System.out.println("숫자 입력: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();;

        if(input == 0){
            System.out.println("입력한 숫자는 0입니다.");
        }else{
            System.out.println("입력한 숫자는 " + input + "입니다.");
        }
    }
}
