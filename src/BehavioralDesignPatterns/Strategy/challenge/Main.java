package BehavioralDesignPatterns.Strategy.challenge;

class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy add = new Add();
        Strategy subtraction = new Subtraction();
        Strategy multiplication = new Multiplication();

        System.out.println(context.executeStrategy(add, 10, 5));
        System.out.println(context.executeStrategy(subtraction,10, 5));
        System.out.println(context.executeStrategy(multiplication,10, 5));
    }
}
