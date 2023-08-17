package CreationalDesignPatterns.prototype.Challenge;


import java.util.Hashtable;

class BasicCarCashe {
    private static Hashtable<String, BasicCar> shapeMap = new Hashtable<String, BasicCar>();

    public static BasicCar getCar(String carName) throws CloneNotSupportedException {
        BasicCar cachedBasicCar = shapeMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void PrototypePatternEx() {
        Nano nano = new Nano(100.0f);
        shapeMap.put(nano.getName(),nano);

        Ford ford = new Ford(200.0f);
        shapeMap.put(ford.getName(),ford);

    }
}
