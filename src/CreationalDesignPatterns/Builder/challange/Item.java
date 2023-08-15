package CreationalDesignPatterns.Builder.challange;

interface Item {
    String name();

    Packing packing();

    float price();
}

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract float price();
}
class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
interface Packing{
    String pack();
}
class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}