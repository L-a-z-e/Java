class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color){
        this(color,"auto",4);
    }
    Car(String color, String gearType, int door){
        this.color = color; // 여기서 color = color 로 하면 둘다 지역변수로 간주됨 매개변수가 String c 이고 color = c 라면 됨
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("car1 : " + c1.color + " " + c1.gearType + " " + c1.door + "\n");
        System.out.println("car2 : " + c2.color + " " + c2.gearType + " " + c2.door + "\n");
    }

}
