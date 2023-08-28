package BehavioralDesignPatterns.Command.challenge;

class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Google", 100);

        BuyingStock buyingStock = new BuyingStock(stock);
        SellingStock sellingStock = new SellingStock(new Stock("youtube", 50));

        BrokerInvoker brokerInvoker = new BrokerInvoker();
        brokerInvoker.takeOrder(buyingStock);
        brokerInvoker.takeOrder(sellingStock);

        brokerInvoker.placeOrders();

    }
}
