package factory;

import factory.animals.Animal;

public abstract class AbstractAnimalFactory {

    abstract Animal createAnimal(String animalKind);
}
