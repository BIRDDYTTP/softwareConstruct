package tutorialInterface;

public class Car implements Moveable{
    private String brand;

    @Override
    public void move() {
        System.out.println("Drive");
    }

    @Override
    public void refill() {
        System.out.println("Gas station");
    }
}
