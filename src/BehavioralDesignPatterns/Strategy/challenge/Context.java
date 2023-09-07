package BehavioralDesignPatterns.Strategy.challenge;

class Context {
    private Strategy strategy;

    public int executeStrategy(Strategy strategy,int a, int b){
        return strategy.performOperation(a,b);
    }

}
