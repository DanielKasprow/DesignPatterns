package CreationalDesignPatterns.Factory.FactoryMethod.challange;

public abstract class AnimalFactoryInterface{
    public abstract AnimalInterface GetAnimalType(String type) throws Exception;
}
/*class DuckFactory extends AnimalFactoryInterface{

    @Override
    public AnimalInterface GetAnimalType() {
        return new Duck();
    }
}
class TigerFactory extends AnimalFactoryInterface{

    @Override
    public AnimalInterface GetAnimalType() {
        return new Tiger();
    }
}*/

class AnimalShape  extends AnimalFactoryInterface{
    @Override
    public AnimalInterface GetAnimalType(final String type) throws Exception{
        return switch (type) {
            case "Duck" -> new Duck();
            case "Tiger" -> new Tiger();
            default -> throw new Exception("Animal type: " + type + " nie istnieje w bazie");
        };
    }
}
