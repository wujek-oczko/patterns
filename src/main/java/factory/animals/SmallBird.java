package factory.animals;

public class SmallBird implements Animal {
    public void move() {
        System.out.println("I am flying"  + this.getClass());
    }
}
