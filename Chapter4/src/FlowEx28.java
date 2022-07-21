import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0 , answer = 0;

        answer = (int) (Math.random()*100)  + 1;
        System.out.println(answer);
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("숫자 입력 1~100 >");
            input = scanner.nextInt();
            if (input > answer){
                System.out.println("큼");
            } else if (input < answer) {
                System.out.println("작음");
            }
        }while( input != answer);
        System.out.println("정답");
    }
}
