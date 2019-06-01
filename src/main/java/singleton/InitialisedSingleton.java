package singleton;

public class InitialisedSingleton {
    private static InitialisedSingleton instance = new InitialisedSingleton();
    private InitialisedSingleton(){}

    public static synchronized InitialisedSingleton getIntance() {
        return instance;
    }
}
