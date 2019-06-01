package factory.animals;

public class BigMammal implements Animal {

    public void move() {
        System.out.println("I am walking"  + this.getClass());
    }
}
