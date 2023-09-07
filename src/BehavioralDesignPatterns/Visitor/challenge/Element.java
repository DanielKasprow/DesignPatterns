package BehavioralDesignPatterns.Visitor.challenge;

interface Element {
    void accept(Visitor visitor);
}
class Book implements Element{
    private float price,weight;

    public Book(final float price, final float weight) {
        this.price = price;
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
class CD implements Element{

    private float price,weight;

    public CD(final float price, final float weight) {
        this.price = price;
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
class DVD implements Element{
    private float price,weight;

    public DVD(final float price, final float weight) {
        this.price = price;
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}