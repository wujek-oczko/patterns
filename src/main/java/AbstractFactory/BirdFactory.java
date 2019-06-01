package AbstractFactory;

import AbstractFactory.animals.*;

public class BirdFactory extends AbstractAnimalFactory {
    Animal createAnimal(String animalKind) {
        if (animalKind.equals("BigBird")) {
            return new BigBird();
        } else {
            return new SmallBird();
        }
    }
}
