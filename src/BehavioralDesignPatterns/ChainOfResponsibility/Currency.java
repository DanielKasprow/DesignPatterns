package BehavioralDesignPatterns.ChainOfResponsibility;

public class Currency {
    private int amount;

    public Currency(int amt) {
        amount = amt;
    }

    public int getAmount() {
        return amount;
    }
}
