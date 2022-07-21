import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
   int num ;
   int sum = 0;
   boolean flag = true;
   Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력 >");

        while(flag){
            System.out.println(">>");
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0){
                sum += num;
            }else{
                flag = false;
            }

            }
        System.out.println(sum);
        }
}
