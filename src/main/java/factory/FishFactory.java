package factory;

import factory.animals.Animal;
import factory.animals.BigFish;
import factory.animals.SmallFish;

public class FishFactory extends AbstractAnimalFactory {
    Animal createAnimal(String animalKind) {
        if (animalKind.equals("BigFish")){
            return new BigFish();
        } else {
            return new SmallFish();
        }

    }
}
