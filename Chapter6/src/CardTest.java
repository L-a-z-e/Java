public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card's height : " + Card.height);
        System.out.println("Card's width  : " + Card.width);

        Card c1 = new Card();
        c1.kind = "Heart"; // 인스턴스 변수 설정
        c1.number = 1;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 2;

        System.out.printf("c1 의 종류는 %s 숫자는 %d 높이는 %d 넓이는 %d 입니다. %n",c1.kind, c1.number, c1.height, c1.width); // 인스턴스변수 + 전역변수
        System.out.printf("c2 의 종류는 %s 숫자는 %d 높이는 %d 넓이는 %d 입니다. %n",c2.kind, c2.number, c2.height, c2.width);

        c1.height = 200; // Card.height, c1.height , c1.width 모두 같은 주소를 가리킴 (전역변수)
        c1.width = 300;

        System.out.printf("c1 의 종류는 %s 숫자는 %d 높이는 %d 넓이는 %d 입니다. %n",c1.kind, c1.number, c1.height, c1.width);
        System.out.printf("c2 의 종류는 %s 숫자는 %d 높이는 %d 넓이는 %d 입니다.",c2.kind, c2.number, c2.height, c2.width);

    }
}
