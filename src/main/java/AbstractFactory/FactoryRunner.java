package AbstractFactory;

import AbstractFactory.animals.Animal;

public class FactoryRunner {
    public static void main(String[] args) {
        AbstractAnimalFactory mammalFactory = FactoryProvider.getFactory(FactoryProvider.Factories.MAMMAL_FACTORY);
        AbstractAnimalFactory birdFactory = FactoryProvider.getFactory(FactoryProvider.Factories.BIRD_FACTORY);
        AbstractAnimalFactory fishFactory = FactoryProvider.getFactory(FactoryProvider.Factories.FISH_FACTORY);
        Animal bigMammal = mammalFactory.createAnimal("BigMammal");
        Animal smallMammal = mammalFactory.createAnimal("SmallMammal");
        Animal bigBird = birdFactory.createAnimal("BigBird");
        Animal smallBird = birdFactory.createAnimal("SmallBird");
        Animal bigFish = fishFactory.createAnimal("BigFish");
        Animal smallFish = fishFactory.createAnimal("SmallFish");

        bigMammal.move();
        smallMammal.move();
        bigBird.move();
        smallBird.move();
        bigFish.move();
        smallFish.move();
    }
}
