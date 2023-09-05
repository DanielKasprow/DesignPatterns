package BehavioralDesignPatterns.Observer.challenge;

class Main {
    public static void main(String[] args) {
        CricketData cricketData = new CricketData();

        Observer observer1 = new AverageScore();
        Observer observer2 = new CurrentScore();
        Observer observer3 = new CurrentScore();

        observer1.update(40, 4,4.8f);
        observer2.update(90,2,10.2f);
        observer3.update(90,2,10.2f);

        cricketData.register(observer1);
        cricketData.register(observer2);
        cricketData.register(observer3);

        cricketData.dataChanged();
        cricketData.unregister(observer2);
        cricketData.dataChanged();

    }
}
