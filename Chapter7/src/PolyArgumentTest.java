class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product(){}
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString() { return "TV"; }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){ return "Computer";}
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "를 구입");

    }

    void purchasedProduct(){
        int sum = 0;
        String itemList = "";

        for (Product product : item) {
            if (product == null)
                break;
            sum += product.price;
            itemList += product + ", "; // str에 객체를 더하는데 toString() 메서드를 호출한다?...?
            System.out.println(product);
        }
        System.out.println(sum);
        System.out.println(itemList);
    }
}
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("남은돈" + b.money);
        System.out.println("포인트" + b.bonusPoint);
    }
}
