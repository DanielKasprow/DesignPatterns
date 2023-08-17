package CreationalDesignPatterns.Factory.AbstractFactoryMethod.challenge;

interface BollywoodMovieInterface {
    void getMovieName();
}

class BollywoodComedyMovie implements BollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Comedy Movie");
    }
}
class BollywoodActionMovie implements BollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println(this.getClass().getInterfaces()[0].getSimpleName() + " Action Movie");
    }
}
