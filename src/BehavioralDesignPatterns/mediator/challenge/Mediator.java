package BehavioralDesignPatterns.mediator.challenge;

import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void addBuyer(Buyer buyer);

    void findHighestBidder();
}

class AuctionMediator implements Mediator {
    private List<Buyer> buyerList;

    public AuctionMediator() {
        this.buyerList = new ArrayList<>();
    }

    @Override
    public void addBuyer(final Buyer buyer) {
        this.buyerList.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for(Buyer buyer: buyerList){
            Buyer b = buyer;
            if(b.getPrice() > maxBid){
                maxBid = b.getPrice();
                winner = b;
            }

        }
        System.out.println("The auction winner is " + winner.getName() +  ". He paid " + winner.getPrice() + "$ for the item.");
        for(Buyer buyer: buyerList){
            Buyer b = buyer;
            b.auctionHasEnded();
        }
    }


}