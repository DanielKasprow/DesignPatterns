package Factory.AbstractFactoryMethod.challange;

public abstract class MovieFactoryInteface
{
    abstract HollywoodMovieInterface getHollywood(String movieName) throws Exception;
    abstract BollywoodMovieInterface getBollywood(String movieName) throws Exception;

}
class HollywoodFactory extends MovieFactoryInteface {
    @Override
    HollywoodMovieInterface getHollywood(String movieName) throws Exception {
        return switch (movieName) {
            case "Action" -> new HollywoodActionMovie();
            case "Comedy" -> new HollywoodComedyMovie();
            default -> throw new Exception("Animal type: " + movieName + " nie istnieje w bazie");
        };
    }
    @Override
    BollywoodMovieInterface getBollywood(String movieName) {
        return null;
    }


}
class BollywoodFactory extends MovieFactoryInteface {
    @Override
    HollywoodMovieInterface getHollywood(String movieName) {
        return null;
    }
    @Override
    BollywoodMovieInterface getBollywood(String movieName) throws Exception {
        return switch (movieName) {
            case "Action" -> new BollywoodActionMovie();
            case "Comedy" -> new BollywoodComedyMovie();
            default -> throw new Exception("Animal type: " + movieName + " nie istnieje w bazie");
        };
    }


}