class Audio extends Product{
    Audio(){super(50);}
    public String toString(){ return "Audio1";}
}
public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.purchasedProduct();
    }
}
