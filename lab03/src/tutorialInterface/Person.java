package tutorialInterface;

public class Person implements Moveable {
    private String name;
    @Override
    public void move() {
        System.out.println("walk");
    }

    @Override
    public void refill() {
        System.out.println("Eat a food");
    }
}
