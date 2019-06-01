package factory;

import factory.animals.*;

public class MammalFactory extends AbstractAnimalFactory {
    Animal createAnimal(String animalKind) {
        if (animalKind.equals("BigMammal")) {
            return new BigMammal();
        } else {
            return new SmallMammal();
        }
    }
}
