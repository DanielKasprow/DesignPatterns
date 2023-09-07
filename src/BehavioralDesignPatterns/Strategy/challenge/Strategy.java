package BehavioralDesignPatterns.Strategy.challenge;

interface Strategy {
    int performOperation(int a, int b);
}
class Add implements Strategy{

    @Override
    public int performOperation(final int a, final int b) {
        return a + b;
    }
}
class Subtraction implements Strategy{

    @Override
    public int performOperation(final int a, final int b) {
        return a - b;
    }
}
class Multiplication implements Strategy{

    @Override
    public int performOperation(final int a, final int b) {
        return a * b;
    }
}