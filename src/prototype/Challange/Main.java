package prototype.Challange;

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCarCashe.PrototypePatternEx();

        BasicCar nano = BasicCarCashe.getCar("Nano");
        BasicCar ford = BasicCarCashe.getCar("Ford");

        nano.draw();
        ford.draw();
    }
}
