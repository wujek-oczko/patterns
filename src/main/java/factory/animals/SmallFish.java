package factory.animals;

public class SmallFish implements Animal {
    public void move() {
        System.out.println("I am swimming"  + this.getClass());
    }
}
