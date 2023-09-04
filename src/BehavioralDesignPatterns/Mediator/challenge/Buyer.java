package BehavioralDesignPatterns.Mediator.challenge;

abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(final Mediator mediator, final String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();

}
class AuctionBuyer extends Buyer{

    public AuctionBuyer(final Mediator mediator, final String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Received message that the auction is over: " + name);
    }
}
