public class ExceptionEx2 {
    public static void main(String[] args) {
        try{
            System.out.println(0/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("예외 메시지 : " + e.getMessage());
        }
    }
}
