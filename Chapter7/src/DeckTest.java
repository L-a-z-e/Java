public class DeckTest {
    public static void main(String[] args) {

        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);
        d.shuffle();
        c = d.pick(0);
        System.out.println(c); // sout을 썼는데 toString 오버라이딩

    }
}

class Deck {
    final int CARD_AMOUNT = 52; //카드 총 개수
    Card cardArray[] = new Card[CARD_AMOUNT];

    Deck(){
        int i = 0;
        for(int k=Card.KIND_MAX ; k > 0 ; k--){
            for(int j = 1 ; j <= Card.NUM_MAX ; j++)
                cardArray[i++] = new Card(k, j);
        }
    }

    Card pick(int index){
        return cardArray[index];
    }

    Card pick() {
        int index = (int)(Math.random() * CARD_AMOUNT);
        return cardArray[index];
    }

    void shuffle() {
        for ( int i = 0 ; i < cardArray.length ; i++ ) {
            int randomNumber = (int)(Math.random()*CARD_AMOUNT);

            Card temp = cardArray[i];
            cardArray[i] = cardArray[randomNumber];
            cardArray[randomNumber] = temp;
        }
    }

}

class Card {
    // Class Member
    static final int KIND_MAX = 4 ; // 카드 종류 수
    static final int NUM_MAX = 13; // 카드 무늬별 수

    static final int SPADE = 1;
    static final int DIAMOND = 2;
    static final int HEART = 3;
    static final int CLOVER = 4;

    // Instance Member
    int kind;
    int number;

    Card() {
        this(SPADE,1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String[] kinds = {"", "SPADE", "DIAMOND", "HEART", "CLOVER"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kind] + " number : " + numbers.charAt(this.number);
    }
}
