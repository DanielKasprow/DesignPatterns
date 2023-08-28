package BehavioralDesignPatterns.Command.challenge;

interface Order {
    void execute();
}

class BuyingStock implements Order {
    private Stock receiver;

    public BuyingStock(final Stock receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.buy();
    }
}

class SellingStock implements Order {
    private Stock receiver;

    public SellingStock(final Stock receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sell();
    }
}