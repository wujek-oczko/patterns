package factory.animals;

public class BigBird implements Animal {
    public void move() {
        System.out.println("I am flying " + this.getClass());
    }
}
