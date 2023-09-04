package BehavioralDesignPatterns.Mediator.challenge;

class Main {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer buyer1 = new AuctionBuyer(mediator, "Daniel");
        Buyer buyer2 = new AuctionBuyer(mediator, "Patryk");
        Buyer buyer3 = new AuctionBuyer(mediator, "Mirek");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        buyer1.bid(50);
        buyer2.bid(40);
        buyer3.bid(60);
        mediator.findHighestBidder();
        buyer3.cancelTheBid();
        mediator.findHighestBidder();




    }
}
