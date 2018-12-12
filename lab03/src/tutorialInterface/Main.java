package tutorialInterface;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Person p1 = new Person();
        c1.move();
        p1.move();
        p1.refill();
        c1.refill();
    }
}
