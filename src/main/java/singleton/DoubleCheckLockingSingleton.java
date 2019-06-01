package singleton;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;
    private DoubleCheckLockingSingleton(){}

    public static synchronized DoubleCheckLockingSingleton getIntance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
