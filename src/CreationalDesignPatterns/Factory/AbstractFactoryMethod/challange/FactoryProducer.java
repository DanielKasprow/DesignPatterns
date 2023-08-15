package CreationalDesignPatterns.Factory.AbstractFactoryMethod.challange;

class FactoryProducer {
    public static MovieFactoryInteface getFactory(String choice) throws Exception {
        return switch (choice) {
            case "Hollywood" -> new HollywoodFactory();
            case "Bollywood" -> new BollywoodFactory();
            default -> throw new Exception("Animal type: " + choice + " nie istnieje w bazie");
        };
    }
}
