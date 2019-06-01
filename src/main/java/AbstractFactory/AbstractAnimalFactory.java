package AbstractFactory;

import AbstractFactory.animals.Animal;

public abstract class AbstractAnimalFactory {

    abstract Animal createAnimal(String animalKind);
}
