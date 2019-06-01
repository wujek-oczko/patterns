package AbstractFactory;

import AbstractFactory.animals.Animal;
import AbstractFactory.animals.BigFish;
import AbstractFactory.animals.SmallFish;

public class FishFactory extends AbstractAnimalFactory {
    Animal createAnimal(String animalKind) {
        if (animalKind.equals("BigFish")){
            return new BigFish();
        } else {
            return new SmallFish();
        }

    }
}
