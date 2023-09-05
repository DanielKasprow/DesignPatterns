package BehavioralDesignPatterns.Observer.challenge;


import java.util.ArrayList;
import java.util.List;


interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}
class CricketData implements Subject{
    private int runs,wickets;
    private float overs;
    private List<Observer> observers;

    public CricketData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;

        observersLocal = new ArrayList<>(this.observers);

        for (Observer obj : observersLocal) {
            obj.update(runs, wickets, overs);
        }
        /*        for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }*/
    }
    private int getLatestRuns() {
        return 90;
    }

    private int getLatestWickets() {
        return 2;
    }

    private float getLatestOvers() {
        return (float) 10.2;
    }

    public void dataChanged() {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}