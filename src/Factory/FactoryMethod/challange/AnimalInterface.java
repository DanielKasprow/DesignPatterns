package Factory.FactoryMethod.challange;

interface AnimalInterface {
    void walk();
    void eat();
}
class Duck implements AnimalInterface {

    @Override
    public void walk() {
        System.out.println("Duck walk");

    }

    @Override
    public void eat() {
        System.out.println("Duck eat");

    }
}
class Tiger implements AnimalInterface {

    @Override
    public void walk() {
        System.out.println("Tiger walk");

    }

    @Override
    public void eat() {
        System.out.println("Tiger eat");

    }
}

