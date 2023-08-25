package StructuralDesignPatterns.Flyweight.challenge;

public interface PlayerInterface {
    void assignWeapon(String weapon);
    void mission();
}

class Terrorist implements PlayerInterface{
    String task;
    String weapon;


    public Terrorist() {
        task = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " : Task is " + task);
     }
}
class CounterTerrorist implements PlayerInterface{
    String task;
    String weapon;

    public CounterTerrorist() {
        task = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + " : Task is " + task);
    }
}