package AbstractFactory.animals;

public class BigFish implements Animal {
    public void move() {
        System.out.println("I am swimming  " + this.getClass());
    }
}
