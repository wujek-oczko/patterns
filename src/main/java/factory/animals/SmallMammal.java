package factory.animals;

public class SmallMammal implements Animal {

    public void move() {
        System.out.println("I am walking"  + this.getClass());
    }
}
