public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        car = fe;
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive(){
        System.out.println("car-drive");
    }
    void stop(){
        System.out.println("car-stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}