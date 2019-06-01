package singleton;

public class SynchronisedSingleton {
    private static SynchronisedSingleton instance;
    private SynchronisedSingleton(){}

    public static synchronized SynchronisedSingleton getIntance() {
        if (instance == null) {
            instance = new SynchronisedSingleton();
        }
        return instance;
    }
}
