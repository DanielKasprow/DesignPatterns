package BehavioralDesignPatterns.Command.challenge;

public class Stock {
    private String name;
    private int quantity;

    public Stock(final String name, final int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Stock [ Name: "+name+ " , Quantity: " + quantity +" ] bought");
    }
    public void sell() {
        System.out.println("Stock [ Name: "+name+" , Quantity: " + quantity +" ] sold");

    }
}

