package AbstractFactory;

public class FactoryProvider {
    public enum Factories {
        MAMMAL_FACTORY,
        BIRD_FACTORY,
        FISH_FACTORY
    }

    public static AbstractAnimalFactory getFactory(Factories factoryType) {
        switch (factoryType) {
            case MAMMAL_FACTORY:
                return new MammalFactory();
            case BIRD_FACTORY:
                return new BirdFactory();
            case FISH_FACTORY:
                return new FishFactory();
            default:
                throw new RuntimeException("Factory unsuppoerted");
        }
    }
}
