package singleton;

public class MySingleton {
    private static MySingleton instance;
    private MySingleton(){}

    public static MySingleton getIntance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
