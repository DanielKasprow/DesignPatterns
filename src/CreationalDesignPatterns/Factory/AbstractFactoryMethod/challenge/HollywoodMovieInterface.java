package CreationalDesignPatterns.Factory.AbstractFactoryMethod.challenge;

interface HollywoodMovieInterface {
    void getMovieName();
}

class HollywoodComedyMovie implements HollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood Comedy Movie");
    }
}
class HollywoodActionMovie implements HollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood Action Movie");
    }
}
