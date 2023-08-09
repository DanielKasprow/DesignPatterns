package Factory.FactoryMethod.challange;

class Main {
    public static void main(String[] args) throws Exception {
        //AnimalInterface duck = new DuckFactory().getAnimal();
        //AnimalInterface tiger = new TigerFactory().getAnimal();
        AnimalInterface duck = new AnimalShape().GetAnimalType("Duck");
        AnimalInterface tiger = new AnimalShape().GetAnimalType("Tiger");

        duck.eat();
        duck.walk();
        tiger.eat();
        tiger.walk();
    }


}
