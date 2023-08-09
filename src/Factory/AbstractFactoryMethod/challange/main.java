package Factory.AbstractFactoryMethod.challange;

class Main {
    public static void main(String[] args) throws Exception {
        MovieFactoryInteface hollywoodFactory = FactoryProducer.getFactory("Hollywood");
        MovieFactoryInteface bollywoodFactory = FactoryProducer.getFactory("Bollywood");

        HollywoodMovieInterface hollywoodAction = hollywoodFactory.getHollywood("Action");
        HollywoodMovieInterface hollywoodComedy = hollywoodFactory.getHollywood("Comedy");

        BollywoodMovieInterface bollywoodAction = bollywoodFactory.getBollywood("Action");
        BollywoodMovieInterface bollywoodComedy = bollywoodFactory.getBollywood("Comedy");

        hollywoodAction.getMovieName();
        hollywoodComedy.getMovieName();

        bollywoodAction.getMovieName();
        bollywoodComedy.getMovieName();
    }
}
