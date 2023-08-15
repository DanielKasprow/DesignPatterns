package CreationalDesignPatterns.prototype.Challange;

abstract class BasicCar implements Cloneable{
    protected String name;
    protected float price;

    void draw() {
        System.out.println("Car: " + name +", price: " + price);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return  (BasicCar)super.clone();

    }
}

class Nano extends BasicCar implements Cloneable{

    public Nano(float price){
        name = "Nano";
        this.price = price;
    }
    @Override
    public Nano clone() throws CloneNotSupportedException {
        return  (Nano)super.clone();

    }
}
class Ford extends BasicCar implements Cloneable{

    public Ford(float price){
        name = "Ford";
        this.price = price;
    }
    @Override
    public Ford clone() throws CloneNotSupportedException {
        return  (Ford) super.clone();

    }
}