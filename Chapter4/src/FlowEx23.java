public class FlowEx23 {
    public static void main(String[] args) {
        int i=5;

        while(i--!=0){ //i 가 후위형이므로 문장 실행후 i값 감소
            System.out.println(i );
        }

        while(--i !=0){
            System.out.println(i);
            System.out.println(i);
        }
    }
}
