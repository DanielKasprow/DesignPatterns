package CreationalDesignPatterns.Singleton;

public class Singleton {

    // the private reference to the one and only instance
    //private volatile static CreationalDesignPatterns.Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;


    /**
     * The CreationalDesignPatterns.Singleton Constructor
     * Note that it is private!
     * No client can instantiate a CreationalDesignPatterns.Singleton object!
     */

    private Singleton() {}

    private static class SingletonHelper{
        // Nested class is referenced after getInstance() is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance()
    {
        /*if (uniqueInstance == null) {
            synchronized (CreationalDesignPatterns.Singleton.class) {  // we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new CreationalDesignPatterns.Singleton();
                }
            }
        }
        return uniqueInstance;*/

        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
