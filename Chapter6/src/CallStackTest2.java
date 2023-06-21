public class CallStackTest2 {
        public static void main(String[] args) {
            System.out.println("main(String[] args) 시작"); // 1 - JVM에 의해서 main method 호출
            firstMethod(); //  main method 에서 first method 호출
            System.out.println("main(String[] args) 종료"); // 6
        }

        static void firstMethod(){
            System.out.println("firstMethod() 시작"); // 2
            secondMethod(); // fisrt method 에서 second method 호출
            System.out.println("firstMethod() 종료"); // 5
        }

        static void secondMethod(){
            System.out.println("secondMethod() 시작"); // 3
            System.out.println("secondMethod() 종료"); // 4
        }

}
